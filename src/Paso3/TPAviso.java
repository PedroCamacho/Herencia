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
	// Método redefinido
	@Override
	public void ejecutarTarea() {
		System.out.println("ATENCIÓN AVISO: " + msg);
		desactivar();
	}

}
