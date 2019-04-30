/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_paqueteprincipal;

/*
Importacion del paquete Scanner para registrar por  teclado los datos y 
el paquete practica5_paquete2 donde se encuentran los porcentajes
*/

import java.util.Scanner;
import practica5_paquete2.Porcentaje;

/**
 *
 * @author Usuario iTC
 */
public class Practica5_paqueteprincipal {
    public static void main(String[] args) {
        
        //declaración de variables
        Scanner teclado = new Scanner (System.in);
        double valor_matricula = 1330;
        double ciudad;
        int edad;
        int estado_civil;
        int carga_familiar;
        double operacion;
        double descuento_total = 0;
        /* 
        variables en donde se almacenarán los datos importados del paquete
        practica5_paquete2
        */
        double descuento_ciudad = Porcentaje.descuento_ciudad;
        double descuento_edad = Porcentaje.descuento_edad;
        double descuento_estado = Porcentaje.descuento_estado;
        double descuento_familiar = Porcentaje.descuento_familiar;
        double tramite_admin = Porcentaje.tramite_ad;
        
        //Peticion de datos por teclado
        
        System.out.println("Bienvenido al Sistema de Matrícula de la "
                + "Universidad Técnica Particular de Loja \n"
                + "Por favor digite 1 si nacio en Loja o Zamora y 0 si "
                + "nacio en otra provincia ");
        ciudad = teclado.nextInt();
                
        System.out.println("Por favor ingrese su edad\n");
        edad = teclado.nextInt(); 
        
        System.out.println("Seguidamente Ingrese su estado civil\n"
                + "1. casado\n2. Soltero\n3. Divorciado");
        estado_civil = teclado.nextInt();
        
        System.out.println("Finalmente ingrese la cantidad de hijos que "
                + "tiene actualmente\n");
        carga_familiar = teclado.nextInt();
        
        /*Procedimiento: Se sumaran los descuentos para luego realizar una sola 
                        operacion               
        */
        
        
        if (ciudad == 1){
            descuento_total = descuento_total + descuento_ciudad;            
        }
        if (edad >= 17 && edad < 20){
            descuento_total = descuento_total + descuento_edad;
        }
        if (estado_civil == 1){
            descuento_total = descuento_total + descuento_estado;
        }
        if (carga_familiar >= 1){
            descuento_total = descuento_total + descuento_familiar;
        }
        
        
        descuento_total = 1330 * descuento_total; //descuento total
        
        //valor matricula sin los tramite administrativos
        valor_matricula = valor_matricula - descuento_total; 
        tramite_admin = 1330 * tramite_admin;  //calculo del tramite admin
        //valor matrícula con el valor del tramite administrativo
        valor_matricula = valor_matricula + tramite_admin;
        
        //Impresion del resultado        
        System.out.printf("El valor de su matricula más los gastos "
                + "administrativos es de: $ %.2f", 
                valor_matricula);
        
    }
    
}
