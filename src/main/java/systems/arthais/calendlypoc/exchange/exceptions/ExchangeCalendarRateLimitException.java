package systems.arthais.calendlypoc.exchange.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarRateLimitException;

public class ExchangeCalendarRateLimitException extends CalendarRateLimitException {

	private static final long serialVersionUID = 1L;

	public ExchangeCalendarRateLimitException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExchangeCalendarRateLimitException(String message) {
		super(message);
	}

}
