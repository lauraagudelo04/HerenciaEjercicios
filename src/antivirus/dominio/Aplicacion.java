package antivirus.dominio;

public class Aplicacion implements  Viruseable{
    private String nombre;

    public Aplicacion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean tieneVirus() {
        return !nombre.endsWith(".exe");
    }
}
