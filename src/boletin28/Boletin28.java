/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

/**
 *
 * @author Gonzalo
 */
public class Boletin28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Samuel", 0);
        alumno1.setEnderezo(alumno1.new Enderezo("Calle de los pelicanos", 69));
        
        // Muestra la información
        System.out.println(alumno1.toString());
        
        // Cambia la nota del alumno
        alumno1.cambiarNota();
        
        // Muestra la información
        System.out.println(alumno1.toString());
    }
    
}
