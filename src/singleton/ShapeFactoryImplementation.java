package singleton;

public class ShapeFactoryImplementation implements ShapeFactory {
	public static ShapeFactoryImplementation instanciaUnica;
	protected int totalShapeQuadrado;
	protected int totalShapeCirculo;
	
	protected ShapeFactoryImplementation() {
		
	}
	
	public static ShapeFactoryImplementation getInstanciaUnica(){
		if(instanciaUnica == null){
			instanciaUnica = new ShapeFactoryImplementation();
		}
		return instanciaUnica;
	}
	
	@Override
	public Shape Make(String nome){
		if(nome.equals("Circulo")){
			criarCirculo();
			return new Circle();
		}else if(nome.equals("Quadrado")){
			criarQuadrado();
			return new Shape();
		}else{
			System.out.println("ShapeFactory cannot create " + nome);
			return null;
		}
	}
	
    public String criarQuadrado() {
        return new String("Quadrado #" + totalShapeQuadrado++ + " criado.");
    }
 
    public String criarCirculo() {
        return new String("Circulo #" + totalShapeCirculo++ + " criado.");
    }
 
    public String gerarRelatorio() {
        return new String("Total de quadrados vendidos: " + totalShapeQuadrado
                + "\nTotal de circulos vendidos: " + totalShapeCirculo);
    }
	
}
