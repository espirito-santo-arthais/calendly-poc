package systems.arthais.calendlypoc.icloud.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarInvalidDataException;

public class ICloudCalendarInvalidDataException extends CalendarInvalidDataException {

	private static final long serialVersionUID = 1L;

	public ICloudCalendarInvalidDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public ICloudCalendarInvalidDataException(String message) {
		super(message);
	}

}
