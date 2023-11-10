package Veterinaria.dominio;

public class MascotaApta extends Mascota implements Operable{
    public MascotaApta(String nombreMascota, String sexo, int edad) {
        super(nombreMascota, sexo, edad);
    }

    @Override
    public void operar() {
        esterilizado = true;
    }
}
