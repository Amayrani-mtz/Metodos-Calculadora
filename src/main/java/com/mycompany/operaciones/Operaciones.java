/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones;

/**
 *
 * @author jafet mtz
 */
import javax.swing.JOptionPane;
public class Operaciones {
    
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos
    
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Coloca el nume 1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Coloca el nume 2"));
        
    }
    
       //metodo de suma 
        
    public void sumar(){
        suma=numero1+numero2;
        }
    
       //metodo resta
    
    public void restar(){
        resta=numero1-numero2;
    }
    
       //metodo multiplicación
    
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    
       //metodo división
    
    public void dividir(){
        division=numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La suma es "+multiplicacion);
        System.out.println("La suma es "+division);
    }
}
