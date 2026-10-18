package exercicio10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import votacao.Votacao;



@RunWith(JUnitParamsRunner.class)
public class ValidarIdadePorVotacao_CSV {
 
	
	@Test
	@FileParameters(value = "src/test/resources/massa_de_dados.csv", // parametros que vao vim od arquivo CSV e esse arquivo tem um cabeçalho
	mapper = CsvWithHeaderMapper.class)
	public void validarObrigatoriedadeDeVoto(String nome, int anoDeNascimento, String resultado ) {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
}


// string e int são parametros 