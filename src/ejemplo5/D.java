package ejemplo5;

public class D extends B {
	private int atributoD;
	
	public D(int atributoB, int atributoD) {
		super(atributoB);
		this.atributoD = atributoD;
	}
	
	public void metodoD() {
		System.out.println("método D");
	}

	@Override
	public String toString() {
		return "D [atributoD=" + atributoD + ", atributoB=" + atributoB + 
				", atributoA=" + A.atributoA + "]";
	}
	
}
