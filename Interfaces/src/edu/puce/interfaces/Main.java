package edu.puce.interfaces;

public class Main {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.setAltura(10);
		r1.setBase(5);
		System.out.println("Area del rectángulo: "+r1.calcularArea());
		
		Triangulo t1 = new Triangulo();
		t1.setAltura(5);
		t1.setBase(7);
		System.out.println("Area del triángulo: "+t1.calcularArea());
		
		Circulo c1 = new  Circulo();
		c1.setRadio(5);
		System.out.println("Area del círculo: "+c1.calcularArea());

	}

}
