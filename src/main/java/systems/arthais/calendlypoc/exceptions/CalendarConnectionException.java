package systems.arthais.calendlypoc.exceptions;

public class CalendarConnectionException extends CalendarException {

	private static final long serialVersionUID = 1L;

	public CalendarConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalendarConnectionException(String message) {
		super(message);
	}

}
