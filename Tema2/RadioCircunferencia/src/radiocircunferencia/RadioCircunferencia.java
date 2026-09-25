/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radiocircunferencia;

/**
 *
 * @author Alicia
 * @since 18/09/2026
 * 
 */
public class RadioCircunferencia {

    final static double PI=3.1415; //Declaramos la constante
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float radio=3.55f, longitud; //Declaramos con el tipo correcto las variables
        longitud=(float)(2*PI*radio); //Para que no nos de error de compilación, forzamos con cast y le decimos la cuenta que tiene que realizar
        System.out.println("La longitud de una circunferencia cuyo radio vale 3 seria igual a: " + longitud + " metros.");
        
               
    }
    
}
