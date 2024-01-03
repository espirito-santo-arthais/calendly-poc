package systems.arthais.calendlypoc.exceptions;

public class CalendarAuthenticationException extends CalendarException {

	private static final long serialVersionUID = 1L;

	public CalendarAuthenticationException(String message) {
		super(message);
	}

	public CalendarAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

}
