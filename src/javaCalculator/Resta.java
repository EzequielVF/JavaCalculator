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
public class Resta implements Operacion{
    private double unNumero;
    
    public Resta(Double primerNum) {
	this.unNumero = primerNum;
    }
	
    public double realizarOperacion(double otroNumero) {
	unNumero = unNumero - otroNumero;
	return unNumero;
    }
    
}
