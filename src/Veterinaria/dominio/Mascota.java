package Veterinaria.dominio;

public abstract class Mascota {
    protected String nombreMascota;
    protected String sexo;
    protected int edad;
    protected boolean esterilizado;

    public Mascota(String nombreMascota, String sexo, int edad) {
        this.nombreMascota = nombreMascota;
        this.sexo = sexo;
        this.edad = edad;
        this.esterilizado = false;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }
}
