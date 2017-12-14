package decorator;

public class Gelo extends CoquetelDecorator{

	public Gelo(Coquetel c) {
		super(c);
		nome = "Gelo";
		preco = 0.1;
	}

}
