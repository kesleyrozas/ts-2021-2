package Funcionario;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import historico.Agencia;
import historico.Banco;
import historico.Conta;

public class ContaTest {

	@Test
    public void testNumeroMaiorQueSeisDigitos() {
        Banco banco = new Banco(104, "Banco  Inter");
        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
        Conta conta = new Conta(1234567, "Corrente", agencia);
        assertNull(conta.getNumero());
    }
	
	@Test(expected=NullPointerException.class)
    public void testTipoInvalido() {
        Banco banco = new Banco(104, "Banco  Inter");
        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
        Conta conta = new Conta(123456, "Corrent", agencia);
    }
	
    @Test
    public void testNumeroValido() {
        Banco banco = new Banco(104, "Banco  Inter");
        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
        Conta conta = new Conta(123456, "Corrente", agencia);
        assertEquals(conta.getNumero(), Integer.valueOf(123456));
    }

    @Test
    public void testTipoValido() {
        Banco banco = new Banco(104, "Banco  Inter");
        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
        Conta conta = new Conta(123456, "Corrente", agencia);
        assertEquals(conta.getTipo(),  "Corrente");
    }

    @Test
    public void testLimiteContaCorrente() {
        Banco banco = new Banco(104, "Banco  Inter");
        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
        Conta conta = new Conta(123456, "Corrente", agencia);
        assertEquals(conta.getLimite(),  Double.valueOf(10000));
    }
    
    @Test(expected=NullPointerException.class)
    public void testLimiteContaPoupanca() {
        Banco banco = new Banco(104, "Banco  Inter");
        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
        Conta conta = new Conta(123456, "Poupanca", agencia);
    }

    @Test
    public void testSaldoAposSaque() {
        Banco banco = new Banco(104, "Banco  Inter");
        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
        Conta conta = new Conta(123456, "Corrente", agencia);
        conta.sacar(conta, 1000.0);
        assertEquals(conta.getSaldo(),  Double.valueOf(19000));
    }
    
    @Test
    public void testSaldoAposTransferencia() {
        Banco banco = new Banco(104, "Banco  Inter");
        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
        Conta conta = new Conta(123456, "Corrente", agencia);
        Conta contaDois = new Conta(123457, "Corrente", agencia);
        conta.transferir(conta, contaDois,  1000.0);
        assertEquals(contaDois.getSaldo(),  Double.valueOf(21000));
    }
    
    @Test
    public void testSaldoAposDeposito() {
        Banco banco = new Banco(104, "Banco  Inter");
        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
        Conta conta = new Conta(123456, "Corrente", agencia);
        conta.depositar(conta, 1000.0);
        assertEquals(conta.getSaldo(),  Double.valueOf(21000));
    }

}
