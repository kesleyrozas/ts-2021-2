package historico;

public class Empresa {
	
	private Funcionario[] funcionarios;//Vetor de funcion�rios, com 10 posi�oes dos quais: 70% s�o vendedores; 20% s�o supervisores e 10% gerentes;
    private Double totalRendaEnsinoBasico = 0.0;//Atributo definido para totalizar os valores pagos aos funcion�rios com ensino b�sico;
    private Double totalRendaEnsinoMedio = 0.0;//Atributo definido para totalizar os valores pagos aos funcion�rios com ensino m�dio;
    private Double totalRendaGraduacao = 0.0;//Atributo definido para totalizar os valores pagos aos funcion�rios graduados;
    
    
    public void atualizaRemuneracao(){
    	//M�todo definido para invocar o m�todo atualizaRendaTotal() para cada um dos funcion�rios constantes do vetor;
    }
    public void atualizaAtualizaComissoes(){
    	// //M�todo definido para invocar o m�todo atualizaComissoes() para cada um dos funcion�rios constantes do vetor;
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
