package Transporte.app;

import Transporte.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class AppTransporte {
    public static void main(String[] args) {
        Vehiculo carro = new Carro("jjj","dff");
        Vehiculo taxi = new Taxi("hyundai","2019","sotra");
        Bicicleta bici = new BicicletaMontana("Trek","2018");


        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(carro);
        vehiculos.add(taxi);
        vehiculos.add(bici);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar(20);
        }
    }
}
