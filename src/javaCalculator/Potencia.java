/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCalculator;

/**
 *
 * @author Vilardo
 */
public class Potencia implements Operacion{
    private double unNumero;
    
    public Potencia(Double primerNum) {
	this.unNumero = primerNum;
    }
	
    public double realizarOperacion(double otroNumero) {
        if(otroNumero == 0) return 1;
        
        if(otroNumero < 0) {
            otroNumero = otroNumero * -1;
            
            for(int i = 0; i < otroNumero; i ++){
            unNumero = unNumero * unNumero;
            }
            
            return (1/unNumero);
        }
        
	for(int i = 0; i < otroNumero-1; i ++){
            unNumero = unNumero * unNumero;
        }
	return unNumero;
    }
}
