package systems.arthais.calendlypoc.exchange.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarSynchronizationException;

public class ExchangeCalendarSynchronizationException extends CalendarSynchronizationException {

	private static final long serialVersionUID = 1L;

	public ExchangeCalendarSynchronizationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExchangeCalendarSynchronizationException(String message) {
		super(message);
	}

}
