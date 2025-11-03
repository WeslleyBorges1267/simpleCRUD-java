package personalExceptions;


public class DBException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DBException(String err) {
		 super(err);
	}
}