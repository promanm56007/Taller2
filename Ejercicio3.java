
import java.util.Scanner;
import java.lang.Math;


public class Ejercicio3

{
    /* Un colectivo es capaz de transportar n personas dentro de él. Cada persona paga 10 mil pesos por un viaje en el
       colectivo y el conductor debe pagar 2 mil pesos por cada viaje que haga a la empresa propietaria del colectivo.
       
       Un hotel contrata el colectivo para transportar un grupo de turistas desde el aeropuerto hasta el hotel. Escriba
       un programa en Java, que a partir del número de personas que caben en el colectivo y el número de turistas
       que van al hotel, 
       
       determine cuántos viajes debe realizar el colectivo, cuánto dinero en total deberán pagar los
       turistas al colectivo y cuánto dinero deberá pagar el conductor al propietario.*/

          
 
        public static void main (String [] args)
             {
         
             // asociar teclado al programa
             Scanner teclado = new Scanner(System.in);
        
             // declarar variables
                                
                double n_personas;
                double n_viajes;
                double personas_bus;
                double dinero_total_personas, dinero_total_conductor;
                
               // Solicitar datos de entrada
                
            System.out.println("N° de Personas que puede llevar el Bus: ");
            personas_bus= teclado.nextDouble();
            
             System.out.println("Cantidad de Personas a Llevar: ");
             n_personas= teclado.nextDouble();
         
                             
         //numero de viajes a realizar
           if (n_personas >= personas_bus)
           {
           n_viajes = n_personas / personas_bus;
           }
              else
              { 
                  n_viajes=1;
                }
                
         //numero de galones a usar
         
         dinero_total_personas = n_personas * 10000;
         dinero_total_conductor = n_viajes * 2000;
         
         
         System.out.println(" El Total de Viajes Fueron:  " + n_viajes);
         System.out.println(" El Dinero Total En Pasajes Es  :" + dinero_total_personas);
         System.out.println(" El Dinero Total Conductor Es  :" + dinero_total_conductor);
         
            
             

 
    }
    
}   
     