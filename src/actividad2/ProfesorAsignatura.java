/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author IVAN-PC
 */
public class ProfesorAsignatura extends Profesor{
    private String nomAsignatura;

    public ProfesorAsignatura() {
    }
    /**
     * 
     * @param nomAsignatura
     * @param numAlumnos
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public ProfesorAsignatura(String nomAsignatura, int numAlumnos, float salario, int horaEntrada, int horaSalida, actividad2.Mascota Mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, Mascota, nombre, edad);
        this.nomAsignatura = nomAsignatura;
    }
    /**
     * 
     * @return 
     */
    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    public actividad2.Mascota getMascota() {
        return Mascota;
    }

    public void setMascota(actividad2.Mascota Mascota) {
        this.Mascota = Mascota;
    }

    @Override
    public String toString() {
        return super.toString()+"ProfesorAsignatura{" + "nomAsignatura=" + nomAsignatura + '}';
    }
  
}
