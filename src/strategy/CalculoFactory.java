package strategy;

public class CalculoFactory {

	public CalculaImposto criarFactory(Funcionario f){
		if(f.getCargo().equals("Gerente")){
			return new CalculoImpostoVinteOuQuinze();
		}else if(f.getCargo().equals("DBA") || f.getCargo().equals("Desenvolvedor")){
			return new CalculoImpostoQuinzeOuDez();
		}
		return null;
	}
}
