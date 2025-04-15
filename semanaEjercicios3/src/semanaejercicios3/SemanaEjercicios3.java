package semanaejercicios3;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author porto
 */
public class SemanaEjercicios3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Ejemplo FOR
        /**
         * String resultado = ""; for (int i = 0; i < 5; i++) { resultado +=
         * "Valor i:" + i + "\n"; } JOptionPane.showMessageDialog(null,
         * resultado);
         *
         * //Ejemplo WHILE int i = 0; while (i <= 10) { resultado += "Valor i:"
         * + i + "\n"; i++; } JOptionPane.showMessageDialog(null, resultado);
         *
         * String salida = ""; while (salida.compareTo("Si") != 0) { //Resultado
         * diferente a Si salida = JOptionPane.showInputDialog("Vamos salir del
         * ciclo while:"); System.out.println("El resultado del compareTo" +
         * salida.compareTo("Si")); }
         */
        //Ejercicio 1
        //Variable
        String signos = "";
        
        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < 10; x++) {
                signos += "@";
            }
            signos += "\n";
        }
        
        JOptionPane.showMessageDialog(null, signos);

        //Ejercicio 2
        //Variables
        String result = "";
        
        for (int a = 0; a < 10; a++) {
            int multiplier = a + 1;
            result += "5 x " + multiplier + " = " + 5 * multiplier + "\n";
        }
        JOptionPane.showMessageDialog(null, result);

        //Ejercicio 3
        //Variables
        String piramide = "";
        int files = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de fila que quiera tener la piramide"));
        
        for (int e = 0; e <= files; e++) {
            for (int p = 0; p < e; p++) {
                piramide += "*";
            }
            piramide += "\n";
        }
        JOptionPane.showMessageDialog(null, piramide);
        
        boolean salida = true;
        do {
            JOptionPane.showMessageDialog(null, "Valor de la variable salida: " + salida);
            for (int i = 0; i < 3; i++) {
                JOptionPane.showMessageDialog(null, "Valor de la variable i: " + i);
                if (i == 2) {
                    salida = false;
                }
            }
        } while (salida);
    }
}
