package com.SIAVIE.TP.Controladores;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Error {

    public static final String ERROR_VIEW = "error/500";

    @ExceptionHandler(Exception.class)
    public String showInternalServerError() {
        return ERROR_VIEW;
    }
}
