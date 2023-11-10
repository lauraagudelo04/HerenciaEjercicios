package DesafioNomina.dominio;

public class Promotor extends Empleado{

    protected int volantesRepartidos;
    protected long valorVolante;
    protected int comprasVolante;
    public static final int COMISION_VOLANTE=12_900;

    public Promotor(String nombre, int volantesRepartidos,long valorVolante, int comprasVolante) {
        super(nombre);
        this.comprasVolante=comprasVolante;
        this.valorVolante=valorVolante;
        this.volantesRepartidos=volantesRepartidos;
    }

    @Override
    protected long calcularSalario() {
        long salarioPromotor=(volantesRepartidos*valorVolante)+(COMISION_VOLANTE*comprasVolante);
        return salarioPromotor;
    }

    @Override
    public String toString() {
        return "Promotor{" +
                "volantesRepartidos=" + volantesRepartidos +
                ", valorVolante=" + valorVolante +
                ", comprasVolante=" + comprasVolante +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
