package edu.puce.interfaces;

public class Circulo implements FiguraGeometrica{
	
	private double radio;
	
	@Override
	public double calcularArea() {
		double area = (this.radio*this.radio)*3.14;
		return area;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	
}
