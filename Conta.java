package historico;

public class Conta {

    private Integer numero;//O Numero da conta pode conter somente n�mero e deve ter seis digitos.
    private String tipo;//Corrente ou Poupanca
    private Double limite; //cheque especial, somente conta do tipo corrente.
    private Double saldo;
    private Agencia agencia;

    public Conta(){}
        
    public Conta(Integer numero, String tipo, Agencia agencia) {
    	BankValidator validator = new BankValidator();
    	if(validator.validaNumeroConta(numero)) {
    		this.numero = numero;
    		validaNumero(numero);
    		if(validaTipo(tipo)) {
    			this.tipo = tipo;
    			if(this.tipo.equals("Corrente")) {
					this.limite = 10000.00;
				}
    		}
    		this.saldo = 10000.00 + limite;
    		this.agencia = agencia;
    	}
    }
    
    public boolean validaNumero(Integer codigoFuncional) {
   	 boolean result = true;
   	 String numero = Integer.toString(codigoFuncional);
        if(numero.length() != 6){
            System.out.println("O codigo da conta deve ter 6 digitos");
            result = false;
        }

        return result;
   	 
    }

    public Double getSaldo() {
    	return this.saldo;
    }

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getLimite() {
		return limite;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void depositar(Conta conta, Double valor){
    	Double saldo = conta.getSaldo();
    	conta.setSaldo(saldo += valor);
    }

    public void sacar(Conta conta, Double valor){
    	if(validaSaldo(conta, valor)) {
    		Double saldo = conta.getSaldo();
        	conta.setSaldo(saldo -= valor);
    	}
    }

    public void transferir(Conta origem, Conta destino, Double valor){
    	if(validaSaldo(origem, valor)) {
    		Double saldoOrigem = origem.getSaldo();
        	origem.setSaldo(saldoOrigem -= valor);
        	Double saldoDestino =  destino.getSaldo();
        	destino.setSaldo(saldoDestino += valor);
    	}
    }

    /*
    Método aplicável somente a conta do tipo Poupanca.
     */
    public void creditarRendimentos(Conta conta, Double valor){
    	Double saldo = conta.getSaldo();
    	conta.setSaldo(saldo += valor);
    }

    public void debitarJurosChequeEspecial(Conta conta, Double valor){
    	if(validaSaldo(conta, valor)) {
    		Double saldo = conta.getSaldo();
        	conta.setSaldo(saldo -= valor);
    	}
    }
    
    public boolean validaTipo(String tipo) {
    	boolean result = false;
    	if(tipo.equals("Corrente") || tipo.equals("Poupanca")) {
    		result = true;
    	}
    	return result;    	
    }
    
    public boolean validaSaldo(Conta conta, Double valor) {
    	boolean result = false;
    	if(conta.getSaldo() >= valor)
    		result = true;
    	return result;
    }
}
