package systems.arthais.calendlypoc.exceptions;

public class CalendarSynchronizationException extends CalendarException {

	private static final long serialVersionUID = 1L;

	public CalendarSynchronizationException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalendarSynchronizationException(String message) {
		super(message);
	}

}
