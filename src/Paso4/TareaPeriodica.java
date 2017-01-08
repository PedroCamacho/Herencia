package Paso4;

import java.util.*;

// Clase abstracta
public abstract class TareaPeriodica {
	protected int periodoSegs; // Periodo de ejecuci�n
	protected Date ultimaEj; // Hora de �ltima ejecuci�n
	protected boolean activa; // bandera de estado activo/inactivo

	// Constructor gen�rico
	public TareaPeriodica(int aPeriodoSegs) {
		periodoSegs = aPeriodoSegs;
		actualizarReloj();
		activa = true;
	}

	// Constructor para ejecuciones cada segundo
	public TareaPeriodica() {
		this(1);
	}

	// Establecer la �ltima ejecuci�n a la hora actual
	public void actualizarReloj() {
		ultimaEj = new Date(); // Hora actual
	}

	public boolean necesitaEjecucion() {
		if (!activa)
			return false;
		// Calcular la hora de la pr�xima ejecuci�n
		Calendar calProximaEj = new GregorianCalendar();
		calProximaEj.setTime(ultimaEj);
		calProximaEj.add(Calendar.SECOND, periodoSegs);
		Calendar calAhora = new GregorianCalendar();
		// Comprobar si ha pasado a la hora actual
		return (calProximaEj.before(calAhora));
	}

	// M�todo abstracto
	public abstract void ejecutarTarea();

	public void activar() {
		activa = true;
	}

	public void desactivar() {
		activa = false;
	}

}
