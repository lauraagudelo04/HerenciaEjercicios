
package DesafioNomina.dominio;

public class Vendedor extends EmpleadoDirecto {
    protected long ventasDelMes;

    public Vendedor(String nombre, long salario,long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes=ventasDelMes;
    }

    protected long calcularComision(){
        if(this.salario<=1_500_000){
            return this.ventasDelMes*45/1000;
        }
        else{
            return this.ventasDelMes*35/1000;
        }
    }

    @Override
    protected long calcularSalario() {
        long salarioMenosAportes=this.salario-calcularAporte();

        return (salarioMenosAportes+calcularComision());
    }
}