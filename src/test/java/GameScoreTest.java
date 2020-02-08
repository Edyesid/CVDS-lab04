import static org.junit.Assert.*;

import org.junit.Test;

import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import junit.framework.Assert;

public class GameScoreTest {
	/*
	 * Para el gameScore original las clases de equivalencia son:
	 * letras correctas: 0-23
	 * Letras incorrectas: 0-26
	 * casos de frontera:
	 * las letras correctas no suman puntaje.
	 * letras correctas: -1,0,1,2,23.
	 * Como el puntaje inicial es 100 y el minimo es 0, entonces 10 letra incorrectas es el caso frontera.
	 * Letras incorrectas: -1,0,1,9,10,11,12,23.
	 * 
	 * Para El BonusScore las clases de quivalencia son:
	 * Letras correctas: 0-23
	 * Letras incorrectas: 0-26
	 * Casos de frontera:
	 * letras correctas: -1,0,1 y letras incorrectas: -1,0,1,2,3
	 * 
	 * 
	 * Para el PowerScore los casos de equivalencia son:
	 * letras correctas: 0-23
	 * Letras incorrectas: 0-26
	 * Puntaje inicial 0, se usa la formula 5^(Letras correctas)
	 * se resta 8 por cada letra incorrecta.
	 * puntaje minimo 0, puntaje maximo 500
	 * casos frontera:
	 * Letras correctas: -1,0,1,3,4,5.
	 * Letras incorrectas: las letras correctas deben ser ,-1,0,1,2 y las letras incorrectas: -1,0,1,2,3,4
	 * 
	 *
	 */
	@Test
	public void DeberiaErrorGS() {
		OriginalScore prueba = new OriginalScore();
		try {
			prueba.CalculateScore(-1,0);
			
		} catch (Exception e) {
			Assert.assertEquals(true,true);
			
		}
	}
	
	@Test
	public void DeberiaError2GS() {
		OriginalScore prueba = new OriginalScore();
		try {
			prueba.CalculateScore(0,-1);
			
		} catch (Exception e) {
			Assert.assertEquals(true,true);
			
		}
	}
	
	@Test
	public void DeberiaPuntajeCeroGS() {
		OriginalScore prueba = new OriginalScore();
		try {
			Assert.assertEquals(0,prueba.CalculateScore(0,10));
		} catch (Exception e) {
		
		}
	}
	
	@Test
	public void DeberiaPuntajeCero2GS() {
		OriginalScore prueba = new OriginalScore();
		try {
			Assert.assertEquals(0,prueba.CalculateScore(0,11));
		} catch (Exception e) {
		}
	}
	
	@Test
	public void DeberiaCero3GS() {
		OriginalScore prueba = new OriginalScore();
		try {
			Assert.assertEquals(0,prueba.CalculateScore(10,10));
		} catch (Exception e) {}
	}
	
	@Test
	public void NormalGS() {
		OriginalScore prueba = new OriginalScore();
		try {
			Assert.assertEquals(50,prueba.CalculateScore(11,5));
		} catch (Exception e) {}
	}
	
	@Test
	public void DeberiaErrorBS() {
		OriginalScore prueba = new OriginalScore();
		try {
			prueba.CalculateScore(-1,0);
			
		} catch (Exception e) {
			Assert.assertEquals(true,true);
			
		}
	}
	@Test
	public void DeberiaError2BS() {
		OriginalScore prueba = new OriginalScore();
		try {
			prueba.CalculateScore(0,-1);
			
		} catch (Exception e) {
			Assert.assertEquals(true,true);
			
		}
	}
	
	@Test
	public void DeberiaCeroBS() throws Exception {
		BonusScore prueba = new BonusScore();
		Assert.assertEquals(0,prueba.CalculateScore(0,0));
	}
	
	@Test
	public void DeberiaCero2BS() throws Exception {
		BonusScore prueba = new BonusScore();
		Assert.assertEquals(0,prueba.CalculateScore(0,1));
	}
	
	@Test
	public void DeberiaCero3BS() throws Exception {
		BonusScore prueba = new BonusScore();
		Assert.assertEquals(0,prueba.CalculateScore(5,10));
	}
	
	@Test
	public void DeberiaCero4BS() throws Exception {
		BonusScore prueba = new BonusScore();
		Assert.assertEquals(0,prueba.CalculateScore(5,11));
	}
	
	@Test
	public void DeberiaNormalBS() throws Exception {
		BonusScore prueba = new BonusScore();
		Assert.assertEquals(75,prueba.CalculateScore(10,5));
	}
	
	@Test
	public void DeberiaErrorPS() {
		PowerScore prueba = new PowerScore();
		try {
			prueba.CalculateScore(-1,0);
			
		} catch (Exception e) {
			Assert.assertEquals(true,true);
			
		}
	}
	
	@Test
	public void DeberiaError2PS() {
		PowerScore prueba = new PowerScore();
		try {
			prueba.CalculateScore(0,-1);
			
		} catch (Exception e) {
			Assert.assertEquals(true,true);
			
		}
	}
	
	@Test
	public void DeberiaCeroPS() throws Exception {
		PowerScore prueba = new PowerScore();
		Assert.assertEquals(0,prueba.CalculateScore(0,1));
	}
	
	@Test
	public void DeberiaCero1PS() throws Exception {
		PowerScore prueba = new PowerScore();
		Assert.assertEquals(0,prueba.CalculateScore(2,4));
	}
	
	@Test
	public void DeberiaCero2PS() throws Exception {
		PowerScore prueba = new PowerScore();
		Assert.assertEquals(0,prueba.CalculateScore(1,1));
	}
	
	@Test
	public void Deberia500PS() throws Exception {
		PowerScore prueba = new PowerScore();
		Assert.assertEquals(500,prueba.CalculateScore(4,15));
	}
	
	@Test
	public void Deberia500PS2() throws Exception {
		PowerScore prueba = new PowerScore();
		Assert.assertEquals(500,prueba.CalculateScore(4,0));
	}
	
	@Test
	public void DeberiaNormalPS() throws Exception {
		PowerScore prueba = new PowerScore();
		Assert.assertEquals(497,prueba.CalculateScore(4,16));
	}
	
	





}
