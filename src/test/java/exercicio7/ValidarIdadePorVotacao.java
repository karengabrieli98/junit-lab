package exercicio7;


import votacao.Votacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidarIdadePorVotacao {
	
	@Test
    public void idadeIgual15Anos_NaoPodeVotar() {
	assertEquals("Maria voce nao pode votar", Votacao.podeVotar("Maria", 2011)); 
	  }
    @Test
    public void idadeIgual16Anos_VotoFacultativo() {
    	assertEquals("Rodrigo seu voto e facultativo", Votacao.podeVotar("Rodrigo", 2010)); 
     }
    @Test
    public void idadeIgual17Anos_VotoFacultativo() {
    	assertEquals("Joao seu voto e facultativo", Votacao.podeVotar("Joao", 2009)); 
     }
    @Test
    public void idadeIgual18Anos_VotoObrigatorio() {
    	assertEquals("Carla seu voto e obrigatorio", Votacao.podeVotar("Carla", 2008)); 
     }
    @Test
    public void idadeIgual25Anos_VotoObrigatorio() {
    	assertEquals("Jose seu voto e obrigatorio", Votacao.podeVotar("Jose", 2000)); 
     }
    @Test
    public void idadeIgual70Anos_VotoObrigatorio() {
    	assertEquals("Ana seu voto e obrigatorio", Votacao.podeVotar("Ana", 1956)); 
     }
    @Test
    public void idadeIgual71Anos_VotoFacultativo() {
    	assertEquals("Pedro seu voto e obrigatorio", Votacao.podeVotar("Pedro", 1955)); 
     }


}
