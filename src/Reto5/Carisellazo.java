package Reto5;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego{
        
    
    
    private String nombre;
    private int eleccion;
    private double moneda;

    

    Scanner leer =new Scanner(System.in);
    public void iniciar() {
        System.out.println("Ingrese nombre del jugador ");
        nombre= leer.nextLine();
    }


    public void jugar() {
        System.out.println("Escoje 1. para cara o 2. para sello ");
        eleccion= leer.nextInt();
        System.out.println("Moneda girando...");
        Random aleatorio = new Random();
        moneda= aleatorio.nextInt(2)+1;
      
    }
    public void finalizar() {
        if (moneda==1 && eleccion==1) {
            System.out.println("Cayo cara y seleccionaste cara ¡Ganaste! "+nombre);
        } 
        else if (moneda==1 && eleccion==2) {
            System.out.println("Cayo cara y seleccionaste sello ¡Perdiste! "+nombre);
            
        } 
        else if (moneda==2 && eleccion==2) {
            System.out.println("Cayo sello y seleccionaste sello ¡Ganaste! "+nombre);
        } 
        else if (moneda==2 && eleccion==1) {
            System.out.println("Cayo sello y seleccionaste cara ¡Perdiste! "+nombre);
            
        } 
        
        
    }
}