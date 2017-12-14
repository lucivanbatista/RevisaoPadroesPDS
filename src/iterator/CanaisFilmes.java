package iterator;

import java.util.ArrayList;

public class CanaisFilmes implements AgregadorDeCanais {
	
	protected Canal[] canais;

	public CanaisFilmes() {
		canais = new Canal[4];
		canais[0] = new Canal("Cinemax");
		canais[1] = new Canal("HBO");
		canais[2] = new Canal("FOX");
		canais[3] = new Canal("Sony");
	}
	
	@Override
	public IteradorInterface criarIterator() {
		return new IteradorMatrizDeCanais(canais);
	}

}
