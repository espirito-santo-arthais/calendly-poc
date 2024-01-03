package systems.arthais.calendlypoc.google.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarSynchronizationException;

public class GoogleCalendarSynchronizationException extends CalendarSynchronizationException {

	private static final long serialVersionUID = 1L;

	public GoogleCalendarSynchronizationException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoogleCalendarSynchronizationException(String message) {
		super(message);
	}

}
