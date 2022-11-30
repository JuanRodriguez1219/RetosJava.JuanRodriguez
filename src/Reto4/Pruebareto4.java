package Reto4;

public class Pruebareto4 {
    public static void main(String[] args) {
        
        Empleado Empleado1= new Empleado("CC", 1032345570, "Angie", "Mendieta", 55, 163, 20, "femenino", 30000, 8, "desarrolladora", "teleinformatica");

        Empleado1.calcularHonorarios();

        System.out.println("El empleado "+Empleado1.getNombre()+ " "+Empleado1.getApellido()+ " identificado con "+Empleado1.getTipoDocumento()+ " "+Empleado1.getDocumento()+" tiene el cargo de "+ Empleado1.getCargo()+ ", las horas laboradas son " +Empleado1.getHorastrabajadas()+", el valor por cada hora es "+Empleado1.getValorhora()+ " y su pago total, por el día laborado es " +Empleado1.calcularHonorarios());
    }
}