package Reto4;

import java.util.Scanner;

public class Personareto4 {

    Scanner leer = new Scanner(System.in);

    private String tipoDocumento;
    private int documento;
    private String nombre;
    private String apellido;
    private float peso;
    private float estatura;
    private int edad;
    private String genero;

    public Personareto4(){
        
    }

    
    public Personareto4(String tipoDocumento, int documento, String nombre, String apellido,
    float peso, float estatura, int edad, String genero) {

        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.genero = genero;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getEstatura() {
        return estatura;
    }
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }


}

