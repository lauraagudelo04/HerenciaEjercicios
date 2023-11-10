package AgenciaArrendamiento.dominio;

public  class Apartamento extends Inmueble implements Arrendable {

    public Apartamento(String codigo) {
        super(codigo);
    }

    @Override
    public void arrendar() {
        this.arrendado=true;
    }

    @Override
    public void devolver() {
       this.arrendado=false;

    }

    @Override
    public String toString() {
        System.out.println("Apartamento");
        return super.toString();
    }
}
