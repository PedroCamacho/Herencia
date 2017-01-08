package Paso1;

public class TPEjecucion extends TareaPeriodica {
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
}
