package com.tranporte_cargas.facades;



import org.springframework.web.client.RestTemplate;

import com.tranporte_cargas.dtos.ZipCodeSearchResultDTO;
import com.tranporte_cargas.facades.interfaces.ZipCodeInfoFacade;

public class ViaCepInfoFacate implements ZipCodeInfoFacade {

	@Override
	public ZipCodeSearchResultDTO GetZipCodeData(String zipCode) throws Exception {
		try {
		var result = new RestTemplate()
				.getForEntity(String.format("https://viacep.com.br/ws/%s/json/", zipCode), ZipCodeSearchResultDTO.class);
				
			if(result.getBody().getCep() == null || result == null) {
				throw new Exception("Não foi Possivel obter os dados do cep");
			}
			
			
			return result.getBody();
		}
		catch (Exception e) {
			throw new Exception("Não foi Possivel obter os dados do cep");
		}

	}

}
