package hangman.model;

public class PowerScore implements GameScore{
	/**
	 * Calcula el score del juego de la manera Bonus restando 8 por cada incorrecta y usando formula para las correctas
	 * @pre que el puntaje este en 0
	 * @pos puntaje minimo 0 puntos y el maximo 500 puntos
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
