package hangman.model;

public class OriginalScore implements GameScore {
	/**
	 * Calcula el score del juego de la manera original iniciando con 100 puntos y descontando 10 por cada letra mala
	 * @pre que el puntaje este en 100 puntos
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
