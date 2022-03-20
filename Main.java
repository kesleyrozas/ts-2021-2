package historico;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		Funcionario[] vetorFunc = new Funcionario[10];
		
		Funcionario func = new Funcionario("Kesley", 1001, "medio", "vendedor", 250.00);
		vetorFunc[0] = func;
		Funcionario func2 = new Funcionario("Rozas", 1002, "basico", "vendedor", 250.00);
		vetorFunc[1] = func2;
		Funcionario func3 = new Funcionario("Maria", 1003, "medio", "vendedor", 250.00);
		vetorFunc[2] = func3;
		Funcionario func4 = new Funcionario("Jose Alberto", 1004, "basico", "vendedor", 250.00);
		vetorFunc[3] = func4;
		Funcionario func5 = new Funcionario("Carlos", 1005, "medio", "vendedor", 250.00);
		vetorFunc[4] = func5;
		Funcionario func6 = new Funcionario("Josiane", 1006, "basico", "vendedor", 250.00);
		vetorFunc[5] = func6;
		Funcionario func7 = new Funcionario("Mateus", 1007, "medio", "vendedor", 250.00);
		vetorFunc[6] = func7;
		Funcionario func8 = new Funcionario("Marcos", 1008, "medio", "supervisor", 600.00);
		vetorFunc[7] = func8;
		Funcionario func9 = new Funcionario("Marlos", 1009, "medio", "supervisor", 600.00);
		vetorFunc[8] = func9;
		Funcionario func10 = new Funcionario("Ana Paula", 1010, "graduacao", "gerente", 1500.00);
		vetorFunc[9] = func10;
		
		empresa.setFuncionarios(vetorFunc);
		
		for(Funcionario funcionarios : vetorFunc) {
			funcionarios.atualizaRendaTotal();
			funcionarios.atualizaComissoes();
			empresa.totalizaRendaPorEscolaridade(funcionarios);
			System.out.println(funcionarios.toString());
		}
		
	}

}
