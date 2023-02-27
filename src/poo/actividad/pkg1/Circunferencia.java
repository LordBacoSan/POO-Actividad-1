package poo.actividad.pkg1;

import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        
        double radio, area, perimetro;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = leer.nextDouble();
        
        area = Math.PI*Math.pow(radio, 2);
        perimetro = 2*Math.PI*radio;
        
        System.out.println("El área de la circunferencia es de: "+area);
        System.out.println("El perímetro de la circunferencia es de: "+perimetro);
    }
}
