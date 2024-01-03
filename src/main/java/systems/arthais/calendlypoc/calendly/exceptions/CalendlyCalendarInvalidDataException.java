package systems.arthais.calendlypoc.calendly.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarInvalidDataException;

public class CalendlyCalendarInvalidDataException extends CalendarInvalidDataException {

	private static final long serialVersionUID = 1L;

	public CalendlyCalendarInvalidDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalendlyCalendarInvalidDataException(String message) {
		super(message);
	}

}
