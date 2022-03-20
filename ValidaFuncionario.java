package Funcionario;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import historico.Funcionario;


public class ValidaFuncionario {
	
	private Funcionario app;
	
	@Before
    public void setup(){
        app = new Funcionario();
    }
	
	@Test
    public void nomeMenor5 () {
    	assertFalse(app.validaNome("Kes"));
    }
	
	@Test
    public void nomeCerto () {
    	assertTrue(app.validaNome("Marcos"));
    }
	
	@Test
    public void nomeMaior100 () {
    	assertFalse(app.validaNome("Keskkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkjjjjjjjjjjjjjjjjjjjjjjjjjj"));
    }
	
	@Test
    public void numeroMenor4 () {
    	assertFalse(app.validaCodigoFuncional(112));
    }
	
	@Test
    public void numeroCerto () {
    	assertTrue(app.validaCodigoFuncional(1125));
    }
	
	@Test
    public void escolaridadeCerta () {
    	assertTrue(app.validaEscolaridade("basico"));
    }
	
	@Test
    public void escolaridadeErrada () {
    	assertFalse(app.validaEscolaridade("Ensino Medio"));
    }

	@Test
    public void cargoCerto () {
    	assertTrue(app.validaCargo("gerente"));
    }
	
	@Test
    public void cargoErrado () {
    	assertFalse(app.validaCargo("Vendedor E Supervisor"));
    }
}
