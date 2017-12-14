package decorator;

public class MainDecorator {

	public static void main(String[] args) {
		Coquetel meuCoquetel = new Vodka();
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());
 
        meuCoquetel = new Gelo(meuCoquetel);
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());
        
        meuCoquetel = new Acucar(meuCoquetel);
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());

	}

}
