/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consola miCo = new Consola();
        Calcu cal= new Calcu();
        /*
        miCo.miCalcu=cal;
        miCo.Conso();
        */
        Grafica miG= new Grafica();
        miG.miCalGra=cal;
        miG.setVisible(true);
               
        // TODO code application logic here
    }
        // TODO code application logic here
    }
    
