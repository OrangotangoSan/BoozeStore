package com.boozeApp.boozeApp.businessRules.validations;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ValidationErrorsHandler {

    @Autowired
    private MessageSource messageSource;

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<OrderError> handleError(MethodArgumentNotValidException exception){

        List<OrderError> orderErrors = new ArrayList<>();

        List<FieldError> errorList = exception.getBindingResult().getFieldErrors();


        errorList.forEach(e -> {

            String message = messageSource.getMessage(e, LocaleContextHolder.getLocale());

            OrderError error = new OrderError(e.getField(), message);

            orderErrors.add(error);
        });

        return orderErrors;
    }
}
