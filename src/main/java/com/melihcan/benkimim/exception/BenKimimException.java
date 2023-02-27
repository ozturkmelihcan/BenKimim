package com.melihcan.benkimim.exception;

import lombok.Getter;

@Getter
public class BenKimimException extends RuntimeException{

    private final ErrorType errorType;


    /**
     * Runtime dan miras aldığımız için hata mesajının kendısıne ıletılmesı gereklıdır.
     * @param errorType
     */
    public BenKimimException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public BenKimimException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}
