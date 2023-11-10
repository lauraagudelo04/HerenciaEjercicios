package antivirus.dominio;

public class DocPdf extends Documento {
    public DocPdf(String nombre, double tamanio) {
        super(nombre, tamanio);
    }

    @Override
    public boolean tieneVirus() {
        return !nombre.endsWith(".pdf");
    }
}
