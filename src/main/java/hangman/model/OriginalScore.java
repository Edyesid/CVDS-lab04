package hangman.model;

public class OriginalScore implements GameScore {
	private int puntaje;
	/**
	 * Calcula el score del juego de la manera original iniciando con 100 puntos y descontando 10 por cada letra mala
	 * @pre que el puntaje este en 100 puntos
	 * @pos puntaje minimo 0 puntos
	 * @param CorrectCount letras correctas
	 * @param incorrectCount letras incorrectas
	 * @return puntaje del ususario en el modo original
	 * @throws Exception
	 * 
	 */
	@Override
	public int CalculateScore(int CorrectCount, int incorrectCount) throws HangmanException  {
		puntaje = 100;
		if(CorrectCount < 0 || incorrectCount < 0) {
			throw new HangmanException(HangmanException.PARAMETROS_INVALIDOS);
		}
		
		puntaje = puntaje - (incorrectCount * 10);
		
		if (puntaje < 0) {
			puntaje = 0;
		}
		return puntaje;
	}

}
