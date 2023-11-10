package AgenciaArrendamiento.dominio.excepcion;

public class InmuebleNoArrendadoException extends RuntimeException{
    public InmuebleNoArrendadoException(){
        super("El inmueble no está arrendado");
    }
}
