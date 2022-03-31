/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author IVAN-PC
 */
public class Gato extends Mascota{

    public Gato() {
    }
    /**
     * 
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Gato(String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
    /**
     * @param 
     */
    
    public void rasguñar(){
        System.out.println("rasguñe el sillon...");
    }
    /**
     * @param 
     */
    public void trepar(){
        System.out.println("estoy trepando este arbol...");
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+" Gato{" + '}';
    }
    
    
    
}
