package Paso3;

public class AppGestorTareas {
	public static void main(String[] args) {
		TareaPeriodica tp = new TareaPeriodica(1);
		TPAviso tpa = new TPAviso("Estudiar Programaci�n Avanzada !", 2);
		TPEjecucion tpe = new TPEjecucion("calc.exe", 5);

		while (!tp.necesitaEjecucion())
			System.out.println("Esperando ejecuci�n de tarea peri�dica...");
		tp.ejecutarTarea();

		while (!tpa.necesitaEjecucion())
			System.out.println("Esperando ejecuci�n de aviso...");
		tpa.ejecutarTarea();

		while (!tpe.necesitaEjecucion())
			System.out.println("Esperando ejecuci�n de comando...");
		tpe.ejecutarTarea();

	}
}
