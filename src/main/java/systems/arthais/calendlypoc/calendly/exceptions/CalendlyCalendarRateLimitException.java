package systems.arthais.calendlypoc.calendly.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarRateLimitException;

public class CalendlyCalendarRateLimitException extends CalendarRateLimitException {

	private static final long serialVersionUID = 1L;

	public CalendlyCalendarRateLimitException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalendlyCalendarRateLimitException(String message) {
		super(message);
	}

}
