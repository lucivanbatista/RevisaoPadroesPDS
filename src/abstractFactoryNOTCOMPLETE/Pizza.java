package abstractFactoryNOTCOMPLETE;

public abstract class Pizza {
	public String sabor;
	private Massa massa;
    private Queijo queijo;
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}	
	
}
