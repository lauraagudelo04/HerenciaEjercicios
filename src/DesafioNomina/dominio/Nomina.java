package DesafioNomina.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    protected String tipoEmpleado;
    protected List<Empleado> empleadosNomina=new ArrayList<>();

    public Nomina(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    protected void calcularNomina(){
    }

    protected void listarDirectos(){

    }

    protected void listarFreelancers(){

    }

}
