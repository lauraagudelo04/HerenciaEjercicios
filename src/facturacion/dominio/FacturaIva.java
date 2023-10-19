package facturacion.dominio;

import java.time.LocalDateTime;

public class FacturaIva extends Factura{
    private short iva;

    public FacturaIva(String cliente, long valor,short iva) {
        super(cliente, valor);
        this.iva=iva;
    }

    @Override
    public long calcularTotal() {
        return this.valor+this.calcularIva();
    }

    public long calcularIva(){
        return (this.valor*iva)/100;//Encontrar el valor del iva
    }

    @Override
    public String toString() {
        return "FacturaIva{" +
                "iva=" + iva +
                ", numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", fecha=" + fecha +
                '}';
    }
}
