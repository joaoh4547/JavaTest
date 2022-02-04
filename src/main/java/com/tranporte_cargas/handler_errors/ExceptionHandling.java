package com.tranporte_cargas.handler_errors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tranporte_cargas.services.errors.ServiceError;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestControllerAdvice
public class ExceptionHandling extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ServiceError.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ApiResponse(responseCode = "400", 
    content = { @Content(mediaType = "application/json", 
      schema = @Schema(implementation = ErrorResponse.class)) })

	public ResponseEntity<ErrorResponse> handleServiceError(ServiceError error, HttpServletRequest request){
		
		return ResponseEntity.badRequest().body(new ErrorResponse(request.getRequestURI(),error.getErrors()));		
	}

}
