package Paso2;

public class TPEjecucion extends TareaPeriodica {
	private String cmd;

	public TPEjecucion(String aCmd, int aPeriodoSegs) {
		super(aPeriodoSegs);
		cmd = aCmd;
	}

	public String leerCmd() {
		return cmd;
	}
}
