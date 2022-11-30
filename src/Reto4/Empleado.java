package Reto4;

public class Empleado extends Personareto4{

    private int valorhora, horastrabajadas;
    private String cargo, departamento;

    public Empleado() {
    }

    public Empleado(int valorhora, int horastrabajadas, String cargo, String departamento) {
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public Empleado(String tipoDocumento, int documento, String nombre, String apellido, float peso,
    float estatura, int edad, String genero, int valorhora, int horastrabajadas, String cargo,
    String departamento) {
    super(tipoDocumento, documento, nombre, apellido, peso, estatura, edad, genero);
    this.valorhora = valorhora;
    this.horastrabajadas = horastrabajadas;
    this.cargo = cargo;
    this.departamento = departamento;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularHonorarios(){
        double producto= (valorhora*horastrabajadas);
        double reteica= 0.096;
        double Valor= producto*reteica;
        double ValorTotal= producto-Valor;

        return ValorTotal;
    }

}
