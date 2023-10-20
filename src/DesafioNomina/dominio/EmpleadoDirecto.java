package DesafioNomina.dominio;

public class EmpleadoDirecto extends Empleado{
    protected long salario;

    public EmpleadoDirecto(String nombre,long salario) {
        super(nombre);
        this.salario=salario;
    }

    @Override
    protected long calcularSalario() {
        return salario-calcularAporte();
    }
    protected long calcularSalud(){
        return (long) (this.salario*0.057);

    }
    protected long calcularPension(){
        return (long) (this.salario*0.065);
    }
    protected long calcularAporte(){
        return calcularPension()+calcularSalud();
    }

    @Override
    public String toString() {
        return "EmpleadoDirecto{" +
                "salario=" + salario +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
