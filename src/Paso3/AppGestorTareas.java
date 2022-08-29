package Paso3;

public class AppGestorTareas {
	public static void main(String[] args) {
		TareaPeriodica tp = new TareaPeriodica(1);
		TPAviso tpa = new TPAviso("Estudiar Programación Avanzada !", 2);
		TPEjecucion tpe = new TPEjecucion("calc.exe", 5);

		while (!tp.necesitaEjecucion())
			System.out.println("Esperando ejecución de tarea periódica...");
		tp.ejecutarTarea();

		while (!tpa.necesitaEjecucion())
			System.out.println("Esperando ejecución de aviso...");
		tpa.ejecutarTarea();

		while (!tpe.necesitaEjecucion())
			System.out.println("Esperando ejecución de comando...");
		tpe.ejecutarTarea();

	}
}
