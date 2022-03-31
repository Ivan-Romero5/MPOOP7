/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author IVAN-PC
 */
public class Perro extends Mascota{
    private boolean colaCortada;

    public Perro() {
    }
    /**
     * 
     * @param colaCortada
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Perro(boolean colaCortada, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }
    /**
     * 
     * @return 
     */
    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    
    public void correr(){
        System.out.println("estoy corriendo...");
    }
    /**
     * @param 
     */
    public void corretear(){
        System.out.println("te estoy corretando...");
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Perro{" + "colaCortada=" + colaCortada + '}';
    }
   
}
