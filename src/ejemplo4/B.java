package ejemplo4;

public class B extends A{
	private int atributoB;
	
	public B(int atributoA, int atributoB) {
		super(atributoA);
		this.atributoB = atributoB;
	}
	
	public void metodoB() {
		System.out.println("método B");
	}

	@Override
	public void metodoA() {
		System.out.println("método A - Definido en B ");
	}

}
