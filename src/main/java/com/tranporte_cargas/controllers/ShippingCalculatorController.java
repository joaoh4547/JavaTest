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
import com.tranporte_cargas.services.interfaces.ShippingService;

@RestController
@RequestMapping("/api/shipping")
public class ShippingCalculatorController {
	
	@Autowired
	private  ShippingService shippingService;
	
	
	@PostMapping("/calc")
	public ResponseEntity<ShippingDTO> createShipping(@RequestBody ShippingCreateDTO data){
		var result = shippingService.Create(data);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
	
	
	
}
