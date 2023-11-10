package DesafioNomina.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleadosNomina=new ArrayList<>();

    public void calcularNomina() {
        for (Empleado empleado : empleadosNomina) {
            System.out.println(empleado);
            if (empleado instanceof Vendedor) {
                System.out.println("Comision: " + ((Vendedor) empleado).calcularComision());
            }
            System.out.println("Nomina: " + empleado.calcularSalario() + "\n");
        }
    }

    public void listarDirectos() {
        System.out.println("La lista de directos es: \n");
        for (Empleado empleado : empleadosNomina) {
            if (empleado instanceof EmpleadoDirecto) {
                System.out.println(empleado);
            }
        }
    }

    public void listarFreelancers() {
        System.out.println("\nLa lista de freelancers es: \n");
        for (Empleado empleado : empleadosNomina) {
            if (empleado instanceof EmpleadoFreelance) {
                System.out.println(empleado);
            }
        }
    }

    public void listarPromotores(){
        System.out.println("\nLa lista de promotores es: \n");
        for(Empleado empleado: empleadosNomina){
            if (empleado instanceof Promotor){
                System.out.println(empleado);
            }
        }
    }

    public List<Empleado> getEmpleadosNomina() {
        return empleadosNomina;
    }
}