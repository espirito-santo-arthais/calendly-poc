package systems.arthais.calendlypoc.google.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarRateLimitException;

public class GoogleCalendarRateLimitException extends CalendarRateLimitException {

	private static final long serialVersionUID = 1L;

	public GoogleCalendarRateLimitException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoogleCalendarRateLimitException(String message) {
		super(message);
	}

}
