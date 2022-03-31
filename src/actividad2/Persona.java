/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author IVAN-PC
 */
public class Persona extends SerVivo{
    Mascota Mascota;

    public Persona() {
    }
    /**
     * 
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public Persona(Mascota Mascota, String nombre, int edad) {
        super(nombre, edad);
        this.Mascota = Mascota;
    }
    /**
     * 
     * @return 
     */
    public Mascota getMascota() {
        return Mascota;
    }

    public void setMascota(Mascota Mascota) {
        this.Mascota = Mascota;
    }

    @Override
    public String toString() {
        return super.toString()+"Persona{" + "Mascota=" + Mascota + '}';
    }
    
}
