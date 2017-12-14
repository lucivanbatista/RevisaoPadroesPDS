package abstractFactory;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan(String nomeCarro) {
		if(nomeCarro.equals("Fiesta Sedan")){
			return new FiestaSedan();
		}
		return null;
	}

	@Override
	public CarroPopular criarCarroPopular(String nomeCarro) {
		if(nomeCarro.equals("Fiesta")){
			return new Fiesta();
		}
		return null;
	}

}
