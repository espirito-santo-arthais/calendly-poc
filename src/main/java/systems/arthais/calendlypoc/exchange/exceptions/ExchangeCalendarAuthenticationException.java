package systems.arthais.calendlypoc.exchange.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAuthenticationException;

public class ExchangeCalendarAuthenticationException extends CalendarAuthenticationException {

	private static final long serialVersionUID = 1L;

	public ExchangeCalendarAuthenticationException(String message) {
		super(message);
	}

	public ExchangeCalendarAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

}
