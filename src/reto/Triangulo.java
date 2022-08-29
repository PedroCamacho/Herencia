package reto;

public class Triangulo extends Figura {

	// Atributos
	protected int base, altura;

	// Constructor
	public Triangulo(int ba, int al) {
		base = ba;
		altura = al;
	}

	// Métodos implementados
	public double area() {
		return base * altura / 2;
	}

	public void mostrarNombre() {
		System.out.println("La figura es un triángulo");
	}

}
