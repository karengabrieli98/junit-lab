package exercicio6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio01.MeuPrimeiroTeste;
import exercicio2.ValidacaoVedadeiroFalso;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PreEPosCondicoesDeTeste;
import exercicio5.PreEPosCondicoesDaClasse;

	//suíte de testes: um agrupamento de várias classes de teste que rodam todas de uma vez.
	@RunWith(Suite.class) // Diz ao JUnit para não usar o runner padrão e sim o runner Suite, que sabe executar várias classes de teste em sequência.s 
	@SuiteClasses ({   // Lista quais classes de teste fazem parte da suíte.
		MeuPrimeiroTeste.class, 
		ValidacaoVedadeiroFalso.class, 
		ValidacaoIgualdade.class,
		PreEPosCondicoesDeTeste.class,
		PreEPosCondicoesDaClasse.class
		  
	})
	public class SuiteDeTeste {
		
	}
	
