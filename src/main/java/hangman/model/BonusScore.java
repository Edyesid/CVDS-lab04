package hangman.model;

public class BonusScore implements GameScore {
	/**
	 * Calcula el score del juego de la manera power iniciando con 0 puntos y sumando 10 por correcta y restando 5 por incorrecta
	 * @pre que el puntaje este en 0 puntos
	 * @pos puntaje minimo 0 puntos
	 * @param CorrectCount letras correctas
	 * @param IncorrectCount letras incorrectas
	 * @return puntaje del ususario en el modo original
	 * @throws Exception
	 * 
	 */
	@Override
	public int CalculateScore(int CorrectCount, int incorrectCount) {
		
		return 0;
	}

}
