package antivirus.dominio;

public class DocExcel extends  Documento{
    private static final int TAMAÑO_MINIMO=20;

    public DocExcel(String nombre, double tamanio) {
        super(nombre, tamanio);
    }

    @Override
    public boolean tieneVirus() {
        return tamanio<TAMAÑO_MINIMO;
    }
}
