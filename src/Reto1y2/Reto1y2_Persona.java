package Reto1y2;

import java.util.Scanner;

public class Reto1y2_Persona {

    Scanner leer = new Scanner(System.in);

    float pesoActual=0;

    public String tipoDocumento;
    public String documento;
    public String nombre;
    public String apellido;
    public float peso;
    public float estatura;
    public int edad;
    public String genero;

    public void pedirDatos() {

        System.out.println("Digite el tipo de documento: " );
        tipoDocumento = leer.next();

        System.out.println("Digite su número de documento");
        documento = leer.next();

        System.out.println("Digite su nombre");
        nombre = leer.next();

        System.out.println("Digite su apellido");
        apellido = leer.next();

        System.out.println("Digite su genero");
        genero = leer.next();

        System.out.println("Digite su edad");
        edad = leer.nextInt();

        leer.nextLine();

        System.out.println("Digite su peso");
        peso = leer.nextFloat();

        System.out.println("Digite su estatura");
        estatura = leer.nextFloat();
    }
    
        public void mostrarPersona() {

        System.out.println("El paciente " +nombre+" " +apellido+ " identificado con " +tipoDocumento+" y numero " +documento+" de genero "+genero+ " tiene "+edad+ " años de edad, pesa " +peso+ "kg y su estatura es de " +estatura+ "cm");    

    } 

        public String calcularImc() {
        String res="";

        pesoActual=(peso)/(estatura*estatura);

        if (pesoActual>=0&&pesoActual<=19){
        res="pesobajo";
    
        }
        
        else if (pesoActual<=25){
        res="pesoideal";
        
        }
        
        else if (pesoActual>25){
        res="sobrepeso";
    
        } 
        return res;
    }

        public void mayorEdad() {

        if (edad<=0||edad<=17)
        System.out.println("El paciente es menor de edad");
        
        else if (edad>18)
        System.out.println("El paciente es mayor de edad");
        
        }
    
           
    
}
