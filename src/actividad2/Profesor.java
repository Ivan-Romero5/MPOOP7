/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author IVAN-PC
 */
public class Profesor extends Empleado{
    private int numAlumnos;

    public Profesor() {
    }
    /**
     * 
     * @param numAlumnos
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public Profesor(int numAlumnos, float salario, int horaEntrada, int horaSalida, actividad2.Mascota Mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, Mascota, nombre, edad);
        this.numAlumnos = numAlumnos;
    }
    /**
     * 
     * @return 
     */
    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public actividad2.Mascota getMascota() {
        return Mascota;
    }

    public void setMascota(actividad2.Mascota Mascota) {
        this.Mascota = Mascota;
    }
    
    public void reprobar(){
        System.out.println("5 de mis alumnos van a reprobar...");
    }
    /**
     * @param 
     */
    public void pasarAlumnos(){
        System.out.println("La mayoria de mis alumnos van a pasar...");
    }
    /**
     * @param 
     */
    public void explicar(){
        System.out.println("hoy les explicare el ciclo for");
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "numAlumnos=" + numAlumnos + '}';
    }
  
}
