package historico;

public class Empresa {
	
	private Funcionario[] funcionarios;//Vetor de funcionários, com 10 posiçoes dos quais: 70% são vendedores; 20% são supervisores e 10% gerentes;
    private Double totalRendaEnsinoBasico = 0.0;//Atributo definido para totalizar os valores pagos aos funcionários com ensino básico;
    private Double totalRendaEnsinoMedio = 0.0;//Atributo definido para totalizar os valores pagos aos funcionários com ensino médio;
    private Double totalRendaGraduacao = 0.0;//Atributo definido para totalizar os valores pagos aos funcionários graduados;
    
    
    public void atualizaRemuneracao(){
    	//Método definido para invocar o método atualizaRendaTotal() para cada um dos funcionários constantes do vetor;
    }
    public void atualizaAtualizaComissoes(){
    	// //Método definido para invocar o método atualizaComissoes() para cada um dos funcionários constantes do vetor;
    }
    public void totalizaRendaPorEscolaridade(Funcionario func){
    	if(func.getEscolaridade().equalsIgnoreCase("basico")) {
			this.totalRendaEnsinoBasico += func.getRendaTotal();
		}else if (func.getEscolaridade().equalsIgnoreCase("medio")) {
			this.totalRendaEnsinoMedio += func.getRendaTotal();
		}else if(func.getEscolaridade().equalsIgnoreCase("graduacao")) {
			this.totalRendaGraduacao += func.getRendaTotal();
		}
    }
    
    
	public Double getTotalRendaEnsinoBasico() {
		return totalRendaEnsinoBasico;
	}
	
	public void setTotalRendaEnsinoBasico(Double totalRendaEnsinoBasico) {
		this.totalRendaEnsinoBasico = totalRendaEnsinoBasico;
	}
	
	public Double getTotalRendaEnsinoMedio() {
		return totalRendaEnsinoMedio;
	}
	
	public void setTotalRendaEnsinoMedio(Double totalRendaEnsinoMedio) {
		this.totalRendaEnsinoMedio = totalRendaEnsinoMedio;
	}
	
	public Double getTotalRendaGraduacao() {
		return totalRendaGraduacao;
	}
	
	public void setTotalRendaGraduacao(Double totalRendaGraduacao) {
		this.totalRendaGraduacao = totalRendaGraduacao;
	}
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
    
    
}
