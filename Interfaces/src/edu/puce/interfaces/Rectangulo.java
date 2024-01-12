package edu.puce.interfaces;

public class Rectangulo implements FiguraGeometrica{
	
	private double base;
	private double altura;
	
	
	@Override
	public double calcularArea() {
		double area = this.base*this.altura;
		return area;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
