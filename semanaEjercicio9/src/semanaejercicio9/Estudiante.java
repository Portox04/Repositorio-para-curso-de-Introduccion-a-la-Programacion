/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanaejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author porto
 */
public class Estudiante {
    private int cedula;
    private String nombre;
    private String apellido;

    public Estudiante(int cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static Estudiante[] llenarArregloEst(Estudiante[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del estudiante " + (i + 1)));
            String nombre = JOptionPane.showInputDialog("Digite el nombre del Estudiante " + (i + 1));
            String apellido = JOptionPane.showInputDialog("Digite el apellido del Estudiante " + (i + 1));

            //Crear la instancia y agregarla al arreglo
            Estudiante estudiante_i = new Estudiante(cedula, nombre, apellido);
            arreglo[i] = estudiante_i; //Ubica los datos obtenidos en la cantidad la cantidad de veces que se ha hecho
        }
        return arreglo;
    }    

    @Override
    public String toString() {
        return "Cedula = " + cedula + ", nombre= " + nombre +" "+ apellido;
    }
    
    
    
}
