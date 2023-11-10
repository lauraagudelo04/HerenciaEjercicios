package AgenciaArrendamiento.dominio;

public class Lote extends Inmueble {
    public Lote(String codigo) {
        super(codigo);
    }

    @Override
    public String toString() {
        System.out.println("Lote");
        return super.toString();
    }
}
