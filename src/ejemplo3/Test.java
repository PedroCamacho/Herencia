package ejemplo3;

public class Test {

	public static void main(String[] args) {
		A miA = new A (1);
		B miB = new B (2,3);
		C miC = new C (4,5,6);
		D miD = new D (7,8,9);
		
		miC.metodoB();
		miC.metodoBOriginal();
		miD.metodoA();
		miD.metodoAOriginal();
	}
}
