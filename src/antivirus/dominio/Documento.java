package antivirus.dominio;

public abstract class Documento implements Viruseable {
    protected String nombre;
    protected double tamanio;

    public Documento(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }
}
