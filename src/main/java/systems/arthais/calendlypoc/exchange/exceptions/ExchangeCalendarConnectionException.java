package systems.arthais.calendlypoc.exchange.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarConnectionException;

public class ExchangeCalendarConnectionException extends CalendarConnectionException {

	private static final long serialVersionUID = 1L;

	public ExchangeCalendarConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExchangeCalendarConnectionException(String message) {
		super(message);
	}

}
