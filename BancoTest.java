package Funcionario;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import historico.Agencia;
import historico.Banco;

public class BancoTest {
	 
	@Test
	    public void testNumeroMenorQueTresDigitos() {
	        Banco banco = new Banco(24, "Banco Inter FC");
	        assertNull(banco.getNumero());
	    }

	    @Test
	    public void testNumeroNegativo() {
	        Banco banco = new Banco(-455, "Banco Inter FC");
	        assertNull(banco.getNumero());
	    }

	    @Test
	    public void testNumeroValido() {
	        Banco banco = new Banco(455, "Banco Inter FC");
	        assertEquals(banco.getNumero(), Integer.valueOf(455));
	    }

	    @Test
	    public void testNomeMenorQueCincoCaracteres() {
	        Banco banco = new Banco(243, "Nuu");
	        assertNull(banco.getNome());
	    }

	    @Test
	    public void testNomeMaiorQueCemCaracteres() {
	        Banco banco = new Banco(243, "Nuu".repeat(50));
	        assertNull(banco.getNome());
	    }

	    @Test
	    public void testNomeApenasCaracteres() {
	        Banco banco = new Banco(243, "Banco In 25");
	        assertNull(banco.getNome());
	    }

	    @Test
	    public void testNomeValido() {
	        Banco banco = new Banco(455, "Banco Inter FC");
	        assertEquals(banco.getNome(), "Banco Inter FC");
	    }

}
