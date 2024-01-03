package systems.arthais.calendlypoc.microsoft.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarSynchronizationException;

public class MicrosoftCalendarSynchronizationException extends CalendarSynchronizationException {

	private static final long serialVersionUID = 1L;

	public MicrosoftCalendarSynchronizationException(String message, Throwable cause) {
		super(message, cause);
	}

	public MicrosoftCalendarSynchronizationException(String message) {
		super(message);
	}

}
