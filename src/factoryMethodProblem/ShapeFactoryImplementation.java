package factoryMethodProblem;

public class ShapeFactoryImplementation implements ShapeFactory {

	@Override
	public Shape MakeCircle() {
		return new Circle();
	}

	@Override
	public Shape MakeSquare() {
		return new Square();
	}

}
