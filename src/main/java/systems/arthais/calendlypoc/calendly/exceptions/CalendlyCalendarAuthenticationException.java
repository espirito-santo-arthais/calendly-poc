package systems.arthais.calendlypoc.calendly.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAuthenticationException;

public class CalendlyCalendarAuthenticationException extends CalendarAuthenticationException {

	private static final long serialVersionUID = 1L;

	public CalendlyCalendarAuthenticationException(String message) {
		super(message);
	}

	public CalendlyCalendarAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

}
