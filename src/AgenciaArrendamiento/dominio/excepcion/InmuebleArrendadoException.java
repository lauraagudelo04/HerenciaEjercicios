package AgenciaArrendamiento.dominio.excepcion;

public class InmuebleArrendadoException extends RuntimeException {
    public InmuebleArrendadoException(){
        super("El inmueble está arrendado");
    }
}
