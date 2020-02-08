package hangman.model;

public interface GameScore {
	/**
	 * metodo que calcula el puntaje según las diferentes reglas establecidas en el juego
	 * @param CorrectCount letras correctas
	 * @param IncorrectCount letras incorrectar
	 * @return puntaje obtenido por el usuario
	 * @throws Exception 
	 */
	public int CalculateScore(int CorrectCount, int IncorrectCount) throws Exception;

}
