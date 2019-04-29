/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_paqueteprincipal;

import java.util.Scanner;
import practica5_paquete2.Porcentaje;


/**
 *
 * @Edgar_Guamo Usuario iTC
 */
public class Practica5PaquetePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        El costo de matrícula de un estudiante es de $1330. Pero se debe 
        considerar algunas situaciones:
        - Si el estudiante es de Loja O Zamora, se descontara el 20% de la 
        matrícula incial (Variables necesarias ciudad y descuento_ciudad)
        - Si la edad es mayor o igual a 17 años y menor a 20, tiene un
        descuento del 10% (Variables necesarias edad y descuento_edad)
        - Si el estado civil del estudiante es casado se descontara el 5% de su
        matrícula (Variables necesarias estado_civi y descuento_estado)
        - S el estudiantes tiene una ovarias cargas familiares se le descontara
        el 3% (variables necesarias cargas_familiares descuento_familiar)
        Se le debe agregar 2% por trámite administrativo (variables necesarias
        trámite administrativo)
        */
        //Declaración de variables que ingresara el usuario 
        Scanner teclado = new Scanner(System.in);
        String ciudad;
        int edad;
        int estado_civil;
        int cargas_familiares;
        
        double pago = 1330;
        double operacion; 
        //Declaración de variables usadas para asignar datos de otros paquetes
        double des_ciudad = Porcentaje.descuento_ciudad;;
        double des_edad = Porcentaje.descuento_edad;
        double des_estado = Porcentaje.descuento_estado;
        double des_fam = Porcentaje.descuento_familiar; 
        double tramite_administrativo= Porcentaje.tramite_ad;
        
        //Procedimiento
        System.out.println("Bienvenido al Sistema de Matrícula de la "
                + "Universidad Técnica Particular de Loja \nPor favor ingrese"
                + "su ciudad de origen\n");
        ciudad = teclado.nextLine();
        
        
        System.out.println("Por favor ingrese su edad\n");
        edad = teclado.nextInt();
        
        System.out.println("Seguidamente Ingrese su estado civil\n"
                + "1. casado\n2. Soltero\n3. Divorciado");
        estado_civil = teclado.nextInt();
        
        System.out.println("Finalmente ingrese la canridad de hijos que "
                + "tiene actualmente\n");
        cargas_familiares = teclado.nextInt();
        
        
        // Operación usada para aplicar descuanto por la ciudad 
        
        if (ciudad == "Loja" || ciudad == "Zamora"){
            operacion = 1330 * des_ciudad;
            pago = pago - operacion;
            System.out.println(pago);
            System.out.println(operacion);
            
        }
        if (edad >= 17 && edad < 20){
            operacion = 1330 * des_edad ;
            pago = pago - operacion;
            System.out.println(pago);
        }
        if (estado_civil == 1){
            operacion = 1330 * des_estado;
            pago = pago - operacion;
            System.out.println(pago);
        }
        if (cargas_familiares >=1){
            operacion = 1330 * des_fam;
            pago = pago - operacion;
            System.out.println(pago);
        }
        pago = 
        operacion = pago * tramite_administrativo;
        pago = pago + operacion;
        System.out.println(pago);  
        
        System.out.printf("El valor que debe pagar por matrícula es de %.2f"
        , pago);
        
    }
    
}
