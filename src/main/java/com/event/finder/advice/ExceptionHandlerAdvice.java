package com.event.finder.advice;

import com.event.finder.dto.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Throwable.class)
    BaseResponse<Object> generalExceptionHandler(Exception exception){
        BaseResponse<Object> err = new BaseResponse<>();
        err.setData(exception.getCause());
        err.setErrorMessage(exception.getMessage());
        err.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new BaseResponse<>().fail(exception.getMessage());
    }
}
