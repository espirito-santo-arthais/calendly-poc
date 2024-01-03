package systems.arthais.calendlypoc.microsoft.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAuthenticationException;

public class MicrosoftCalendarAuthenticationException extends CalendarAuthenticationException {

	private static final long serialVersionUID = 1L;

	public MicrosoftCalendarAuthenticationException(String message) {
		super(message);
	}

	public MicrosoftCalendarAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

}
