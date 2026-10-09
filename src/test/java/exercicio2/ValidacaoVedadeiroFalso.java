package exercicio2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidacaoVedadeiroFalso {
	
	@Test
	public void validacaoVerdadeiro_Sucesso() {
		boolean campoEstaPresente = true; //Boolean é sempre true ou false 
		assertTrue(campoEstaPresente);
	}
	
	@Test
	public void validacaoVerdadeiro_Falha() {
		boolean campoEstaPresente = true; 
		assertFalse("Campo não está presente", campoEstaPresente);
	}
}
