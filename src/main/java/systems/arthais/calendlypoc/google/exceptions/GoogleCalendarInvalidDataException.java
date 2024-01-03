package systems.arthais.calendlypoc.google.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarInvalidDataException;

public class GoogleCalendarInvalidDataException extends CalendarInvalidDataException {

	private static final long serialVersionUID = 1L;

	public GoogleCalendarInvalidDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoogleCalendarInvalidDataException(String message) {
		super(message);
	}

}
