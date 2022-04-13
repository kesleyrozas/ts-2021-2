package historico;

public class Agencia {
    private Integer numero;//o número deve ter 3 digitos no mínimo e 5 no máximo
    private String nome;//Segue a mesma lógica da validação do nome do Banco.
    private String cidade;//Segue a mesma lógica da validação do nome do Banco.
    private Banco banco;
    private BankValidator validator = new BankValidator();

    public Agencia(){}

    public Agencia(Integer num, String nome, String cidade, Banco banco){
        if (validator.validaNumeroAgencia(num) && validator.validaNome(nome) && validator.validaNome(cidade)){
            this.numero = num;
            validaNumero(num);
            this.nome = nome;
            validaNome(nome);
            this.cidade = cidade;
            validaCidade(cidade);
            this.banco = banco;
            banco.getAgencias().add(this);
        }
    }
    
    public boolean validaNome(String nome){
        boolean result = true;
        if(nome.length() < 5 || nome.length() > 100){
            System.out.println("Nome Agencia: A quantidade de caracteres de um nome não pode ser inferior e 5 e superior a 100");
            result = false;
        }

        return result;
    }
    
    public boolean validaCidade(String nome){
        boolean result = true;
        if(nome.length() < 5 || nome.length() > 100){
            System.out.println("A quantidade de caracteres de uma cidade não pode ser inferior e 5 e superior a 100");
            result = false;
        }

        return result;
    }
    
    public boolean validaNumero(Integer codigoFuncional) {
   	 boolean result = true;
   	 String numero = Integer.toString(codigoFuncional);
        if(numero.length() < 3 || numero.length() > 5){
            System.out.println("O codigo deve ter 3 digitos e no maximo 5");
            result = false;
        }

        return result;
   	 
    }

    public Banco getBanco(){
        return this.banco;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }
}


