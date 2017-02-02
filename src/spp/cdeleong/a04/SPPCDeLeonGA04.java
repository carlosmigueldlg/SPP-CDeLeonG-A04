/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdeleong.a04;
import java.util.Scanner;
/**
 *
 * @author CarlosMiguel
 */
public class SPPCDeLeonGA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Variables
       int opcion;
       Scanner kb=new Scanner (System.in);
       double lado, resultado;
      
        // Desplegamos menu
        System.out.println(" Calculadora trigonometrica");
        System.out.println("Introduzca la opcion que desee");
        System.out.println("1 Calcular seno ");
        System.out.println("2 Calcular coseno");
        System.out.println("3 Calcular tangente");
        System.out.println("Salir");
        opcion = kb.nextInt();
        
        
        switch (opcion){
            case 1:
                double anguloseno, senoCalculado;
                System.out.println("Introducir angulo del cual se desea calcular el seno");
                Scanner entradaAnguloseno = new Scanner(System.in);
                anguloseno = entradaAnguloseno.nextDouble();
                senoCalculado= Math.sin(anguloseno);
                System.out.println("El seno del angulo" + anguloseno + "es" + senoCalculado);
                break;
                
            case 2:
                double anguloCoseno, cosenoCalculado;
                System.out.println("Introducir el angulo del cual se desea calcular el coseno");
                Scanner entradaAngulocoseno = new Scanner(System.in);
                anguloCoseno = entradaAngulocoseno.nextDouble();
                cosenoCalculado= Math.sin(anguloCoseno);
                System.out.println("El coseno del angulo: " + anguloCoseno + "es" + cosenoCalculado);
                break;
                
            case 3:
                double anguloTangente, tangenteCalculado;
                System.out.println("Introducir el angulo del cual se desea calcular la tangente");
                Scanner entradaAngulotangente= new Scanner(System.in);
                anguloTangente= entradaAngulotangente.nextDouble();
                tangenteCalculado = Math.sin(anguloTangente);
                System.out.println("La tangente del angulo" + anguloTangente +"es" + tangenteCalculado);
                break;
        }
    }
}


        
        
        
                
                
              
               
                        
    
    
