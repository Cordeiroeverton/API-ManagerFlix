package io.ordeiroeverton.managerflix.demo.exceptions.handle;

import io.ordeiroeverton.managerflix.demo.exceptions.TamanhoNaoValidoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(TamanhoNaoValidoException.class)
    public ResponseEntity<DefaultException> handle(TamanhoNaoValidoException tamanhoNaoValidoException) {
       DefaultException defaultException = new DefaultException();

       defaultException.setMensagem(tamanhoNaoValidoException.getMessage());
       defaultException.setDataHora(LocalDateTime.now());
       defaultException.setStatus(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<DefaultException> handle(MethodArgumentNotValidException e) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem(e.getMessage());
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }
}
