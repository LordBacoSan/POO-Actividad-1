package poo.actividad.pkg1;

import java.util.Scanner;

public class Valor_de_la_Suma {
    
    public static void main(String[] args) {
        
        double suma=0, x, y;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de X: ");
        x = leer.nextDouble();
        System.out.println("Ingrese el valor de Y: ");
        y = leer.nextDouble();
        
        suma = suma+x;
        System.out.println("El valor de la suma es de: "+suma);
        
        x = x+Math.pow(y, 2);
        suma = suma+(x/y);
        System.out.println("El valor de la suma es de: "+suma);                
    }
}
