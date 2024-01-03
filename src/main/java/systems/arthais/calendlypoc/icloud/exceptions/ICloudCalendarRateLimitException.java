package systems.arthais.calendlypoc.icloud.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarRateLimitException;

public class ICloudCalendarRateLimitException extends CalendarRateLimitException {

	private static final long serialVersionUID = 1L;

	public ICloudCalendarRateLimitException(String message, Throwable cause) {
		super(message, cause);
	}

	public ICloudCalendarRateLimitException(String message) {
		super(message);
	}

}
