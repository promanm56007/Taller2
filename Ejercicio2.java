import java.util.Scanner;
import java.lang.Math;


public class Ejercicio2

{
    /* La siguiente figura expresa un cuadrado inscrito dentro de un círculo de radio r. Como se ve en la figura, el radio
       corresponde a la mitad de la diagonal del cuadrado. Su misión es escribir un programa que halle y retorne el
       área de sombreada que está entre el círculo y el cuadrado.*/

          
    public static void main(String [] args)
    {
                
        // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
         double radio;
         
         
         double area_circulo, area_cuadrado;
         
         
         double area_sombreada;
        
        // Solicitar datos de entrada
        
        System.out.println("ingrese El Radio");
        radio = teclado.nextDouble(); 
       
        
        
        //operaciones 
        area_circulo = Math.PI * Math.pow(radio,2);
        area_cuadrado = Math.pow(radio,2) + Math.pow(radio,2);
        area_sombreada = area_circulo - area_cuadrado;
        
        System.out.println("El Área Sombreada Es  " + area_sombreada);
        
     }
}
        