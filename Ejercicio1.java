
import java.util.Scanner;
import java.lang.String;
import java.util.Objects;


public class Ejercicio1

{
    /* convertir de unidades a pulgadas
     : 1 pulgada equivale a 0.0833 pies, 1 pulgada equivale a 2.54 centímetros, 1 legua equivale
       a 190080.02 pulgadas y 1 yarda son 36 pulgadas. El programa deberá recibir la unidad de medida (‘P’ para pie,
      ‘C’ para centímetro, ‘L’ para legua, y ‘Y’ para yarda), y un número a convertir, y que retorne ese número (que está
       en la medida dada) convertido a pulgadas.*/

        /* 1 pulgada equivale a 0.0833 pies
           1 pulgada equivale a 2.54 centímetros,
           1 legua equivale a 190080.02 pulgadas
           1 yarda son 36 pulgadas
           */


     
    
    public static void main(String [] args)
    {
                
        // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
        String unidad_de_medida;
        double numero_a_convertir;
        double numero_convertido;
        
        // Solicitar datos de entrada
        
        System.out.println("ingrese Unidad de Medida Solo Letras C = Centimetros... P = Pies... Y = Yardas... L = Leguas ");
        unidad_de_medida= teclado.next(); 
        
        System.out.println("Ingrese Número a Convertir: ");
        numero_a_convertir = teclado.nextDouble();
        
        
        
        //operaciones 
        String p="p";
        String c="c";
        String l="l";
        String y="y";
        if (Objects.equals(unidad_de_medida, p))
           {
            numero_convertido = 0.0833 /numero_a_convertir ;
            System.out.println(numero_a_convertir + "pies son  " + numero_convertido + " pulgadas" );
           }
               else if(Objects.equals(unidad_de_medida, c))
                 {
                   numero_convertido = 2.54 / numero_a_convertir;
                   System.out.println(numero_a_convertir + "centimetros son  " + numero_convertido + " pulgadas" );
                 }
               else if(Objects.equals(unidad_de_medida, l))
                 {
                    numero_convertido = 190080.02 / numero_a_convertir; 
                    System.out.println(numero_a_convertir + "leguas son  " + numero_convertido + " pulgadas" );
                }
            
                   
               else if(Objects.equals(unidad_de_medida, y))
                 {
                   numero_convertido = 36 / numero_a_convertir;
                   System.out.println(numero_a_convertir + "yardas son  " + numero_convertido +   " pulgadas" );
                 }
                 else
                 {
                    System.out.println("Ingreso Mal el Dato");
                 }
        
     }
}
        
          
   