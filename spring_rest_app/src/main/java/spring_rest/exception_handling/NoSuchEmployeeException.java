package spring_rest.exception_handling;

/*
исключение, возникающее при вводе id, отсутствующего в БД
 */
public class NoSuchEmployeeException extends RuntimeException{

    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
