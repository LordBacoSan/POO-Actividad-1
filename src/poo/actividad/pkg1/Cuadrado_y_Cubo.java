package poo.actividad.pkg1;

import java.util.Scanner;

public class Cuadrado_y_Cubo {

    public static void main(String[] args) {
        
        double numero, cuadrado, cubo;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        numero = leer.nextDouble();
        
        cuadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);
        
        System.out.println(numero+" elevado al cuadrado es: "+cuadrado);
        System.out.println(numero+" elevado al cubo es: "+cubo);        
    }
}
