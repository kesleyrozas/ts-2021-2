package historico;


import java.util.ArrayList;
import java.util.List;

public class Banco {
    private Integer numero;//somente numeros inteiros > 0; O número é formado por três dígitos.
    private String nome;//tamanho entre 5 e 100, somente letras (caracteres válidos).
    private List<Agencia> agencias;
    BankValidator validator = new BankValidator();

    public Banco(){
        this.agencias = new ArrayList<Agencia>();
    }

    public Banco(Integer numero, String nome){
        setNumero(numero);
        validaNumero(numero);
        setNome(nome);
        validaNome(nome);
        this.agencias = new ArrayList<Agencia>();
    }

    
    public boolean validaNome(String nome){
        boolean result = true;
        if(nome.length() < 5 || nome.length() > 100){
            System.out.println("Nome Banco: A quantidade de caracteres de um nome não pode ser inferior e 5 e superior a 100");
            result = false;
        }

        return result;
    }
    
    public boolean validaNumero(Integer codigoFuncional) {
   	 boolean result = true;
   	 String numero = Integer.toString(codigoFuncional);
        if(numero.length() != 3 || codigoFuncional < 0){
            System.out.println("O codigo do banco deve ser menor que 4 digitos");
            result = false;
        }

        return result;
   	 
    }
    
    public List<Agencia> getAgencias() {
        return agencias;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        if (validator.validaNumeroBanco(numero))
            this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (validator.validaNome(nome))
            this.nome = nome;
    }


}
