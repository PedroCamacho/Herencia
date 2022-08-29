package Paso5;

public class AppGestorTareas {
	public static void main(String[] args) {
		TPAviso tpa = new TPAviso("Estudiar Programación Avanzada !", 2);
		TPEjecucion tpe = new TPEjecucion("calc.exe", 5);

		while (!tpa.necesitaEjecucion())
			System.out.println("Esperando ejecución de aviso...");
		tpa.ejecutarTarea();

		while (!tpe.necesitaEjecucion())
			System.out.println("Esperando ejecución de comando...");
		tpe.ejecutarTarea();

	}
}
