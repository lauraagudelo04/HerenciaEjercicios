package EjercicioGeometrico.dominio;

public class TrianguloRectangulo extends Triangulo{
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return(this.base*this.altura/2);
    }

    //Hallar la hipotenusa con pitagoras
    @Override
    public double calcularPerimetro() {
        return 0;
    }



    /* public TrianguloRectangulo(int base,int hipotenusa, int altura){
        super(base,hipotenusa,altura);
    }

    @Override
    public double calcularArea() {
        return super.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return (this.getBase()+this.getAltura()+this.getHipotenusa());
    }*/
}
