package spring_rest.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
класс - обработчик исключений
 */

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {

    //обработчик исключения, возникающего при вводе id, отсутствующего в БД
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handlerException(NoSuchEmployeeException exception){
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    // обработчик всех исключений
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handlerException(Exception exception){
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
