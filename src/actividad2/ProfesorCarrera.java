/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author IVAN-PC
 */
public class ProfesorCarrera extends Profesor{
    private int numAsignatura;
    private int grupos;

    public ProfesorCarrera() {
    }
    /**
     * 
     * @param numAsignatura
     * @param grupos
     * @param numAlumnos
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public ProfesorCarrera(int numAsignatura, int grupos, int numAlumnos, float salario, int horaEntrada, int horaSalida, actividad2.Mascota Mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, Mascota, nombre, edad);
        this.numAsignatura = numAsignatura;
        this.grupos = grupos;
    }
    /**
     * 
     * @return 
     */
    public int getNumAsignatura() {
        return numAsignatura;
    }

    public void setNumAsignatura(int numAsignatura) {
        this.numAsignatura = numAsignatura;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }

    public actividad2.Mascota getMascota() {
        return Mascota;
    }

    public void setMascota(actividad2.Mascota Mascota) {
        this.Mascota = Mascota;
    }

    @Override
    public String toString() {
        return super.toString()+"ProfesorCarrera{" + "numAsignatura=" + numAsignatura + ", grupos=" + grupos + '}';
    }
  
}
