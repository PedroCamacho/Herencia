package ejemplo5;

public class C extends B {
	private int atributoC;

	public C(int atributoB, int atributoC) {
		super(atributoB);
		this.atributoC = atributoC;
	}
	
	public void metodoC() {
		System.out.println("método C");
	}
}
