package Transporte.dominio;

public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int anioModelo;
    protected double velocidad;

    public void acelerar(double cantidad) {
        this.velocidad += cantidad;
        System.out.println("Acelerando como vehiculo");
    }

    public void frenar(double cantidad) {
        this.velocidad -= cantidad;
        System.out.println("Frenando como vehiculo");
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getAnioModelo() {
        return anioModelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
