package com.KPI.microservice.currency_conversion.currency_conversion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValueEntity, Long>{

	ExchangeValueEntity findByFromAndTo(String from, String to);

}
