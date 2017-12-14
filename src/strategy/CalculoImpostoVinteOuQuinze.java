package strategy;

public class CalculoImpostoVinteOuQuinze implements CalculaImposto {

	@Override
	public double calculaSalarioComImposto(Funcionario umFuncionario) {
		if (umFuncionario.getSalario() > 3500) {
            return umFuncionario.getSalario() * 0.8;
        }
        return umFuncionario.getSalario() * 0.85;
	}

}
