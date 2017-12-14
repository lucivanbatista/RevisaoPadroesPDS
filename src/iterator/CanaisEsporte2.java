package iterator;

import java.util.ArrayList;

public class CanaisEsporte2 implements AgregadorDeCanais {
	
	protected ArrayList<Canal> canais;
	
	public CanaisEsporte2() {
		canais = new ArrayList<Canal>();
        canais.add(new Canal("Esporte ao vivo"));
        canais.add(new Canal("Basquete 2011"));
        canais.add(new Canal("Campeonato Italiano"));
        canais.add(new Canal("Campeonato Espanhol"));
        canais.add(new Canal("Campeonato Brasileiro"));
	}
	
	@Override
	public IteradorInterface criarIterator() {
		return new IteratorListaDeCanaisInverso(canais);
	}

}
