package Funcionario;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import historico.Agencia;
import historico.Banco;

public class AgenciaTest {
	
	 @Test
	    public void testNumeroMenorQueTresDigitos() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(12, "Agencia de Senador", "Senador", banco);
	        assertNull(agencia.getNumero());
	    }

	  
	    @Test
	    public void testNumeroValido() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(455, "Agencia de Senador", "Senador", banco);
	        assertEquals(agencia.getNumero(), Integer.valueOf(455));
	    }
	    
	    @Test
	    public void testNumeroMaiorQueCincoDigitos() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(123456, "Agencia de Senador", "Senador", banco);
	        assertNull(agencia.getNumero());
	    }

	    @Test
	    public void testNomeMenorQueCincoCaracteres() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(455, "Ag", "Senador", banco);
	        assertNull(agencia.getNome());
	    }

	    @Test
	    public void testNomeMaiorQueCemCaracteres() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(455, "Ag".repeat(100), "Senador", banco);
	        assertNull(agencia.getNome());
	    }

	    @Test
	    public void testNomeApenasCaracteres() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(455, "Agencia254", "Senador", banco);
	        assertNull(agencia.getNome());
	    }

	    @Test
	    public void testNomeValido() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(455, "Agencia", "Senador", banco);
	        assertEquals(agencia.getNome(), "Agencia");
	    }

	    @Test
	    public void testCidadeMenorQueCincoCaracteres() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(455, "Agencia", "Goia", banco);
	        assertNull(agencia.getCidade());
	    }

	    @Test
	    public void testCidadeMaiorQueCemCaracteres() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(455, "Agencia", "Senador".repeat(50), banco);
	        assertNull(agencia.getCidade());
	    }

	    @Test
	    public void testCidadeApenasCaracteres() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(-455, "Agencia", "Senador5", banco);
	        assertNull(agencia.getCidade());
	    }

	    @Test
	    public void testCidadeValido() {
	        Banco banco = new Banco(104, "BancoInter");
	        Agencia agencia = new Agencia(-455, "Agencia", "Senador", banco);
	        assertEquals(agencia.getCidade(), "Senador");
	    }
	
}
