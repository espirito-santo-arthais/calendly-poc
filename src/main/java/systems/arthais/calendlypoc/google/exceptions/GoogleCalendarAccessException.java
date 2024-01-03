package systems.arthais.calendlypoc.google.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAccessException;

public class GoogleCalendarAccessException extends CalendarAccessException {

	private static final long serialVersionUID = 1L;

	public GoogleCalendarAccessException(String message) {
		super(message);
	}

	public GoogleCalendarAccessException(String message, Throwable cause) {
		super(message, cause);
	}

}
