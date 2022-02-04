package com.tranporte_cargas.facades.interfaces;

import com.tranporte_cargas.dtos.ZipCodeSearchResultDTO;

public interface ZipCodeInfoFacade {
	ZipCodeSearchResultDTO GetZipCodeData(String zipCode);
}
