package antivirus.dominio;

public class DocWord extends Documento{
    protected String contenido;

    public DocWord(String nombre, double tamanio, String contenido) {
        super(nombre, tamanio);
        this.contenido=contenido;
    }

    @Override
    public boolean tieneVirus() {
        return contenido.contains("🦠");
    }
}
