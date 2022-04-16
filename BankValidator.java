package historico;

import org.apache.commons.lang.StringUtils;

public class BankValidator {
    public boolean validaNumeroBanco(Integer numero){
        boolean result = false;
        char[] digitos = numero.toString().toCharArray();
        for(int i = 0; i< digitos.length; i++){
            if(digitos.length != 3) {
                result = false;
                return result;
            }
            else if(Character.isDigit(digitos[i])){
                result = true;
            }
        }
        return result;
    }

    public boolean validaNumeroAgencia(Integer numero){
        boolean result = false;
        char[] digitos = numero.toString().toCharArray();
        for(int i = 0; i< digitos.length; i++){
            if(digitos.length < 3 || digitos.length > 5) {
                result = false;
                return result;
            }
            else if(Character.isDigit(digitos[i])){
                result = true;
            }
        }
        return result;
    }
    
    public boolean validaNumeroConta(Integer numero){
        boolean result = false;
        char[] digitos = numero.toString().toCharArray();
        for(int i = 0; i< digitos.length; i++){
            if(digitos.length < 6 || digitos.length > 6) {
                result = false;
                return result;
            }
            else if(Character.isDigit(digitos[i])){
                result = true;
            }
        }
        return result;
    }

    public boolean validaNome(String nome){
        boolean valido = true;
        String result = StringUtils.deleteWhitespace(nome);
        for(int i = 0; i < result.length(); i++){
            if(!Character.isAlphabetic(result.charAt(i))){
                valido = false;
            }else if(result.length() < 5 || result.length() > 100){
                valido = false;
            }
        }
        return valido;
    }
}
