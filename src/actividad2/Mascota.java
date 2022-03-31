/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author IVAN-PC
 */
public class Mascota extends SerVivo{
    private String color;
    private String raza;
    private String colorOjos;

    public Mascota() {
    }
    /**
     * 
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }
    /**
     * 
     * @return 
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    public void dormir(){
        System.out.println("estoy durmiendo zzz...");
    }
    /**
     * @param
     */
    public void saltar(){
        System.out.println("Estoy saltando...");
    }
    /**
     * @param 
     */
    public void jugar(){
        System.out.println("estoy jugando...");
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+" Mascota{" + "color=" + color + ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }
    
    
}
