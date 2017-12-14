package abstractFactory;

public interface FabricaDeCarro {
	public CarroSedan criarCarroSedan(String nomeCarro);
    public CarroPopular criarCarroPopular(String nomeCarro);
}
