/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop7;

import actividad1.Empleado;
import actividad1.Gerente;
import actividad2.Alumno;
import actividad2.Gato;
import actividad2.Mesero;
import actividad2.Perro;
import actividad2.ProfesorAsignatura;
import actividad2.ProfesorCarrera;

/**
 *
 * @author IVAN-PC
 */
public class MPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado= new Empleado();
        empleado.setNombre("Joaquin");
        empleado.setNumEmpleado(998877);
        empleado.setSueldo(10_000);
        System.out.println(empleado);
        System.out.println(empleado.toString());
        
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Paulina");
        gerente.setNumEmpleado(887766);
        gerente.setSueldo(30_000);
        gerente.aumentarSueldo(50);
        gerente.setPresupuesto(100_000);
        System.out.println(gerente);
        
        Gerente gerente2 = new Gerente (1_000_000, "Saul", 113365,50_000);
        System.out.println(gerente2);
        
        System.out.println("\n###################");
        Perro perro = new Perro();
        perro.setNombre("Rocky");
        perro.setColor("Blanco");
        perro.setEdad(8);
        perro.setRaza("Pitbull");
        perro.setColorOjos("cafes");
        perro.setColaCortada(false);
        System.out.println(perro);
       
        
        
        System.out.println("\n###################");
        Gato gato = new Gato();
        gato.setNombre("Bola de nieve");
        gato.setColor("Blanco");
        gato.setEdad(2);
        gato.setColorOjos("negros");
        gato.setRaza("Siamés");
        System.out.println(gato);
       
        
        System.out.println("\n###################");
        Alumno alumno = new Alumno();
        alumno.setNombre("Fernanda");
        alumno.setEdad(20);
        alumno.setMascota(perro);
        alumno.setCarrera("Ing. Eléctrica Eléctronica");
        alumno.setSemestre(4);
        System.out.println(alumno);
        
        
        System.out.println("\n###################");
        Mesero mesero = new Mesero();
        mesero.setNombre("Beatriz");
        mesero.setEdad(23);
        mesero.setMascota(gato);
        mesero.setSalario(13_000);
        mesero.setHoraEntrada(18);
        mesero.setHoraSalida(1);
        mesero.setRestaurante("TOKS");
        mesero.setNumMesas(4);
        mesero.setColorUniforme("Negro");
        System.out.println(mesero);
       
        
        System.out.println("\n###################");
        ProfesorAsignatura profesor1 = new ProfesorAsignatura();
        profesor1.setNombre("Josue");
        profesor1.setEdad(31);
        profesor1.setMascota(perro);
        profesor1.setSalario(9_000);
        profesor1.setHoraEntrada(15);
        profesor1.setHoraSalida(17);
        profesor1.setNumAlumnos(30);
        profesor1.setNomAsignatura("Cálculo Integral");
        System.out.println(profesor1);
     
        
        System.out.println("\n###################");
        ProfesorCarrera profesor2 = new ProfesorCarrera();
        profesor2.setNombre("Paola");
        profesor2.setEdad(30);
        profesor2.setMascota(gato);
        profesor2.setSalario(19_000);
        profesor2.setHoraEntrada(7);
        profesor2.setHoraSalida(15);
        profesor2.setNumAlumnos(200);
        profesor2.setNumAsignatura(6);
        profesor2.setGrupos(10);
        System.out.println(profesor2);
              
    }   
}
