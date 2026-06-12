/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilepractica;

import java.util.Scanner;

/**
 *
 * @author diegoreinoso
 */
public class Whilepractica {
     static double saldo = 1300;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cajero_automatico();
    }
    
    public static void cajero_automatico(){
        Scanner sc = new Scanner(System.in);
        //algoritmo para simular cajero automatico
        int clave = 1234;
        int intentos =3;
        int opc;
        int intentos_opc = 3;
         
        
        System.out.println("cajero automatico");
        System.out.println("-----------------");
        System.out.println("ingrese su tarjeta: ");
        System.out.println("tarjeta detectada");
        System.out.println("ingresa tu clave");
        while(intentos>0 && intentos <= 3){ 
            int clave_ingresada = sc.nextInt();
            if (clave_ingresada == clave) {
                System.out.println("BIENVENIDO AL CAJERO");
                System.out.println("selecciona una opción: ");
                do {
                    System.out.println("1. Consultar saldo");
                    System.out.println("2. Retirar dinero");
                    System.out.println("3. Depositar dinero");
                    System.out.println("4. Salir");
                    System.out.println("=========================");
                    System.out.println("Ingrese una Opcion");
                    opc= sc.nextInt();
                    switch(opc){
                        case 1://OPCION CONSULTAR SALDO
                            System.out.println("Consultar Saldo");
                            Consultar_saldo();
                            break;
                        case 2: 
                            System.out.println("Retirar Dinero");
                            break;
                        case 3: 
                            System.out.println("Depositar dinero");
                            break;
                        case 4:
                            System.out.println("Sistema Cerrado");
                            break;
                        default:
                            intentos_opc --;
                            System.out.println(intentos_opc);
                            System.out.println("Ingrese Una Opcion Valida");
                    }
                } while (opc != 4 && intentos_opc >0);
                break;

            }else{
                System.out.println("Clave Incorrecta");
                intentos = intentos -1;
                System.out.println("Te quedan: "+intentos+" intentos.");
            }
        }
        if (intentos==0){
            System.out.println("Tarjeta Bloqueada");
        }
        
    }
    //entrando a consultar saldo
    public static void Consultar_saldo(){
      System.out.println("El Saldo disponible de su tarjeta es de: " +saldo);//SALDO DISPONIBLE
}
    //retirar dinero 
    public static void retirar_dinero(){
        double retiro;
        do{
            System.out.println("ingrese el monto a retirar: ");
            retiro = sc.nextInt();
            if (retiro <= 0){

            
            }
        
        
    
        




    

}