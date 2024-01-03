package systems.arthais.calendlypoc.microsoft.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAccessException;

public class MicrosoftCalendarAccessException extends CalendarAccessException {

	private static final long serialVersionUID = 1L;

	public MicrosoftCalendarAccessException(String message) {
		super(message);
	}

	public MicrosoftCalendarAccessException(String message, Throwable cause) {
		super(message, cause);
	}

}
