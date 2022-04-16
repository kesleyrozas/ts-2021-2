package historico;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco(111, "Inter");
		
		Agencia agencia = new Agencia(3136, "Agencia Senador", "Canedo", banco);	
		
		Conta conta = new Conta(21560, "Corrente", agencia);
		
		//Testando os erros
		
		Banco banco2 = new Banco(1111, "Nu");
		
		Agencia agencia2 = new Agencia(31, "Agen", "Can", banco);	
		
		Conta conta2 = new Conta(21560, "Corrente", agencia);
		
		
		
	}

}
