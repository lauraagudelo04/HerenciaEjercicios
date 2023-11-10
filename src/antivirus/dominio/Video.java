package antivirus.dominio;

public class Video implements Viruseable {
    public static final int CALIDAD_MINIMA = 1080;
    private String nombre;
    private int calidad;

    public Video(String nombre, int calidad) {
        this.nombre = nombre;
        this.calidad = calidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean tieneVirus() {
        return calidad<CALIDAD_MINIMA;
    }
}
