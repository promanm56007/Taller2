import java.util.Scanner;
import java.lang.String;
import java.util.Objects;


public class Ejercicio4

{

    /*  si el tipo del vehículo es camioneta y el precio bruto es de menos de 80, no hay impuesto (o sea, es cero); 
     *  pero las camionetas con un precio bruto de 80 o más, tienen un impuesto igual a la mitad de éste precio. 
     *  Para los vehículos de tipo automóvil, si el precio es inferior a 20, el impuesto es de 5 pesos;
     *  los automóviles con un precio bruto entre 20 y 40, tienen un impuesto igual a la quinta parte del precio;
     *  y los automóviles con un precio por encima de 40 tienen un impuesto de 9 pesos. Escriba un programa
        en Java, en la cual, a partir del precio bruto y el tipo de vehículo, encuentre el impuesto a pagar y el precio neto (precio bruto más el impuesto).
           */

 
    
    public static void main(String [] args)
    {
                
        // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
        String tipo_de_vehiculo;
        double precio_bruto;
        double impuesto;
        
        // Solicitar datos de entrada
        
        System.out.println("ingrese Tipo de vehiculo c = Camioneta... a = Automovil...");
        tipo_de_vehiculo = teclado.next(); 
        
        System.out.println("Ingrese Precio Bruto: ");
        precio_bruto = teclado.nextDouble();
        
        
        
        //operaciones 
        String c="c";
        String a="a";
        
        if (Objects.equals(tipo_de_vehiculo, c) && (precio_bruto < 80))
           {
            impuesto = 0;
            System.out.println("El Impuesto Será  " + impuesto);
           }
               else if(Objects.equals(tipo_de_vehiculo, c) && (precio_bruto >= 80))
                 {
                   impuesto = precio_bruto / 2;
                   System.out.println("El Impuesto Será  " + impuesto);
                 }
               else if(Objects.equals(tipo_de_vehiculo, a) && (precio_bruto <= 20))
                 {
                    impuesto = 5;
                   System.out.println("El Impuesto Será  " + impuesto);
                }
            
                   
               else if(Objects.equals(tipo_de_vehiculo, a) && (20 < precio_bruto)&&( precio_bruto < 40))
                 {
                   impuesto = precio_bruto / 5;
                   System.out.println("El Impuesto Será  " + impuesto);
                 }
                 
                 else if(Objects.equals(tipo_de_vehiculo, a) &&( precio_bruto <= 40))
                 {
                    impuesto = 9;
                   System.out.println("El Impuesto Será  " + impuesto);
                }
                 else
                 {
                    System.out.println("Ingreso Mal el Dato");
                 }
        
     }
}