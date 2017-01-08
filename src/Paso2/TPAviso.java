package Paso2;

public class TPAviso extends TareaPeriodica {
	private String msg;

	public TPAviso(String aMsg, int aPeriodoSegs) {
		super(aPeriodoSegs);
		msg = aMsg;
	}

	public String leerMsg() {
		return msg;
	}
}
