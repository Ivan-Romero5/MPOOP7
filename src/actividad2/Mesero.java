/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author IVAN-PC
 */
public class Mesero extends Empleado{
    private String restaurante;
    private int numMesas;
    private String colorUniforme;

    public Mesero() {
    }
    /**
     * 
     * @param restaurante
     * @param numMesas
     * @param colorUniforme
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public Mesero(String restaurante, int numMesas, String colorUniforme, float salario, int horaEntrada, int horaSalida, actividad2.Mascota Mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, Mascota, nombre, edad);
        this.restaurante = restaurante;
        this.numMesas = numMesas;
        this.colorUniforme = colorUniforme;
    }
    /**
     * 
     * @return 
     */
    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }
    
    public actividad2.Mascota getMascota() {
        return Mascota;
    }

    public void setMascota(actividad2.Mascota Mascota) {
        this.Mascota = Mascota;
    }
    
    public void recibirPedido(){
        System.out.println("tomare sus pedidos...");
    }
    /**
     * @param 
     */
    public void darPedido(){
        System.out.println("aqui tienen sus pedidos...");
    }
    /**
     * @param 
     */
    public void recibirPropina(){
        System.out.println("me dieron 15% de propina...");
    }
    /**
     * @param 
     */
    public void tomarDescanso(){
        System.out.println("Estoy en mi descanso...");
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Mesero{" + "restaurante=" + restaurante + ", numMesas=" + numMesas + ", colorUniforme=" + colorUniforme + '}';
    }

}
