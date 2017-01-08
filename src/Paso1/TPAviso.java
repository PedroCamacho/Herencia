package Paso1;

public class TPAviso extends TareaPeriodica {
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
}
