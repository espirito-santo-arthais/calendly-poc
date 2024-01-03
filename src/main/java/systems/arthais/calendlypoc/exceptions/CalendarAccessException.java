package systems.arthais.calendlypoc.exceptions;

public class CalendarAccessException extends CalendarException {

	private static final long serialVersionUID = 1L;

	public CalendarAccessException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalendarAccessException(String message) {
		super(message);
	}

}
