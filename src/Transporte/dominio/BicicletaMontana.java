package Transporte.dominio;

public class BicicletaMontana extends Bicicleta {
    public BicicletaMontana(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(double cantidad) {
        System.out.println("Acelerando como bici de montaña🌳🚲");
    }
}
