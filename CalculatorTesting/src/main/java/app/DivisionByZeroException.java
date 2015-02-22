package app;

public class DivisionByZeroException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4612926835797770403L;

	public DivisionByZeroException(){
		this("Division By Zero!!!");
	}
	
	public DivisionByZeroException(String message){
		super(message);
	}

	
}
