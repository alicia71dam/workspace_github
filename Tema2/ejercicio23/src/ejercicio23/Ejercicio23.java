/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double precio, resultado;
        int unidades;
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio=entrada.nextDouble(); //Le pedimos al usuario que le dé un valor a la variable
        System.out.println("¿Cuántas unidades quiere llevarse? ");
        unidades=entrada.nextInt(); 
        resultado=precio*unidades; //Hacemos el cálculo para decirle lo que va a gastarse
        System.out.println("El precio total de su compra es de: " + resultado + " Euros");
    }
    
}
