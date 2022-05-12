/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class EjecutorDos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        String nombre;
        String cedula;
        String barrio;
        
        System.out.println("Ingrese el nombre del Barrio");
        barrio = entrada.nextLine();
        Barrio barrio1 = new Barrio(barrio);
        System.out.println("Ingrese cedula");
        cedula = entrada.nextLine();
        
        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
    
        Persona persona1 = new Persona(nombre, cedula, barrio1);
        
        System.out.println(persona1);
    }
}
