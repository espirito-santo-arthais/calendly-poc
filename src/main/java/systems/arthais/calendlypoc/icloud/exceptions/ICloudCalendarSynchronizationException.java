package systems.arthais.calendlypoc.icloud.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarSynchronizationException;

public class ICloudCalendarSynchronizationException extends CalendarSynchronizationException {

	private static final long serialVersionUID = 1L;

	public ICloudCalendarSynchronizationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ICloudCalendarSynchronizationException(String message) {
		super(message);
	}

}
