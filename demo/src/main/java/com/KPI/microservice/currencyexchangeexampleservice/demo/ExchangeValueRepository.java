package com.KPI.microservice.currencyexchangeexampleservice.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValueEntity, Long>{

	ExchangeValueEntity findByFromAndTo(String from, String to);

}
