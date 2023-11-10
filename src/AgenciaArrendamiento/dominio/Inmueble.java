package AgenciaArrendamiento.dominio;

public abstract class Inmueble {
    protected  String codigo;
    protected String direccion;
    protected  long valorVenta;
    protected long valorArriendo;
    protected boolean arrendado;

    public Inmueble(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "codigo='" + codigo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", valorVenta=" + valorVenta +
                ", valorArriendo=" + valorArriendo +
                ", arrendado=" + arrendado +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }
}
