package ejemplo3;

public class C extends B {
	private int atributoC;

	public C(int atributoA, int atributoB, int atributoC) {
		super(atributoA, atributoB);
		this.atributoC = atributoC;
	}

	public void metodoB() {
		System.out.println("método B - Redefinido en C");
	}
	
	public void metodoBOriginal (){
		super.metodoB();
	}
	
	public void metodoC() {
		System.out.println("método C");
	}
}
