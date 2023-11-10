package DesafioNomina.app;

import DesafioNomina.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class AppNomina {
    public static void main(String[] args) {
        Nomina nomina=new Nomina();

        Empleado empleado=new EmpleadoDirecto("David",3_975_000);
        Empleado empleado1=new EmpleadoDirecto("Juan",4_840_000);
        Empleado empleado2=new Vendedor("Julian",2_050_000,45_510_000);
        Empleado empleado3=new Vendedor("Claudia",1_380_000,35_989_000);
        Empleado empleado4=new EmpleadoFreelance("Johanna",71_000,89);
        Empleado empleado5=new EmpleadoFreelance("Gustavo",42_500,65);
        Empleado empleado6=new Promotor("Pedro",2000,200,77);



        nomina.getEmpleadosNomina().add(empleado);
        nomina.getEmpleadosNomina().add(empleado1);
        nomina.getEmpleadosNomina().add(empleado2);
        nomina.getEmpleadosNomina().add(empleado3);
        nomina.getEmpleadosNomina().add(empleado4);
        nomina.getEmpleadosNomina().add(empleado5);
        nomina.getEmpleadosNomina().add(empleado6);


        System.out.println();
        nomina.calcularNomina();
        nomina.listarDirectos();
        nomina.listarFreelancers();
        nomina.listarPromotores();


    }
}
