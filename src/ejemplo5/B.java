package ejemplo5;

public class B implements A{
	protected int atributoB;
	
	public B(int atributoB) {
		this.atributoB = atributoB;
	}
	
	public void metodoA () {
		System.out.println("método A - Implementado en B");
	}
	
	public void metodoB() {
		System.out.println("método B");
	}

}
