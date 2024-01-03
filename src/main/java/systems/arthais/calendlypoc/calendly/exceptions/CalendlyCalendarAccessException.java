package systems.arthais.calendlypoc.calendly.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAccessException;

public class CalendlyCalendarAccessException extends CalendarAccessException {

	private static final long serialVersionUID = 1L;

	public CalendlyCalendarAccessException(String message) {
		super(message);
	}

	public CalendlyCalendarAccessException(String message, Throwable cause) {
		super(message, cause);
	}

}
