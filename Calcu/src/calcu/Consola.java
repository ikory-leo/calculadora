/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Consola {
        public static void conso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    double x;
    Calcu miCalcu;
    int r=0;
    double numeroOne;
    double numeroTwo;
    Scanner miEscanner=new Scanner(System.in);
    void Conso(){
    do {    
    System.out.println("ingrese Su opción");
    System.out.println("1.)   suma");
    System.out.println("2.)   resta");
    System.out.println("3.)   multiplicación");
    System.out.println("4.)   división");
    r= miEscanner.nextInt();
    System.out.println("Ingrese numero 1");
    numeroOne= miEscanner.nextInt();
    System.out.println("Ingrese numero 2");
    numeroTwo= miEscanner.nextInt();
    System.out.println("El resultado es:   ");

    switch(r)
    {
            case 1:
            System.out.println(miCalcu.suma(numeroOne, numeroTwo));
            break;
             case 2:
            System.out.println(miCalcu.resta(numeroOne, numeroTwo));
            break;
             case 3:
            System.out.println(miCalcu.multiplicacion(numeroOne, numeroTwo));
            break;
             case 4:
            System.out.println(miCalcu.division(numeroOne, numeroTwo));
            break;
    }
    }while (r!=5);
    
    
    
    }
    
}
