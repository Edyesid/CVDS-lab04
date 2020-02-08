package hangman.model;

public class PowerScore implements GameScore{
	int puntaje;
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
	public int CalculateScore(int CorrectCount, int incorrectCount) throws Exception {
		puntaje=0;
		if(CorrectCount < 0 || incorrectCount < 0) {
			throw new Exception(); 
		}
		
		puntaje=(int) (puntaje+(Math.pow(5,CorrectCount)))-(8*incorrectCount);
		
		if (puntaje < 0) {
			puntaje=0;
		}
		else if(puntaje>500) {
			puntaje=500;
		}
		
		return puntaje;
	}

}
