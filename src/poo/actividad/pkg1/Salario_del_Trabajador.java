package poo.actividad.pkg1;

import java.util.Scanner;

public class Salario_del_Trabajador {

    public static void main(String[] args) {
        
        double horas_semana, salario_hora, porcentaje_retencion, salario_bruto, salario_neto, retencion_fuente;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de horas trabajadas por semana: ");
        horas_semana = leer.nextDouble();
        
        System.out.println("Ingrese el valor de cada hora: ");
        salario_hora = leer.nextDouble();
        
        System.out.println("Ingrese el porcentaje de retención de la fuente (sin signos de porcentaje/%): ");
        porcentaje_retencion = leer.nextDouble();
        
        salario_bruto = horas_semana*salario_hora;
        retencion_fuente = salario_bruto*(porcentaje_retencion/100);
        salario_neto = salario_bruto-retencion_fuente;
        
        System.out.println("El salario bruto es de: "+salario_bruto);
        System.out.println("La retención de la fuente es de: "+retencion_fuente);
        System.out.println("El salario neto es de: "+salario_neto);
    }  
}
