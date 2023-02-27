package poo.actividad.pkg1;

import java.util.Scanner;

public class MadredeJuan {

    public static void main(String[] args) {
        
        int edjuan, edalberto, edana, edmadre;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan: ");
        edjuan = leer.nextInt();
        edalberto = (2*edjuan)/3;
        edana = (4*edjuan)/3;
        edmadre = edjuan+edalberto+edana;
        
        System.out.println("La edad de Juan es de "+edjuan+" años, la de Alberto es de "+edalberto+
                " años, la de Ana es de "+edana+" años y la de la madre es de "+edmadre+" años.");
    }
}
