package systems.arthais.calendlypoc.calendly.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarSynchronizationException;

public class CalendlyCalendarSynchronizationException extends CalendarSynchronizationException {

	private static final long serialVersionUID = 1L;

	public CalendlyCalendarSynchronizationException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalendlyCalendarSynchronizationException(String message) {
		super(message);
	}

}
