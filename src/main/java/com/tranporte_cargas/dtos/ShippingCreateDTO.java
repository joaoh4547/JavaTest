package com.tranporte_cargas.dtos;

public class ShippingCreateDTO {
	private Double weight;
	private String originZipCode;
	private String destinationZipCode;
	private String recipientName;
	
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getOriginZipCode() {
		return originZipCode;
	}
	public void setOriginZipCode(String originZipCode) {
		this.originZipCode = originZipCode;
	}
	public String getDestinationZipCode() {
		return destinationZipCode;
	}
	public void setDestinationZipCode(String destinationZipCode) {
		this.destinationZipCode = destinationZipCode;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	
	
	

	
	
}
