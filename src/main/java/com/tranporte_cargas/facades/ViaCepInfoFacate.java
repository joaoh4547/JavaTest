package com.tranporte_cargas.facades;


import org.springframework.web.client.RestTemplate;

import com.tranporte_cargas.dtos.ZipCodeSearchResultDTO;
import com.tranporte_cargas.facades.interfaces.ZipCodeInfoFacade;

public class ViaCepInfoFacate implements ZipCodeInfoFacade {

	@Override
	public ZipCodeSearchResultDTO GetZipCodeData(String zipCode) {

		return new RestTemplate()
				.getForEntity(String.format("https://viacep.com.br/ws/%s/json/", zipCode), ZipCodeSearchResultDTO.class)
				.getBody();

	}

}
