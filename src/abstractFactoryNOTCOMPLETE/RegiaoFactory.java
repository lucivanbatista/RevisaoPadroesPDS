package abstractFactoryNOTCOMPLETE;

public class RegiaoFactory implements FactoryRegiao {

	@Override
	public PizzaFactory criarPizzaFactory(String cidade) {
		if(cidade.equals("sp")){
			return new PizzaFactorySP();
		}else if(cidade.equals("rj")){
			return new PizzaFactoryRJ();
		}
		return null;
	}


}
