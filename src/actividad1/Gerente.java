/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author IVAN-PC
 */
public class Gerente extends Empleado{
    private int presupuesto;

    public Gerente() {
    }
    /**
     * 
     * @param presupuesto
     * @param nombre
     * @param numempleado
     * @param sueldo 
     */
    public Gerente(int presupuesto, String nombre, int numempleado, int sueldo) {
        super(nombre, numempleado, sueldo);
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @param Presupuesto 
     */
    public void asignarPresupuesto(int Presupuesto){
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @return 
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+" Gerente{" + "presupuesto=" + presupuesto + '}';
    }

    
    
}
