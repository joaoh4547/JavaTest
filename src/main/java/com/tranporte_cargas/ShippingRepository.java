package com.tranporte_cargas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranporte_cargas.entities.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {

}
