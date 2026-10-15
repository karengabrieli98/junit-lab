package exercicio8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import votacao.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_DDT { //Esses campos guardam os dados de uma rodada do teste:
	   String nome;
	    int anoDeNascimento;
	    String resultado;
	 // 1. Construtor: recebe uma linha de dados
	   public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultado) {
		   this.nome = nome;
		   this.anoDeNascimento = anoDeNascimento;
		   this.resultado = resultado;
	   }
	   
	   @Test //3. O teste em si
	   public void validarObrigatoriedaDeDeVoto() {
		   assertEquals("Rodrigo seu voto e facultativo", Votacao.podeVotar("Rodrigo", 2010)); ;
	   }
	   
	  // Fonte de dados: cada linha vira uma execução do teste
	   @Parameters(name = "{0} | {1} | {2} ") //é só uma etiqueta que avisa o JUnit: “os dados estão neste método, pode buscar aqui”.
	   public static Collection<Object[]> data() { //estrutura basica 
		   return Arrays.asList(new Object[] [] {
			   {  "Maria", 2003, "Maria voce nao pode votar"},
			   {"Rodrigo", 2002, "Rodrigo seu e facultativo"},
			   {"Joao", 2001, "Joao seu voto e facultivo"}, 
			   {"Carla", 2000, "Carla seu voto e obrigatorio"},
			   {"Jose", 1993, "Jose seu voto e obrigatorio"},
			   {"Ana", 1948, "Ana seu voto e opcional"},
			   {"Pedro",1947, "Pedro seu voto e facultativo " }
		   });   
	}
	   
	   //O fluxo todo, passo a passo
	   //JUnit lê a tabela (dados())
	   //Pega a linha da Maria, chama o construtor, preenche as colunas e roda o teste
	 //  Pega a linha do João, faz o mesmo
	  // Pega a linha da Ana, faz o mesmo
	   
}


