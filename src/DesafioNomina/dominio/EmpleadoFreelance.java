package DesafioNomina.dominio;

public class EmpleadoFreelance extends Empleado{
    protected long valorHora;
    protected int horasTrabajadas;

    public EmpleadoFreelance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas=horasTrabajadas;
        this.valorHora=valorHora;
    }
    @Override
    protected long calcularSalario() {
        return horasTrabajadas*valorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoFreelance{" +
                "valorHora=" + valorHora +
                ", horasTrabajadas=" + horasTrabajadas +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
