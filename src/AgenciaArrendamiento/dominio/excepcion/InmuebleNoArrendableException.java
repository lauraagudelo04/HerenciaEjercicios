package AgenciaArrendamiento.dominio.excepcion;

public class InmuebleNoArrendableException extends RuntimeException{
    public InmuebleNoArrendableException(){
        super("El inmueble no es arrendable");
    }
}
