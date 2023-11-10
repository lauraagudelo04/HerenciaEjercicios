package Veterinaria.dominio.excepcion;

public class MascotaNoOperableException extends RuntimeException{
    public MascotaNoOperableException(){
        super("La mascota no se puede operar");
    }
}
