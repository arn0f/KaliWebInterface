package webproject.database;

public class DAOException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6804887490227253188L;

    public DAOException( String message ) {
        super( message );
    }

    public DAOException( String message, Throwable cause ) {
        super( message, cause );
    }

    public DAOException( Throwable cause ) {
        super( cause );
    }
}
