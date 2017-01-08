package Paso2;

public class AppGestorTareas {

	private static void mensaje (TareaPeriodica p){
		if (p instanceof TPAviso)
			System.out.println("Aviso: " + ((TPAviso) p).leerMsg());
		else
			System.out.println("Final de la Tarea Peri�dica");
	}
	
	public static void main(String[] args) {
		TareaPeriodica tp = new TareaPeriodica(1);
		TPAviso tpa = new TPAviso("Estudiar Principios de la Herencia!", 2);
		while (!tp.necesitaEjecucion())
			System.out.println("Esperando ejecuci�n de tarea peri�dica...");
		tp.ejecutarTarea();
		mensaje(tp);
		while (!tpa.necesitaEjecucion())
			System.out.println("Esperando ejecuci�n de aviso...");
		mensaje(tpa);
	}
}
