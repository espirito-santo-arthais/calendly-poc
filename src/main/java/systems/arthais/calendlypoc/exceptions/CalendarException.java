package systems.arthais.calendlypoc.exceptions;

public class CalendarException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CalendarException(String message) {
		super(message);
	}

	public CalendarException(String message, Throwable cause) {
		super(message, cause);
	}

}
