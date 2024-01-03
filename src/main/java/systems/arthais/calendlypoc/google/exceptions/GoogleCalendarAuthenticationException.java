package systems.arthais.calendlypoc.google.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAuthenticationException;

public class GoogleCalendarAuthenticationException extends CalendarAuthenticationException {

	private static final long serialVersionUID = 1L;

	public GoogleCalendarAuthenticationException(String message) {
		super(message);
	}

	public GoogleCalendarAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

}
