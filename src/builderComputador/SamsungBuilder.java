package builderComputador;

public class SamsungBuilder extends ComputadorBuilder{
	
	@Override
	public void monitor() {
		pc.monitor = "LCD";
	}

	@Override
	public void anoComputador() {
		pc.anoComputador = 2017;		
	}

	@Override
	public void qtdMemoriaRam() {
		pc.qtdMemoriaRam = 20;		
	}

	@Override
	public void tamanhoHD() {
		pc.tamanhoHD = 2000;
	}

}
