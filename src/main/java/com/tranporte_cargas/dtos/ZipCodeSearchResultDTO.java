package com.tranporte_cargas.dtos;

public class ZipCodeSearchResultDTO {
	
	private String cep;
	private String uf;
	private String ddd;
	
	
	
	public ZipCodeSearchResultDTO() {
		
	}

	
	public ZipCodeSearchResultDTO(String cep, String uf, String ddd) {
		this.cep = cep;
		this.uf = uf;
		this.ddd = ddd;
	}


	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getDDD() {
		return ddd;
	}
	
	public void setDDD(String ddd) {
		this.ddd = ddd;
	}
	
}
