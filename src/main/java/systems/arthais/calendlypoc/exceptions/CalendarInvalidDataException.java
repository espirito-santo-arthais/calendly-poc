package systems.arthais.calendlypoc.exceptions;

public class CalendarInvalidDataException extends CalendarException {

	private static final long serialVersionUID = 1L;

	public CalendarInvalidDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalendarInvalidDataException(String message) {
		super(message);
	}

}
