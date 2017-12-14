package abstractFactory;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan(String nomeCarro) {
		if(nomeCarro.equals("Siena")){
			return new Siena();
		}
		return null;
	}

	@Override
	public CarroPopular criarCarroPopular(String nomeCarro) {
		if(nomeCarro.equals("Palio")){
			return new Palio();
		}
		return null;
	}

}
