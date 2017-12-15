package builderComputador;

public abstract class ComputadorBuilder {
	protected Computador pc;
	
	public ComputadorBuilder() {
		pc = new Computador();
	}
	
	public abstract void monitor();
	
	public abstract void anoComputador();
	
	public abstract void qtdMemoriaRam();
	
	public abstract void tamanhoHD();
	
	public Computador getComputador(){
		return pc;
	}
}
