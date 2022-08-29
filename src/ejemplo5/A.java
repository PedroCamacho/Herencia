package ejemplo5;

public interface A {
	static int atributoA = 0;
	
	void metodoA();
	
	default void metodoPorDefecto () {
		System.out.println("método por defecto");
	}
}
