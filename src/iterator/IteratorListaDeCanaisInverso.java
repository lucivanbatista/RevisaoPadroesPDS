package iterator;

import java.util.ArrayList;

public class IteratorListaDeCanaisInverso implements IteradorInterface {
	protected ArrayList<Canal> lista;
	protected int contador;
	
	public IteratorListaDeCanaisInverso(ArrayList<Canal> lista) {
		this.lista = lista;
		first();
	}
	
	@Override
	public void first() {
		contador = lista.size() - 1;
	}

	@Override
	public void next() {
		contador--;
	}

	@Override
	public boolean isDone() {
		return contador < 0;
	}

	@Override
	public Canal currentItem() {
		if(isDone()){
			contador = 0;
		}else if(contador >= lista.size()){
			contador = lista.size() - 1;
		}
		return lista.get(contador);
	}

}
