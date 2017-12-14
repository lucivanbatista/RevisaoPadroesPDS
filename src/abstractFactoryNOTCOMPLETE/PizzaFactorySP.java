package abstractFactoryNOTCOMPLETE;

public class PizzaFactorySP implements PizzaFactory {
	
	@Override
	public Pizza criarPizza(String tipo) {
		if( tipo.equals("queijo") ){
			return new PizzaQuatroQueijos();
		}
		else if( tipo.equals("portuguesa") ){
			return new PizzaPortuguesa();
		}
		else if( tipo.equals("calabresa") ){
			return new PizzaCalabresa();
		}
		return null;
	}

}
