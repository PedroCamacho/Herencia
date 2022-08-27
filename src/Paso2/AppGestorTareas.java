package Paso2;

public class AppGestorTareas {

	private static void mensaje (TareaPeriodica p) throws ClassNotFoundException{
		if (p instanceof TPAviso)
			System.out.println("Aviso: " + ((TPAviso) p).leerMsg());
		else
			System.out.println("Final de la Tarea Periódica");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		TareaPeriodica tp = new TareaPeriodica(1);
		TPAviso tpa = new TPAviso("Estudiar Principios de la Herencia!", 2);
		while (!tp.necesitaEjecucion())
			System.out.println("Esperando ejecución de tarea periódica...");
		tp.ejecutarTarea();
		mensaje(tp);
		while (!tpa.necesitaEjecucion())
			System.out.println("Esperando ejecución de aviso...");
		mensaje(tpa);
	}
}
