package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  // Esta anotação indica que a classe é um controlador de tratamento de exceções.
public class ExceptionHandlerController {
    @ExceptionHandler(CustomNotFoundException.class)
    // Este método lida com exceções do tipo CustomNotFoundException.
    public ResponseEntity<String> handleCustomNotFoundException(CustomNotFoundException ex) {
        // Retorna uma resposta ResponseEntity com status HTTP 400 (BAD_REQUEST) e a mensagem da exceção.
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    // Este método lida com exceções do tipo Exception (genéricas).
    public ResponseEntity<String> handleGenericException(Exception ex){
        // Retorna uma resposta ResponseEntity com status HTTP 500 (INTERNAL_SERVER_ERROR) e a mensagem da exceção.
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }
}
