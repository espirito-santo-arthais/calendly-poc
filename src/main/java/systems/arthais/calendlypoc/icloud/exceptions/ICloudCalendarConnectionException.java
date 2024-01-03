package systems.arthais.calendlypoc.icloud.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarConnectionException;

public class ICloudCalendarConnectionException extends CalendarConnectionException {

	private static final long serialVersionUID = 1L;

	public ICloudCalendarConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public ICloudCalendarConnectionException(String message) {
		super(message);
	}

}
