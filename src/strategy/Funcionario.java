package strategy;

public class Funcionario {
	public double Salario;
	public String cargo;
	
	public Funcionario(double salario, String cargo) {
		this.Salario = salario;
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return Salario;
	}
	
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double salarioComImposto(){
		CalculaImposto calculoImposto = new CalculoFactory().criarFactory(this);
		return calculoImposto.calculaSalarioComImposto(this);
	}
	
}
