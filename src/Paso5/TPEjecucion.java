package Paso5;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TPEjecucion implements TareaPeriodica {
	private int periodoSegs; // Periodo de ejecución
	private Date ultimaEj; // Hora de última ejecución
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
	// Método implementado
	public void ejecutarTarea() {
		try {
			Runtime.getRuntime().exec(cmd);
		}
		catch(IOException e) {
			System.out.println("Imposible ejecutar comando: "+ cmd);
		}
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
