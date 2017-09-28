package tdd.java.palindromo;

import org.junit.Assert;
import org.junit.Test;

import tdd.java.palindromo.Palindromo;


public class TesteDoPalindromo {
	@Test
	public void Avaliador(){
		
		Palindromo palindromo = new Palindromo();
			
		boolean resultado = true;
	
		Assert.assertEquals(resultado, palindromo.ehPalindromo("O lobo ama o bolo"));
		Assert.assertEquals(resultado, palindromo.ehPalindromo("Socorram-me subi no onibus em Marrocos"));
		Assert.assertEquals(resultado, palindromo.ehPalindromo("Anotaram a data da maratona"));
		Assert.assertEquals(resultado, palindromo.ehPalindromo("A gorda ama a droga"));
		Assert.assertEquals(resultado, palindromo.ehPalindromo("Saíram o tio e oito marias"));
				
		}
		
	}
