package iterator;

public class MainIterator {

	public static void main(String[] args) {
		AgregadorDeCanais canaisDeEsportes = new CanaisEsporte();
	    System.out.println("Canais de Esporte:");
	    for (IteradorInterface it = canaisDeEsportes.criarIterator(); !it.isDone(); it.next()) {
	        System.out.println(it.currentItem().nome);
	    }
	    
	    AgregadorDeCanais canaisDeEsportesI = new CanaisEsporte2();
	    System.out.println("\nCanais de Esporte Inverso:");
	    for (IteradorInterface it = canaisDeEsportesI.criarIterator(); !it.isDone(); it.next()) {
	        System.out.println(it.currentItem().nome);
	    }
	 
	    AgregadorDeCanais canaisDeFilmes = new CanaisFilmes();
	    System.out.println("\nCanais de Filmes:");
	    for (IteradorInterface it = canaisDeFilmes.criarIterator(); !it.isDone(); it.next()) {
	        System.out.println(it.currentItem().nome);
	    }
	}

}
