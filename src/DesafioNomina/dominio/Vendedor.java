
package DesafioNomina.dominio;

public class Vendedor extends EmpleadoDirecto {
    protected long ventasDelMes;
    public static final int VALOR_PORCENTAJE=1_500_000;

    public Vendedor(String nombre, long salario,long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes=ventasDelMes;
    }

    protected long calcularComision(){
        if(this.salario<=VALOR_PORCENTAJE){
            return this.ventasDelMes*45/1000;
        }
        else{
            return this.ventasDelMes*35/1000;
        }
    }

    @Override
    protected long calcularSalario() {
        return (super.calcularSalario()+calcularComision());
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "ventasDelMes=" + ventasDelMes +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}