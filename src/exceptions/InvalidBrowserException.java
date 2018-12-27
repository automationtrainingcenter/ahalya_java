package exceptions;

public class InvalidBrowserException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidBrowserException() {
		super("browser name is invalie please check the browser name");
	}

}
