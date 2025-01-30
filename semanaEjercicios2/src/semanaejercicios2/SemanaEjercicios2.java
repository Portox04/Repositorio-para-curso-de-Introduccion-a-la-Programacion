/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semanaejercicios2;
import javax.swing.JOptionPane;

/**
 *
 * @author porto
 */
public class SemanaEjercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //        EVISIÓN EJERCICIOS LECCION ANTERIOR Escriba un programa que lea el nombre del 
        //trabajador y su salario semanal, con esta información
        //calcule su salario mensual sin deducciones (salario bruto), el monto de las deducciones (que
        //corresponden a un 9.34%) y el salario después de aplicadas las deducciones (salario neto), finalmente
        //debe mostrar los datos al usuario de la siguiente manera.   
        
        //Ejercicio 1
        
        //Variables
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
        
        
        //Ejercicio 2.1
        //Variables
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Dime la edad"));
        
        if (edad >= 18){
            JOptionPane.showMessageDialog(null, "Puede votar");
            }
        else {
            JOptionPane.showMessageDialog(null, "No puede votar");
        }

        //Ejercicio 2.2 
        //Variables
                
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Cual fue su nota final"));
        
        if (nota>=70) {
            JOptionPane.showMessageDialog(null, "Paso con nota de:" +nota);
        }
        else{
            JOptionPane.showMessageDialog(null, "Se quedo con nota de: "+nota);
        }
        
        //Ejercicio 3.1
        //Variables
        
        int day = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de un dia de la semana del 1 al 7:"));
        
        if (day == 1) {
            JOptionPane.showMessageDialog(null, "El dia " + day + " es Domingo");
        }
        else if (day == 2) {
            JOptionPane.showMessageDialog(null, "El dia " + day + " es Lunes");
        }
        else if (day == 3) {
            JOptionPane.showMessageDialog(null, "El dia " + day + " es Martes");
        }
        else if (day == 4) {
            JOptionPane.showMessageDialog(null, "El dia " + day + " es Miercoles");
        }
        else if (day == 5) {
            JOptionPane.showMessageDialog(null, "El dia " + day + " es Jueves");
        }
        else if (day == 6) {
            JOptionPane.showMessageDialog(null, "El dia " + day + " es Vieres");
        }
        else if (day == 7) {
            JOptionPane.showMessageDialog(null, "El dia " + day + " es Sabado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        //Ejercicio 3.2
        
        if (day == 1 || day == 7) {
            JOptionPane.showMessageDialog(null, "El dia " + day + " es libre");
        } 
        else if (day != 1 || day <= 7) {
            JOptionPane.showMessageDialog(null, "El dia " + day + " es laboral");
        }
        else{
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        //Ejercicio 3.3
        //Variables
        
        
        
        //Ejercicio 4 (Extraclaes)
        
        int yearsWork = Integer.parseInt(JOptionPane.showInputDialog("Indique sus años de antigüedad:"));
        double hourWorkperWeek = Double.parseDouble(JOptionPane.showInputDialog("Indique sus horas laboradas"));
        double salaryHour = Double.parseDouble(JOptionPane.showInputDialog("Indique el costo de sus horas laboradas"));
    
        if (yearsWork > 12) {
            double newSalary = 20*(salaryHour*1.055);
            if (newSalary >= 2500 && newSalary < 3500){
                double superiorSalary = newSalary * 0.983;
                double  netSalary = superiorSalary*0.934;
                JOptionPane.showMessageDialog(null, "Su salario bruto es de:" +superiorSalary+ "\n"+ 
                                                    "Y su salario neto es de:" +netSalary);
            }
            else if(newSalary>= 3500){
                double superiorSalary = newSalary*0.972;
                double netSalary = superiorSalary*0.934;
                JOptionPane.showMessageDialog(null, "Su salario bruto es de:" +superiorSalary+ "\n"+ 
                                                    "Y su salario neto es de:" +netSalary);                
            }
            else if(newSalary<2500){
                double netSalary = newSalary*0.934;
                JOptionPane.showMessageDialog(null, "Su salario bruto es de:" + newSalary + "\n"
                                                    + "Y su salario neto es de:" + netSalary);              
            } 
        }
        else{
            double newSalary = 20*salaryHour;
            if (newSalary >= 2500 && newSalary < 3500){
                double superiorSalary = newSalary * 0.983;
                double  netSalary = superiorSalary*0.934;
                JOptionPane.showMessageDialog(null, "Su salario bruto es de:" +superiorSalary+ "\n"+ 
                                                    "Y su salario neto es de:" +netSalary);
            }
            else if(newSalary>= 3500){
                double superiorSalary = newSalary*0.972;
                double netSalary = superiorSalary*0.934;
                JOptionPane.showMessageDialog(null, "Su salario bruto es de:" +superiorSalary+ "\n"+ 
                                                    "Y su salario neto es de:" +netSalary);                
            }
            else if(newSalary<2500){
                double netSalary = newSalary*0.934;
                JOptionPane.showMessageDialog(null, "Su salario bruto es de:" + newSalary + "\n"
                                                    + "Y su salario neto es de:" + netSalary);  
            }
        }      
        
        
                
                
                
                
                
    }
    
}
