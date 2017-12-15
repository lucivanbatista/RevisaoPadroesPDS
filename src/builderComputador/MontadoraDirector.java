package builderComputador;

public class MontadoraDirector {
	protected ComputadorBuilder pc;
	
	public MontadoraDirector(ComputadorBuilder pc) {
		this.pc = pc;
	}
	
	public void criarPC(){
		pc.monitor();
		pc.anoComputador();
		pc.qtdMemoriaRam();
		pc.tamanhoHD();
	}
	
	public Computador getComputador(){
		return pc.getComputador();
	}
}
