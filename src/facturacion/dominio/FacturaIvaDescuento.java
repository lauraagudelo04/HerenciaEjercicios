package facturacion.dominio;

import java.time.LocalDateTime;

public class FacturaIvaDescuento extends FacturaIva{

    private short porcentajeDescuento;
    public FacturaIvaDescuento(String cliente, long valor, short iva,short porcentajeDescuento) {
        super(cliente, valor, iva);
        this.porcentajeDescuento=porcentajeDescuento;
    }

    @Override
    public long calcularTotal() {
        return super.calcularTotal()-this.calcularDescuento();
    }

    public long calcularDescuento(){
        return (this.valor*this.porcentajeDescuento)/100;
    }

    @Override
    public String toString() {
        return "FacturaIvaDescuento{" +
                "porcentajeDescuento=" + porcentajeDescuento +
                ", numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", fecha=" + fecha +
                '}';
    }
}
