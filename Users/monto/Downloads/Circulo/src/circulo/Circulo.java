/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;
import java.util.Scanner;

/**
 *
 * @author monse
 */
public class Circulo {

    final static double PI=3.1416;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
           Scanner s=new Scanner(System.in);
        System.out.println("Introduce el radio:");
        double r=s.nextDouble();
        CalculaArea(r); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    //función para calcular el área
    public static void CalculaArea(double r) {
        double area=(PI*r*r);
	System.out.printf("El valor del área es %f\n",area);
        System.out.printf("El valor del área del circulo es %d/n",Math.round(area));
    }
    
    //función para calcular la longitud
    public static void calcularlongitud(double r)
    {
        double longitudcirculo = (2*PI*r);
        System.out.printf("El valor del área es %f\n", longitudcirculo);
        System.out.printf("El valor de la longitud del circulo es %d/n",Math.round(longitudcirculo));
    }
	
	
	public static void CalculaDiametro(double r)
    {
        double diametro=2*r;
        System.out.printf("El valor del diámetro del círculo es %f\n",diametro);
    }
   
}
