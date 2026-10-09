package exercicio01;

import org.junit.Test;

public class MeuPrimeiroTeste {
	
	@Test 
	public void teste1 () {   //método de teste,  public void quer dizer que é um metodo de teste publico e sem retorno
		System.out.println("Teste1 executado.");
	}
	
	@Test // sempre colocar acima do metodo de teste
	public void teste2() {
		System.out.println("Teste 2 executado.");
	}
	
	public void naoEUmTeste() {
		
		System.out.println("Esta mensagem nao deve aparecer!"); //não aparece na lista de execução e a mensagem não aparece no console porque ele não é uma teste. Falta a anotação @Test para ele ser um test
	}
}
