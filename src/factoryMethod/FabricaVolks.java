package factoryMethod;

public class FabricaVolks implements FabricaDeCarro {

	@Override
	public Carro criarCarro(String nomeCarro) {
		if(nomeCarro.equals("Gol")){
			return new Gol();
		}
		return null;
	}

}
