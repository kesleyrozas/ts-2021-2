package historico;

public class Funcionario {

	private String nome;
	 private Integer codigoFuncional;//deve possuir quatro dígitos inteiros positivos;
     private Double rendaBasica = 1000.00;//Este atributo receberá o valor de R$ 1000.00
     private String escolaridade;// deve possuir um dos seguintes valores {nenhum, basico, medio, graduacao}.
     private String cargo;//conter um dos valores: {vendedor, supervisor, gerente}.
     private Double comissao = 0.0;//(gerente R$ 1500,00; supervisor = R$ 600,00 e vendedor = 250,00)
     private Double rendaTotal = 0.0;
     
     
     public Funcionario(String nome, Integer codigoFuncional, String escolaridade, String cargo,
			Double comissao) {
		super();
		
		this.nome = nome;
		validaNome(nome);

		this.codigoFuncional = codigoFuncional;
		validaCodigoFuncional(codigoFuncional);
	
		this.escolaridade = escolaridade;
		validaEscolaridade(escolaridade);

		this.cargo = cargo;
		validaCargo(cargo);
		
		this.rendaBasica = rendaBasica;
		this.comissao = comissao;
	}
     
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public void atualizaRendaTotal(){
		if(this.escolaridade.equals("basico")) {
			this.rendaBasica +=  this.rendaBasica * 0.10;
			this.rendaTotal += rendaBasica;
		}else if (this.escolaridade.equals("medio")) {
			this.rendaBasica +=  this.rendaBasica * 0.10;
			this.rendaTotal += rendaBasica;
		}else if(this.escolaridade.equals("graduacao")) {
			this.rendaBasica =  this.rendaBasica * 2;
			this.rendaTotal += rendaBasica;
		}
	}
     //ensino básico = 10% de incremento na renda básica;
     //ensino médio = 10% de incremento na renda básica;
     //graduação = 100% de incremento na renda básica.
     public void atualizaComissoes(){//Método definido para atualizar a renda total do funcionário, a partir da comissão paga pelo seu cargo. sendo:
     	if(this.cargo.equals("gerente")) {
			this.rendaTotal +=  1500.00;
		}else if (this.cargo.equals("supervisor")) {
			this.rendaTotal +=  600.00;
		}else if(this.cargo.equals("vendedor")) {
			this.rendaTotal +=  250.00;
		}
	}
     //gerente R$ 1500,00;
     //supervisor = R$ 600,00 e
     //vendedor = 250,00
     public boolean validaNome(String nome){
         boolean result = true;
         if(nome.length() < 5 || nome.length() > 100){
             System.out.println("A quantidade de caracteres de um nome nÃ£o pode ser inferior e 5 e superior a 100");
             result = false;
         }

         return result;
     }
     public boolean validaCodigoFuncional(Integer codigoFuncional) {
    	 boolean result = true;
    	 String numero = Integer.toString(codigoFuncional);
         if(numero.length() < 4 ){
             System.out.println("O codigo deve ser maior que 4 digitos");
             result = false;
         }

         return result;
    	 
     }//Método definido para validar o código funcional;
     public boolean validaEscolaridade(String escolaridade){
    	 //Método definido para validar a escolaridade do funcionário;
    	// deve possuir um dos seguintes valores {nenhum, basico, medio, graduacao}.
    	 boolean result = true;
    	 
    	 if(escolaridade != "nenhum" && escolaridade != "basico" && 
    			 escolaridade != "medio" && escolaridade != "graduacao") {
    		 
    		 result = false;
    		 System.out.println("O tipo da escolaridade está errado");
    	 }else {
    		 return result;
    	 }

         return result;
     }
     public boolean validaCargo(String cargo){
    	 //Método definido para validar o cargo do funcionário.
    	//conter um dos valores: {vendedor, supervisor, gerente}.
    	 boolean result = true;
         
    	 if(cargo != "vendedor" && cargo != "supervisor" && 
    			 cargo != "gerente") {
    		 
    		 result = false;
    		 System.out.println("O tipo do cargo está errado");
    	 }else {
    		 return result;
    	 }

         return result;
     }
     
     
	
     public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(Integer codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public Double getRendaBasica() {
		return rendaBasica;
	}

	public void setRendaBasica(Double rendaBasica) {
		this.rendaBasica = rendaBasica;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getRendaTotal() {
		return rendaTotal;
	}

	public void setRendaTotal(Double rendaTotal) {
		this.rendaTotal = rendaTotal;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", codigoFuncional=" + codigoFuncional + ", rendaBasica=" + rendaBasica
				+ ", escolaridade=" + escolaridade + ", cargo=" + cargo + ", comissao=" + comissao + ", rendaTotal="
				+ rendaTotal + "]";
	}
    
     
    
}
