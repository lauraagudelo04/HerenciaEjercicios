package AgenciaArrendamiento.dominio;

public class Casa extends Inmueble implements Arrendable, Hipotecable{
    public Casa(String codigo) {
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
    public void hipotecar() {
        System.out.println("Se hipotecó");

    }

    @Override
    public String toString() {
        System.out.println("Casa");
        return super.toString();
    }
}
