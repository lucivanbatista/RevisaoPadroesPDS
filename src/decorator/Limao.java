package decorator;

public class Limao extends CoquetelDecorator{

	public Limao(Coquetel c) {
		super(c);
		nome = "Limao";
		preco = 0.5;
	}

}
