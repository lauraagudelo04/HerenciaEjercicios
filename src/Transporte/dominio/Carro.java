package Transporte.dominio;

public class Carro extends Vehiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(double cantidad) {
        this.velocidad += cantidad;
        System.out.println("Acelerando como Carro 🚙");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
