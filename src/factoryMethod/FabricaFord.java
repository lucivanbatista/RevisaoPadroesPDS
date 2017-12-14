package factoryMethod;

public class FabricaFord implements FabricaDeCarro {
	
	@Override
	public Carro criarCarro(String nomeCarro) {
		if(nomeCarro.equals("Fiesta")){
			return new Fiesta();
		}
		return null;
	}

}
