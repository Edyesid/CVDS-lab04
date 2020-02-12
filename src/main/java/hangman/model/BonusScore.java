package hangman.model;

public class BonusScore implements GameScore {
	int puntaje;
	/**
	 * Calcula el score del juego de la manera power iniciando con 0 puntos y sumando 10 por correcta y restando 5 por incorrecta
	 * @pre que el puntaje este en 0 puntos
	 * @pos puntaje minimo 0 puntos
	 * @param CorrectCount letras correctas
	 * @param incorrectCount letras incorrectas
	 * @return puntaje del ususario en el modo original
	 * @throws Exception
	 * 
	 */
	@Override
	public int CalculateScore(int CorrectCount, int incorrectCount) throws HangmanException {
		
		if(CorrectCount < 0 || incorrectCount < 0) {
			throw new HangmanException(HangmanException.PARAMETROS_INVALIDOS);
		}
		
		puntaje = 0;
		
		puntaje = (puntaje + (CorrectCount * 10)) - (incorrectCount * 5);
		
		if (puntaje < 0) {
			puntaje = 0;
		}
		
		return puntaje;
	}

}
