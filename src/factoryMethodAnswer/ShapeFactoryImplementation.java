package factoryMethodAnswer;

public class ShapeFactoryImplementation implements ShapeFactory { // aqui coloca-se os if e else

//	@Override
//	public Shape MakeCircle() {
//		return new Circle();
//	}
//
//	@Override
//	public Shape MakeSquare() {
//		return new Square();
//	}
	
	@Override
	public Shape Make(String nome){
		if(nome.equals("Circulo")){
			return new Circle();
		}else if(nome.equals("Quadrado")){
			return new Shape();
		}else{
			System.out.println("ShapeFactory cannot create " + nome);
			return null;
		}
	}
}
