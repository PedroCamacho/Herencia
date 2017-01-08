package Paso5;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TPEjecucion implements TareaPeriodica {
	private int periodoSegs; // Periodo de ejecuci�n
	private Date ultimaEj; // Hora de �ltima ejecuci�n
	private boolean activa; // bandera de estado activo/inactivo
	private String cmd;

	public TPEjecucion(String aCmd, int aPeriodoSegs) {
		periodoSegs = aPeriodoSegs;
		actualizarReloj();
		activa = true;
		cmd = aCmd;
	}
	public String leerCmd() {
		return cmd;
	}
	// M�todo implementado
	public void ejecutarTarea() {
		try {
			Runtime.getRuntime().exec(cmd);
		}
		catch(IOException e) {
			System.out.println("Imposible ejecutar comando: "+ cmd);
		}
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
