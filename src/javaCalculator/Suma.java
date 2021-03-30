package javaCalculator;

public class Suma implements Operacion{
	private double unNumero;
	
	public Suma(Double primerNum) {
		this.unNumero = primerNum;
	}
	
	public double realizarOperacion(double otroNumero) {
		unNumero = unNumero + otroNumero;
		return unNumero;
	}
}
