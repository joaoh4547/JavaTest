package com.tranporte_cargas.services.interfaces;

import com.tranporte_cargas.dtos.ShippingCreateDTO;
import com.tranporte_cargas.dtos.ShippingDTO;

public interface ShippingService {
	ShippingDTO Create(ShippingCreateDTO shippingCreate);
}
