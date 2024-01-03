package systems.arthais.calendlypoc.exchange.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarInvalidDataException;

public class ExchangeCalendarInvalidDataException extends CalendarInvalidDataException {

	private static final long serialVersionUID = 1L;

	public ExchangeCalendarInvalidDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExchangeCalendarInvalidDataException(String message) {
		super(message);
	}

}
