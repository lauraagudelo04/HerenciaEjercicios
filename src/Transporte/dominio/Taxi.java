package Transporte.dominio;

public class Taxi extends Carro{
    private String empresa;
    private int capacidad;
    private int pasajerosActuales;

    public Taxi(String marca, String modelo,String empresa) {
        super(marca, modelo);
        this.empresa=empresa;
    }

    @Override
    public void acelerar(double cantidad) {
        super.acelerar(cantidad);
        System.out.println("Acelerando como Taxi 🚕");
    }

    public void subirPasajero() {
        if (this.pasajerosActuales < capacidad) {
            this.pasajerosActuales++;
        }
    }

    public void bajarPasajero() {
        if (this.pasajerosActuales > 0) {
            this.pasajerosActuales--;
        }
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "empresa='" + empresa + '\'' +
                ", capacidad=" + capacidad +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

}
