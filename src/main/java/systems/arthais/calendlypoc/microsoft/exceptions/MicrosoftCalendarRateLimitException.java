package systems.arthais.calendlypoc.microsoft.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarRateLimitException;

public class MicrosoftCalendarRateLimitException extends CalendarRateLimitException {

	private static final long serialVersionUID = 1L;

	public MicrosoftCalendarRateLimitException(String message, Throwable cause) {
		super(message, cause);
	}

	public MicrosoftCalendarRateLimitException(String message) {
		super(message);
	}

}
