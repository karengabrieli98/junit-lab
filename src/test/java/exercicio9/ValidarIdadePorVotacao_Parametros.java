package exercicio9;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import votacao.Votacao;

@RunWith(Parameterized.class) //executar via Test date driven 
public class ValidarIdadePorVotacao_Parametros { // isso é método
	
	// Atributos globais (da classe)
  @Parameter  (0) // cada um dos atributos associando a um parametro 
  public  String nome;
  
  @Parameter (1) // o numero indica a ordem 
  public int anoDeNascimento; // pq public? atributos publicos para fazer execuçaõ
  
  @Parameter  (2) 
  public String resultado;
 
  
  @Test
  public void validarObrigatoriedaDeDeVoto() { //classe
     assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
  }
  
  

@Parameters(name = "{0} | {1} | {2}")
public static Collection<Object[]> data() {
   return Arrays.asList(new Object[][] {
      {"Maria", 2003, "Maria voce nao pode votar"}, // cada dado é uma linha do DDT
      {"Rodrigo", 2002, "Rodrigo seu e facultativo"},
	   {"Joao", 2001, "Joao seu voto e facultivo"}, 
	   {"Carla", 2000, "Carla seu voto e obrigatorio"},
	   {"Jose", 1993, "Jose seu voto e obrigatorio"},
	   {"Ana", 1948, "Ana seu voto e opcional"},
	   {"Pedro",1947, "Pedro seu voto e facultativo " }
   });

  
  // Massa de dados: cada linha é um cenário de teste 



} 
  

}
