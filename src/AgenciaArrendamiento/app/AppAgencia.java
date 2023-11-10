package AgenciaArrendamiento.app;

import AgenciaArrendamiento.dominio.Agencia;
import AgenciaArrendamiento.dominio.Apartamento;
import AgenciaArrendamiento.dominio.Casa;
import AgenciaArrendamiento.dominio.Lote;

public class AppAgencia {
    public static void main(String[] args) {
        Casa casa = new Casa("89fg");
        Apartamento apartamento = new Apartamento("sd56");
        Lote lote = new Lote("23s");

        Agencia agencia = new Agencia("BEMSA");

        agencia.agregarInmueble(casa);
        agencia.agregarInmueble(apartamento);
        agencia.agregarInmueble(lote);

        agencia.arrendarInmueble("89fg");


        System.out.println(agencia.getArrendablesDisponibles());
    }
}

