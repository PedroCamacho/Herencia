package ejemplo2;

public class C extends B {
	private int atributoC;

	public C(int atributoA, int atributoB, int atributoC) {
		super(atributoA, atributoB);
		this.atributoC = atributoC;
	}

	public void metodoC() {
		System.out.println("método C");
	}
}
