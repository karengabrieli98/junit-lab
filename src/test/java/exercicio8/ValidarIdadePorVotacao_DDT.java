package exercicio8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import votacao.Votacao;

public class ValidarIdadePorVotacao_DDT {
	   String nome;
	    int anoDeNascimento;
	    String resultado;
	    
	   public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultado) {
		   this.nome = nome;
		   this.anoDeNascimento = anoDeNascimento;
		   this.resultado = resultado;
	   }
	   
	   @Test
	   public void validarObrigatoriedaDeDeVoto() {
		   assertEquals("Rodrigo seu voto e facultativo", Votacao.podeVotar("Rodrigo", 2010)); ;
	   }
	   
}


