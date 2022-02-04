package com.tranporte_cargas.services.interfaces;

import com.tranporte_cargas.dtos.ShippingCreateDTO;
import com.tranporte_cargas.dtos.ShippingDTO;
import com.tranporte_cargas.services.errors.ServiceError;

public interface ShippingService {
	ShippingDTO Create(ShippingCreateDTO shippingCreate) throws  ServiceError;
}
