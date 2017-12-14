package factoryMethod;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public Carro criarCarro(String nomeCarro) {
		if(nomeCarro.equals("Palio")){
			return new Palio();
		}else if(nomeCarro.equals("Siena")){
			return new Siena();
		}
		return null;
	}

}
