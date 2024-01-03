package systems.arthais.calendlypoc.icloud.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAuthenticationException;

public class ICloudCalendarAuthenticationException extends CalendarAuthenticationException {

	private static final long serialVersionUID = 1L;

	public ICloudCalendarAuthenticationException(String message) {
		super(message);
	}

	public ICloudCalendarAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

}
