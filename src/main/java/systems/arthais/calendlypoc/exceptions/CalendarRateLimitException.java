package systems.arthais.calendlypoc.exceptions;

public class CalendarRateLimitException extends CalendarException {

	private static final long serialVersionUID = 1L;

	public CalendarRateLimitException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalendarRateLimitException(String message) {
		super(message);
	}

}
