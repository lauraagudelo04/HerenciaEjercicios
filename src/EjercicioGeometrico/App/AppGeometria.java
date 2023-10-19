package EjercicioGeometrico.App;

import EjercicioGeometrico.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class AppGeometria {
    public static void main(String[] args) {
        Circulo circulo=new Circulo(5);
        Cuadrilatero cuadrado= new Cuadrilatero(4,4);
        TrianguloRectangulo trianguloRectangulo= new TrianguloRectangulo(100,30);
       // TrianguloIsosceles trianguloIsosceles= new TrianguloIsosceles(100,30,160);
        FiguraGeometrica figurageometrica= new Cuadrilatero(5,8);/*FiguraGeometrica() {
            @Override
            public double calcularArea() {
                return 0;
            }

            @Override
            public double calcularPerimetro() {
                return 0;
            }
        };*/


        List<FiguraGeometrica> figuras= new ArrayList<>();
        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(trianguloRectangulo);
        //figuras.add(trianguloIsosceles);

        figuras.forEach(figura -> {
            System.out.println(figura);
            System.out.println("Área figra: " + figura.calcularArea());
            System.out.println("Perímetro figura: " + figura.calcularPerimetro());
        });
    }

        }