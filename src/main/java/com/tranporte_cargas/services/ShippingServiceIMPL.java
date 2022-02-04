package com.tranporte_cargas.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.tranporte_cargas.ShippingRepository;
import com.tranporte_cargas.dtos.ShippingCreateDTO;
import com.tranporte_cargas.dtos.ShippingDTO;
import com.tranporte_cargas.entities.Shipping;
import com.tranporte_cargas.facades.interfaces.ZipCodeInfoFacade;
import com.tranporte_cargas.services.interfaces.ShippingService;

public class ShippingServiceIMPL implements ShippingService {

	@Autowired
	private ZipCodeInfoFacade zipCodeInfoFacade;

	@Autowired
	private ShippingRepository shippingRepository;

	@Override
	public ShippingDTO Create(ShippingCreateDTO shippingCreate)  {

		var originZipCodeData = this.zipCodeInfoFacade.GetZipCodeData(shippingCreate.getOriginZipCode());

		var destinationZipCodeData = this.zipCodeInfoFacade.GetZipCodeData(shippingCreate.getDestinationZipCode());

		Double discount = 0.0;
		Double value = shippingCreate.getWeight();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date(System.currentTimeMillis()));

		if (originZipCodeData.getDDD().equals(destinationZipCodeData.getDDD())) {
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			discount = value * 0.5;
		} else if (originZipCodeData.getUf().equals(destinationZipCodeData.getUf())) {
			calendar.add(Calendar.DAY_OF_MONTH, 3);
			discount = value * 0.75;
		} else {
			calendar.add(Calendar.DAY_OF_MONTH, 10);
		}

		var total = value - discount;
		var shipping = new Shipping(shippingCreate.getWeight(), shippingCreate.getOriginZipCode(),
				shippingCreate.getDestinationZipCode(), shippingCreate.getRecipientName(), total, calendar.getTime(),
				new Date(System.currentTimeMillis()));
		shippingRepository.save(shipping);
		return shipping.toDTO();

	}

}
