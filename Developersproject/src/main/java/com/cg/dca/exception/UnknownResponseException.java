package com.cg.dca.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)

public class UnknownResponseException extends Exception{
	
	public UnknownResponseException(String message){
        super(message);
    }

}


