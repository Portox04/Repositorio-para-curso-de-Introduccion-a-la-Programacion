package semanaejercicio9;

import javax.swing.JOptionPane;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author porto
 */
public class SemanaEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad del arreglo:"));
        Estudiante arrEstudiantes[] = new Estudiante[n];

        //Llenar arreglo
        //En Main
        arrEstudiantes = llenarArreglo(arrEstudiantes);
        mostrarArreglo(arrEstudiantes);

        //Dentro de la clase
        //arrEstudiantes = Estudiante.llenarArregloEst(arrEstudiantes);
    }

    public static Estudiante[] llenarArreglo(Estudiante[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del estudiante " + (i + 1)));
            String nombre = generarNombre();
            String apellido = JOptionPane.showInputDialog("Digite el apellido del Estudiante " + (i + 1));

            //Crear la instancia y agregarla al arreglo
            Estudiante estudiante_i = new Estudiante(cedula, nombre, apellido);
            arreglo[i] = estudiante_i; //Ubica los datos obtenidos en la cantidad la cantidad de veces que se ha hecho
        }
        return arreglo;
    }

    public static void mostrarArreglo(Estudiante[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            JOptionPane.showMessageDialog(
                    null, "Estudiante " + (i + 1) + ": "
                    + arreglo[i]
            );
        }
    }

    public static String generarNombre() {
        String nombres [] = {
            "Ana",
            "Pedro",
            "Maria",
            "Juan",
            "Alicia",
            "Santiago",
            "Patricia",
            "Alexis"
        };
        Random rand = new Random();
        int num = rand.nextInt(nombres.length);
        return nombres[num];
    }

}
