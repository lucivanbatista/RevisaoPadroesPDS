package factoryMethodAnswer;

public interface ShapeFactory { // Aqui modificamos apenas que não iremos ter várias funções, apenas 1 que será responsável por criar as formas
//	public Shape MakeCircle();
//	public Shape MakeSquare();
	public Shape Make(String nome); // necessitará do nome para identificarmos o tipo do objeto que será retornado
}
