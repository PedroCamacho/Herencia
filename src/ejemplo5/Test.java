package ejemplo5;

public class Test {

	public static void main(String[] args) {
		// No se puede crear un objeto de A
		// A miA = new A (1);
		B miB = new B (1);
		C miC = new C (2,3);
		D miD = new D (4,5);
		
		miC.metodoA();
		miC.metodoPorDefecto();
		System.out.println(miD);
	}
}
