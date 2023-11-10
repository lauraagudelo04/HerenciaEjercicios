package Veterinaria.dominio.excepcion;

public class MascotaOperadaException extends RuntimeException{
    public MascotaOperadaException(){
        super("La mascota ya está operada");
    }
}
