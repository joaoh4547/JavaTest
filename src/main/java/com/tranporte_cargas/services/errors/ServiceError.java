package com.tranporte_cargas.services.errors;

import java.util.HashMap;
import java.util.Map;

public class ServiceError extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> errors = new HashMap<>();

	public Map<String, Object> getErrors() {
		return errors;
	}
	
	

}
