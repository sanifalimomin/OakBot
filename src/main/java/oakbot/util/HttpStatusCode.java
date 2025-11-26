package oakbot.util;

/**
 * HTTP status code constants.
 * @author Michael Angstadt
 */
public final class HttpStatusCode {
	// 2xx Success
	public static final int OK = 200;
	public static final int ACCEPTED = 202;

	// 4xx Client Errors
	public static final int NOT_FOUND = 404;

	// 5xx Server Errors
	public static final int INTERNAL_SERVER_ERROR = 500;

	private HttpStatusCode() {
		// utility class
	}
}
