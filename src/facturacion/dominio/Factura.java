package facturacion.dominio;

import java.time.LocalDateTime;

public abstract class Factura {
    private static int facturasCreadas;//Se inicializa en 0 antes de sumar,
    // si le quito el static  sera  una variable de objeto
    protected int numero;
    protected String cliente;
    protected long valor;
    protected LocalDateTime fecha;

    public Factura(String cliente, long valor) {
        facturasCreadas++;

        this.numero=facturasCreadas;

        //-----opcion 1-------
        //Factura.facturasCreadas=Factura.facturasCreadas+1;
        //this.numero=facturasCreadas;
        //------opcion2
        //this.numero=++facturasCreadas; //Incrementa en 1, el ++ al final es asigne el valor y luego aumente
        //++ adelante incremente y luego asigne

        this.cliente = cliente;

        this.valor = valor;
        this.fecha = LocalDateTime.now();// retorna la fecha actual

    }

    @Override
    public String toString() {
        return "Factura{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", fecha=" + fecha +
                '}';
    }

    public abstract long calcularTotal();
}
