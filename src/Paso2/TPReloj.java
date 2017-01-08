package Paso2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TPReloj extends TareaPeriodica {
	public TPReloj() {
		super(60); // Comprobar cada minuto
	}

	public String leerHora() {
		Calendar cal = new GregorianCalendar();
		return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
	}
}
