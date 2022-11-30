package Reto5;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapelotijera implements Juego{

    private String nombre;
    private int eleccion;
    private double alea;
    Scanner leer =new Scanner(System.in);

    public void iniciar() {
        System.out.println("Ingrese nombre del jugador ");
        nombre= leer.nextLine();
        
    }
    public void jugar() {
        System.out.println("Escoje 1. para piedra o 2. para papel o 3. para tijera ");
        eleccion= leer.nextInt();
        System.out.println("...");
        Random aleatorio = new Random();
        alea= aleatorio.nextInt(3)+1;

        
    }
    public void finalizar() {
        if (alea==1 && eleccion==1) {
            System.out.println("Cayo piedra y seleccionaste piedra ¡Ganaste! "+nombre);
        } 
        else if (alea==1 && eleccion==2) {
            System.out.println("Cayo piedra y seleccionaste papel ¡Perdiste! "+nombre);
            
        } 
        else if (alea==1 && eleccion==3) {
            System.out.println("Cayo piedra y seleccionaste tijera ¡Perdiste! "+nombre);
        } 
        else if (alea==2 && eleccion==2) {
            System.out.println("Cayo papel y seleccionaste papel ¡Ganaste! "+nombre);
        } 
        else if (alea==2 && eleccion==1) {
            System.out.println("Cayo papel y seleccionaste piedra ¡Perdiste! "+nombre);
            
        } 
        else if (alea==2 && eleccion==3) {
            System.out.println("Cayo papel y seleccionaste tijera ¡Perdiste! "+nombre);
        } 
        else if (alea==3 && eleccion==3) {
            System.out.println("Cayo tijera y seleccionaste tijera ¡Ganaste! "+nombre);
        } 
        else if (alea==3 && eleccion==1) {
            System.out.println("Cayo tijera y seleccionaste piedra ¡Perdiste! "+nombre);
            
        } 
        else if (alea==3 && eleccion==2) {
            System.out.println("Cayo tijera y seleccionaste papel ¡Perdiste! "+nombre);
        } 
      
        
    }
    
}