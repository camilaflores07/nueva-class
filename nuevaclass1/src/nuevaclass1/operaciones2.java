/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevaclass1;

import javax.swing.JOptionPane;

/**
 *
 * @author 50494
 */
public class operaciones2 {
    //atributos
    int num1, num2, suma, resta, multiplicacion, division;
    
    
    //metodos
    public void ingresardatos(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
    }
    public void suma(){
    suma = num1 + num2;
    }
    public void resta(){
    resta = num1 - num2;
    }
    public void multiplicacion(){
    multiplicacion = num1*num2;
    }
    public void division(){
    division = (num1/num2);
    }
    
    public void resultados(){
    JOptionPane.showMessageDialog(null, "La suma es de: " +suma);
    JOptionPane.showMessageDialog(null, "La resta es de: " +resta);
    JOptionPane.showMessageDialog(null, "La multiplicacion es de: " +multiplicacion);
    JOptionPane.showMessageDialog(null, "La division es de: " +division);
    }
    
}
