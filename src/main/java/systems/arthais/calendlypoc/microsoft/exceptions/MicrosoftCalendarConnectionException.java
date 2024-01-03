package systems.arthais.calendlypoc.microsoft.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarConnectionException;

public class MicrosoftCalendarConnectionException extends CalendarConnectionException {

	private static final long serialVersionUID = 1L;

	public MicrosoftCalendarConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public MicrosoftCalendarConnectionException(String message) {
		super(message);
	}

}
