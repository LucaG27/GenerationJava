package exceptions;

public class UtenteBannatoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UtenteBannatoException(String utente) {
		
		super(utente+" è bannato e non può acquistare qui.");
	}

}
