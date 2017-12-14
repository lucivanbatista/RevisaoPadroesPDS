package abstractFactoryNOTCOMPLETE;

public class Pizzaria {
	private Pizza pizza;
	
	public void criarPizza(String tipo, String cidade){
		RegiaoFactory regiao = new RegiaoFactory();
		PizzaFactory pizzaFactory= regiao.criarPizzaFactory(cidade);
		this.pizza = pizzaFactory.criarPizza(tipo);
	}
}
