package Paso5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TPAviso implements TareaPeriodica {
	private Date ultimaEj;
	private boolean activa;
	private int periodoSegs;
	private String msg;

	public TPAviso(String aMsg, int aPeriodoSegs) {
		periodoSegs = aPeriodoSegs;
		actualizarReloj();
		activa = true;
		msg = aMsg;
	}
	public String leerMsg() {
		return msg;
	}
	// M�todo implementado
	public void ejecutarTarea() {
		System.out.println("ATENCI�N AVISO: " + msg);
		desactivar();
	}
	// M�todo implementado
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

	// M�todo implementado
	public void activar() {
		activa = true;
	}

	// M�todo implementado
	public void desactivar() {
		activa = false;
	}

	public void actualizarReloj() {
		ultimaEj = new Date(); // Hora actual
	}
}
