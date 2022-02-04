package com.tranporte_cargas.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tranporte_cargas.dtos.ShippingDTO;


@Entity
@Table(name = "TB_SHIPPING")
public class Shipping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double weight;
	private String originZipCode;
	private String destinationZipCode;
	private String recipientName;
	private Double totalValue;
	private Date expectedDate;
	private Date consultationDate;
	
	
	
	public Shipping() {
	}



	public Shipping(Double weight, String originZipCode, String destinationZipCode, String recipientName,
			Double totalValue, Date expectedDate, Date consultationDate) {
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

	public ShippingDTO toDTO() {
		return new ShippingDTO(id, weight, originZipCode, destinationZipCode, recipientName, totalValue, expectedDate, consultationDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shipping other = (Shipping) obj;
		return Objects.equals(id, other.id);
	}
	
	
		
	
}
