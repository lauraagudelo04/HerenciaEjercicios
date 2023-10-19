package facturacion.dominio;

import java.time.LocalDateTime;

public class FacturaPlana extends Factura {

    public FacturaPlana(String cliente, long valor) {
        super(cliente, valor);
    }

    @Override
    public long calcularTotal() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "FacturaPlana{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", fecha=" + fecha +
                '}';
    }
}
