package reto;

public class Test {
	public static void main(String[] args) {
		Figura fig;
		Triangulo tri;
		Cuadrado cua;

		// fig = new Figura(); error porque no se puede instanciar una clase abstracta
		tri = new Triangulo(4, 3);
		tri.mostrarNombre();

		fig = tri;
		fig.mostrarNombre();
		System.out.println("Area triangulo: " + fig.area());

		cua = new Cuadrado(5);

		fig = cua;
		fig.mostrarNombre();
		System.out.println("Area cuadrado: " + fig.area());
	}
}
