package facturacion.dominio;

import java.util.ArrayList;
import java.util.List;

public class Facturacion {
    private List<Factura> facturas;

    public Facturacion(){
        this.facturas= new ArrayList<>();

    }

    public void generarFactura(String cliente, long valor){
        Factura factura=null;

        if (cliente.toUpperCase().startsWith("A")&& valor>=1_000_000){
            factura=new FacturaIvaDescuento(cliente,valor, (short) 19, (short) 20);
        } else if (valor>=1_000_000) {
            factura=new FacturaIva(cliente,valor, (short) 19);
        } else if (cliente.toUpperCase().startsWith("A")) {
            factura=new FacturaConDescuento(cliente,valor, (short) 20);
        }
        else {
            factura=new FacturaPlana(cliente,valor);
        }

        this.facturas.add(factura);
    }

    public void calcularTotales(){
        this.facturas.forEach(factura ->{
            System.out.println(factura);
            System.out.println(factura.calcularTotal());
        });
    }

    @Override
    public String toString() {
        return "Facturacion{" +
                "facturas=" + facturas +
                '}';
    }
}
