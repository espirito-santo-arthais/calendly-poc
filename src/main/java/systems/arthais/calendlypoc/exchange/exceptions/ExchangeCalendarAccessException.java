package systems.arthais.calendlypoc.exchange.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAccessException;

public class ExchangeCalendarAccessException extends CalendarAccessException {

	private static final long serialVersionUID = 1L;

	public ExchangeCalendarAccessException(String message) {
		super(message);
	}

	public ExchangeCalendarAccessException(String message, Throwable cause) {
		super(message, cause);
	}

}
