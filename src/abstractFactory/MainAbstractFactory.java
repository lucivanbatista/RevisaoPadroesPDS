package abstractFactory;

public class MainAbstractFactory {

	public static void main(String[] args) {
	    FabricaDeCarro fabrica = new FabricaFiat();
	    CarroSedan sedan = fabrica.criarCarroSedan("Siena");
	    CarroPopular popular = fabrica.criarCarroPopular("Palio");
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	    System.out.println();
	 
	    fabrica = new FabricaFord();
	    sedan = fabrica.criarCarroSedan("Fiesta Sedan");
	    popular = fabrica.criarCarroPopular("Fiesta");
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	}

}
