package Paso1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TPReloj extends TareaPeriodica {
	public TPReloj() {
		periodoSegs = 60; // Comprobar cada minuto
		actualizarReloj();
		activa = true;
	}

	public String leerHora() {
		Calendar cal = new GregorianCalendar();
		return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
	}
}
