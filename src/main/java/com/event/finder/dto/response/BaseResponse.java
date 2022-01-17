package com.event.finder.dto.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BaseResponse<T> {
    Integer status;
    T data;
    String errorMessage;

    public BaseResponse<T> ok(T data){
        this.data=data;
        this.status= HttpStatus.OK.value();
        return this;
    }

    public BaseResponse<T> fail(String errorMessage){
        this.errorMessage=errorMessage;
        this.status= HttpStatus.INTERNAL_SERVER_ERROR.value();
        return this;
    }
}
