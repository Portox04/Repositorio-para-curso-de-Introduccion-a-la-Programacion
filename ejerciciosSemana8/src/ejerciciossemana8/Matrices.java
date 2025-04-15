/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossemana8;

import javax.swing.JOptionPane;


/**
 *
 * @author porto
 */
public class Matrices {

    public void callMatriz(){
        int numMatriz = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano del arreglo"));
        String testMatiz[] = new String[numMatriz];
        for (int i = 0; i < testMatiz.length; i++) {
            testMatiz[i] = JOptionPane.showInputDialog("Ingresa el dato de la posicion: " + i);}
    }
    
    
}
