package Paso1;

public class AppGestorTareas {
	public static void main(String[] args) {
		TareaPeriodica tp = new TareaPeriodica(1);
		TPAviso tpa = new TPAviso("Estudiar Principios de la Herencia!", 2);
		while (!tp.necesitaEjecucion())
			System.out.println("Esperando ejecución de tarea periódica...");
		tp.ejecutarTarea();
		while (!tpa.necesitaEjecucion())
			System.out.println("Esperando ejecución de aviso...");
		System.out.println("Aviso: " + tpa.leerMsg());
	}
}
