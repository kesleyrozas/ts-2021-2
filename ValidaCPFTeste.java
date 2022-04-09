package cpf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


public class ValidaCPFTeste {

    private validaCPF app;

    @Before
    public void setup(){
        app = new validaCPF();
    }

//CT01 - Teste do CPF com quantidade de números inferior a 3
    @Test
    public void numCPFMenor3 () {
    	assertFalse(app.isCPF("34"));
    }
    
//CT03 - Teste do CPF com quantidade de números maior que 11
    @Test
    public void numCPFMaior11 () {
    	assertFalse(app.isCPF("702564427657"));
    }
    
//CT05 - Teste se há caractere no cpf.
    @Test
    public void numCPFDiferenteNumero () {
    	assertFalse(app.isCPF("1069975s016"));
    }
    
//CT06 - Teste se todos os dígitos são númericos
    @Test
    public void numCPFNumerico () {
    	assertTrue(app.isCPF("10457048985"));
    }
    
//CT07 - Teste se os números do CPF são iguais
    @Test
    public void numCPFNumerosIguais () {
    	assertFalse(app.isCPF("55555555555"));
    }
    
//CT08 - Teste para verificar a validade do CPF
    @Test
    public void numCPFValido () {
    	assertTrue(app.isCPF("70016691059"));
    }
    
//CT09 - Teste se CPF e Invalido
    @Test
    public void numCPFInvalido () {
    	assertFalse(app.isCPF("70016691059"));
    }
    
//CT10 - Teste se o CPF contém zeros a esquerda
    @Test
    public void numCPFZerosEsquerda () {
    	assertTrue(app.isCPF("00587907098"));
    }
    
//CT11 - Teste CPF valido 191
    @Test
    public void numCPFValido191 () {
    	assertTrue(app.isCPF("191"));
    }
    
}