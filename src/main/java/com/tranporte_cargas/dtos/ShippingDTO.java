package com.tranporte_cargas.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ShippingDTO {
	private Long id;
	private Double weight;
	private String originZipCode;
	private String destinationZipCode;
	private String recipientName;
	private Double totalValue;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date expectedDate;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date consultationDate;
	
	public ShippingDTO() {
	}

	public ShippingDTO(Long id, Double weight, String originZipCode, String destinationZipCode, String recipientName,
			Double totalValue, Date expectedDate, Date consultationDate) {
		this.id = id;
		this.weight = weight;
		this.originZipCode = originZipCode;
		this.destinationZipCode = destinationZipCode;
		this.recipientName = recipientName;
		this.totalValue = totalValue;
		this.expectedDate = expectedDate;
		this.consultationDate = consultationDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Date getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

	public Date getConsultationDate() {
		return consultationDate;
	}

	public void setConsultationDate(Date consultationDate) {
		this.consultationDate = consultationDate;
	}
	
	
	
	
	

	
	
}
