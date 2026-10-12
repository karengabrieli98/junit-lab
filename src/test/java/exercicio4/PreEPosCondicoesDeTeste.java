package exercicio4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreEPosCondicoesDeTeste {
	
	@Before
	public void preCondicao() {  // metodo de pre condição é o After
		System.out.println("Executou a pre condicao");
		}
	
	@Test
	public void exibicaoPrePosCondicao () {
		System.out.println("Executou o teste"); // saida de console 
	}
	
	@After
	public void posCondicao() { // metodo de pos condição é o After
		System.out.println("Executou a pos condicao");
	}

}
