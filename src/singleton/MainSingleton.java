package singleton;

public class MainSingleton {

	public static void main(String[] args) {
		ShapeFactoryImplementation fabrica = ShapeFactoryImplementation.getInstanciaUnica();
		System.out.println(fabrica.Make("Quadrado"));
		System.out.println(fabrica.Make("Quadrado"));
		System.out.println(fabrica.Make("Quadrado"));
		System.out.println(fabrica.Make("Circulo"));
	    System.out.println(fabrica.gerarRelatorio());
	}

}
