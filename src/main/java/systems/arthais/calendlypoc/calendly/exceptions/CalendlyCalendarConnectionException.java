package systems.arthais.calendlypoc.calendly.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarConnectionException;

public class CalendlyCalendarConnectionException extends CalendarConnectionException {

	private static final long serialVersionUID = 1L;

	public CalendlyCalendarConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalendlyCalendarConnectionException(String message) {
		super(message);
	}

}
