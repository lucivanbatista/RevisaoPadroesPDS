package factoryMethod;

public class FabricaChevrolet implements FabricaDeCarro {

	@Override
	public Carro criarCarro(String nomeCarro) {
		if(nomeCarro.equals("Celta")){
			return new Celta();
		}
		return null;
	}

}
