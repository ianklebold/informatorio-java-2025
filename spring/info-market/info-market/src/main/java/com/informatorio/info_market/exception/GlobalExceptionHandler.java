package com.informatorio.info_market.exception;

import com.informatorio.info_market.dto.error.ErrorResponseDto;
import com.informatorio.info_market.exception.badrequest.StockInsuficienteException;
import com.informatorio.info_market.exception.notfound.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException ex, WebRequest request) {
        List<Map<String, String>> errors = ex.getFieldErrors().stream()
                .map( fieldError -> {
                        Map<String, String> error = new HashMap<>();
                        error.put(fieldError.getField(), fieldError.getDefaultMessage() );
                        return error;
                        }
                ).toList();

        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleNotFoundException(NotFoundException e, WebRequest webRequest) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(
                e,
                webRequest.getDescription(false),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(errorResponseDto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StockInsuficienteException.class)
    public ResponseEntity<ErrorResponseDto> handleStockInsuficienteException(StockInsuficienteException e, WebRequest webRequest) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(
                e,
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST
        );

        return new ResponseEntity<>(errorResponseDto, HttpStatus.BAD_REQUEST);
    }

}
