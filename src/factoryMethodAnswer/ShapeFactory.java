package factoryMethodAnswer;

public interface ShapeFactory { // Aqui modificamos apenas que n�o iremos ter v�rias fun��es, apenas 1 que ser� respons�vel por criar as formas
//	public Shape MakeCircle();
//	public Shape MakeSquare();
	public Shape Make(String nome); // necessitar� do nome para identificarmos o tipo do objeto que ser� retornado
}
