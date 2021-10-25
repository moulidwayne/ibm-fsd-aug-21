package com.example.secureorderservice.exception;

import com.example.secureorderservice.ui.ErrorResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OrderExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorResponseModel> handleOrderNotFoundException(OrderNotFoundException onfe)
    {
        ErrorResponseModel errorResponseModel=new ErrorResponseModel();
        errorResponseModel.setMessage(onfe.getMessage());
        errorResponseModel.setStatusCode(HttpStatus.NOT_FOUND.value());
        errorResponseModel.setErrorReportingTime(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponseModel);
    }
}
