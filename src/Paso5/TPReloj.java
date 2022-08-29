package Paso5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TPReloj implements TareaPeriodica {
	private Date ultimaEj;
	private boolean activa;
	private int periodoSegs;

	public TPReloj() {
		periodoSegs = 60;
		activa = true;
		actualizarReloj();
	}

	public String leerHora() {
		Calendar cal = new GregorianCalendar();
		return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
	}

	// Método implementado
	public void ejecutarTarea() {
		Calendar cal = new GregorianCalendar();
		int min = cal.get(Calendar.MINUTE);
		System.out.println("Hora: " + cal.get(Calendar.HOUR_OF_DAY) + " " + min);
		ultimaEj = cal.getTime();
	}

	// Método implementado
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

	// Método implementado
	public void activar() {
		activa = true;
	}

	// Método implementado
	public void desactivar() {
		activa = false;
	}

	public void actualizarReloj() {
		ultimaEj = new Date(); // Hora actual
	}
}
