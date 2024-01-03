package systems.arthais.calendlypoc.microsoft.exceptions;

import systems.arthais.calendlypoc.exceptions.CalendarInvalidDataException;

public class MicrosoftCalendarInvalidDataException extends CalendarInvalidDataException {

	private static final long serialVersionUID = 1L;

	public MicrosoftCalendarInvalidDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public MicrosoftCalendarInvalidDataException(String message) {
		super(message);
	}

}
