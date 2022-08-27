package Paso1;

import java.util.*;

public class TareaPeriodica {
	int periodoSegs; // Periodo de ejecución
	Date ultimaEj; // Hora de última ejecución
	boolean activa; // bandera de estado activo/inactivo

	// Constructor genérico
	public TareaPeriodica(int aPeriodoSegs) {
		periodoSegs = aPeriodoSegs;
		actualizarReloj();
		activa = true;
	}

	// Constructor para ejecuciones cada segundo
	public TareaPeriodica() {
		this(1);
	}

	// Establecer la última ejecución a la hora actual
	public void actualizarReloj() {
		ultimaEj = new Date(); // Hora actual
	}

	public boolean necesitaEjecucion() {
		if (!activa)
			return false;
		// Calcular la hora de la próxima ejecución
		Calendar calProximaEj = new GregorianCalendar();
		calProximaEj.setTime(ultimaEj);
		calProximaEj.add(Calendar.SECOND, periodoSegs);
		Calendar calAhora = new GregorianCalendar();
		// Comprobar si ha pasado a la hora actual
		return (calProximaEj.before(calAhora));
	}

	public void ejecutarTarea() {
		for (int i = 0; i < 10000; i++) 
			System.out.println("Ejecución de tarea genérica !!!!!!!!!!!!!!");	
	}

	public void activar() {
		activa = true;
	}

	public void desactivar() {
		activa = false;
	}

}
