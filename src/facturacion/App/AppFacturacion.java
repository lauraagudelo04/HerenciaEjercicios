package facturacion.App;

import facturacion.dominio.Facturacion;

public class AppFacturacion {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Gregorio", 2_000_000);
        facturacion.generarFactura("Alejandro", 300_000);
        facturacion.generarFactura("Andrea", 1_000_000);
        facturacion.generarFactura("Sofia", 950_000);

        facturacion.calcularTotales();
    }
}
