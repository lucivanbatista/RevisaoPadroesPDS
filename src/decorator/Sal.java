package decorator;

public class Sal extends CoquetelDecorator{

	public Sal(Coquetel c) {
		super(c);
		nome = "Sal";
		preco = 0.2;
	}

}
