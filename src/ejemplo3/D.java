package ejemplo3;

public class D extends B {
	private int atributoD;
	
	public D(int atributoA, int atributoB, int atributoD) {
		super(atributoA, atributoB);
		this.atributoD = atributoD;
	}

	public void metodoA() {
		System.out.println("método A - Redefinido en D");
	}

	public void metodoAOriginal() {
		super.metodoA();
	}
	
	public void metodoD() {
		System.out.println("método D");
	}
}
