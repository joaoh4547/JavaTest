package com.tranporte_cargas.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.tranporte_cargas.dtos.ShippingCreateDTO;
import com.tranporte_cargas.dtos.ShippingDTO;
import com.tranporte_cargas.services.errors.ServiceError;
import com.tranporte_cargas.services.interfaces.ShippingService;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/shipping")
public class ShippingCalculatorController {
	
	@Autowired
	private  ShippingService shippingService;
	
	@ApiResponse(responseCode = "201", 
		    content = { @Content(mediaType = "application/json", 
		      schema = @Schema(implementation = ShippingDTO.class)) })
	@PostMapping("/calc")
	public ResponseEntity<ShippingDTO> createShipping(@RequestBody ShippingCreateDTO data) throws ServiceError{
		var result = shippingService.Create(data);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
	
	
	
}
