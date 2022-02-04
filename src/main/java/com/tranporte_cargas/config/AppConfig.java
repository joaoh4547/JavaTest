package com.tranporte_cargas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tranporte_cargas.facades.ViaCepInfoFacate;
import com.tranporte_cargas.facades.interfaces.ZipCodeInfoFacade;
import com.tranporte_cargas.services.ShippingServiceIMPL;
import com.tranporte_cargas.services.interfaces.ShippingService;

@Configuration
public class AppConfig {
	
	@Bean
	public ShippingService getShippingService() {
		return new ShippingServiceIMPL();
	}
	
	@Bean
	public ZipCodeInfoFacade getZipCodeInfoFacade() {
		return new ViaCepInfoFacate();
	}
	
}
