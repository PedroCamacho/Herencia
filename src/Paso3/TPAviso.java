package Paso3;

public class TPAviso extends TareaPeriodica {
	private String msg;

	public TPAviso(String aMsg, int aPeriodoSegs) {
		super(aPeriodoSegs);
		msg = aMsg;
	}
	public String leerMsg() {
		return msg;
	}
	// M�todo redefinido
	@Override
	public void ejecutarTarea() {
		System.out.println("ATENCI�N AVISO: " + msg);
		desactivar();
	}

}
