package AgenciaArrendamiento.dominio.excepcion;

public class InmuebleInexistenteException extends RuntimeException{
    public InmuebleInexistenteException(){
        super("El inmueble buscado no existe");
    }
}
