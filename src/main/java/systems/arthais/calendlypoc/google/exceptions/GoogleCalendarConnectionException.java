package systems.arthais.calendlypoc.google.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarConnectionException;

public class GoogleCalendarConnectionException extends CalendarConnectionException {

	private static final long serialVersionUID = 1L;

	public GoogleCalendarConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoogleCalendarConnectionException(String message) {
		super(message);
	}

}
