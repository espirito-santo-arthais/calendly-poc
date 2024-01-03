package systems.arthais.calendlypoc.icloud.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarAccessException;

public class ICloudCalendarAccessException extends CalendarAccessException {

	private static final long serialVersionUID = 1L;

	public ICloudCalendarAccessException(String message) {
		super(message);
	}

	public ICloudCalendarAccessException(String message, Throwable cause) {
		super(message, cause);
	}

}
