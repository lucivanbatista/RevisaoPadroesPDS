package decorator;

public class Acucar extends CoquetelDecorator{

	public Acucar(Coquetel c) {
		super(c);
		nome = "Acucar";
		preco = 1;
	}

}
