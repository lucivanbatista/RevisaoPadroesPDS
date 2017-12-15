package factoryMethodAnswer;

public class Shape implements ShapeInterface{
	public String nome;
	public int lados;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
}
