/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2;

import javax.swing.JOptionPane;

/**
 *
 * @author porto
 */
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //        EVISIÓN EJERCICIOS LECCION ANTERIOR Escriba un programa que lea el nombre del 
        //trabajador y su salario semanal, con esta información
        //calcule su salario mensual sin deducciones (salario bruto), el monto de las deducciones (que
        //corresponden a un 9.34%) y el salario después de aplicadas las deducciones (salario neto), finalmente
        //debe mostrar los datos al usuario de la siguiente manera.    
        
        //Variables
        /**
        String nameTrabajador =""; //Declarar la variable del nombre
        double salaryWeek = 0.0; // Declarar Variable del Salario
        double salaryMoth = 0.0;
        double salary =0.0;
        String message = "";
       
        nameTrabajador = JOptionPane.showInputDialog("Digite su nombre");
        message = JOptionPane.showInputDialog("Digite su salario");
        salaryWeek = Double.parseDouble(message);
        salaryMoth = salaryWeek*4;
        salary = salaryMoth*0.934;
        JOptionPane.showMessageDialog(null, "El nombre es: "+nameTrabajador+ "\n"+
                                            "El salario es: "+salaryWeek+ "\n"+
                                            "El salario mensual es: "+salaryMoth+ "\n"+
                                            "El salario mensual con deducciones es "+salary);
        */
                
        //Semana 2
        // Logica booleana operadores logicos 
        
        //Logica booleana de IF
       
        /**
        if (true && 1 == 1) {
            JOptionPane.showMessageDialog(null, "Entra");
        }

        if (!false) {
            JOptionPane.showMessageDialog(null, "Entra por la negacion ");
        }
        */
        
        // Logica de ELSE
        
        boolean bandera = true;
        
        if (!bandera) {
            JOptionPane.showMessageDialog(null, "True");
        }
        else {
            JOptionPane.showMessageDialog(null, "false");
        }
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Tomar alcohol");
            JOptionPane.showMessageDialog(null, "Tomar alcohol");
        }
        else {
            JOptionPane.showMessageDialog(null, "No puede hacer nada");
        }
        
        //Logica de SWITCH
        
        int diaSemana = 1000;

        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes  ");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes  ");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles  ");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves  ");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Party Time  ");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Dato no valido  ");
        }
         
    }
    
}
