/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Batoi
 */
import java.math; 
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double num1, num2, resultado;
        int opcion;
        
        System.out.print("1.SUMAR");
        System.out.print("2.RESTAR");
        System.out.print("3.MULTIPLICAR");
        System.out.print("4.DIVIDIR");
        System.out.print("5.RAIZ QUADRADA");
        System.out.print("6.POTENCIA");
        
        switch(opcion){
            case 2:
                    System.out.print("Introduce un valor: ");
                    num1=leer.nextDouble();
                    System.out.print("Introduce otro valor: ");
                    num2=leer.nextDouble();
                    resultado=num1-num2;
                    System.out.print(""+num1+" - "+num2+" = "+resultado);
            break;
            case 4:
                    System.out.print("Introduce un valor: ");
                    num1=leer.nextDouble();
                    System.out.print("Introduce otro valor: ");
                    num2=leer.nextDouble();
                    resultado=num1/num2;
                    System.out.print(""+num1+" / "+num2+" = "+resultado);
            break;
            case 6:
                    System.out.print("Introduce la base: ");
                    num1=leer.nextDouble();
                    System.out.print("Introduce la potencia: ");
                    num2=leer.nextDouble();
                    resultado=pow(num1,num2);
                    System.out.print("Resultado = "+resultado);
            break;
        
        }
    }
    
}
