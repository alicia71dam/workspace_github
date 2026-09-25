/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int dinero, billetes50, billetes20, billetes10, billetes5, mon2, mon1, cartera;
        System.out.println("Por favor, indique una cantidad de dinero: ");
        cartera=entrada.nextInt(); //Pedimos al usuario que le dé un valor a la variable
        dinero=cartera; //Le damos el mismo valor a otra variable para hacer los cálculos
        billetes50= dinero/50; //Dividimos a partir de aquí para ir sacando los tipos de billetes
        dinero=dinero%50;//Vamos actualizando la cantidad
        billetes20=dinero/20;
        dinero=dinero%20;
        billetes10=dinero/10;
        dinero=dinero%10;
        billetes5=dinero/5;
        dinero=dinero%5;
        mon2=dinero/2;
        dinero=dinero%2;
        mon1=dinero;
        System.out.println(cartera + " Euros se descomponen en " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10,"
        + "\n" + billetes5 + " billetes de 5, " + mon1 + " monedas de 2 euros y " + mon2 + " monedas de 1 euro.");
    }
    
}
