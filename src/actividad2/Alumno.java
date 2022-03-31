/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author IVAN-PC
 */
public class Alumno extends Persona{
    private String carrera;
    private int semestre;

    public Alumno() {
    }
    /**
     * 
     * @param carrera
     * @param semestre
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public Alumno(String carrera, int semestre, actividad2.Mascota Mascota, String nombre, int edad) {
        super(Mascota, nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    /**
     * 
     * @return 
     */
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public actividad2.Mascota getMascota() {
        return Mascota;
    }

    public void setMascota(actividad2.Mascota Mascota) {
        this.Mascota = Mascota;
    }
    
    public void aprender(){
        System.out.println("Estoy aprendiendo...");
    }
    /**
     * 
     */
    public void estudiar(){
        System.out.println("Estoy estudiando...");
    }
    /**
     * 
     */
    public void darseDeBaja(){
        System.out.println("Me daré de baja...");
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
    
}
