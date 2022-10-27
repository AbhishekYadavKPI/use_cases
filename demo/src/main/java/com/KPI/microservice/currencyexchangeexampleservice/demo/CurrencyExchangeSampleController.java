package com.KPI.microservice.currencyexchangeexampleservice.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController   
public class CurrencyExchangeSampleController   
{ 
	

	  @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	  public CurrencyConversionSampleBean convertCurrency(@PathVariable String from, @PathVariable String to,
	      @PathVariable BigDecimal quantity) {
			
			  Map<String, String> uriVariables = new HashMap<>(); uriVariables.put("from",
			  from); uriVariables.put("to", to);
			  
			  ResponseEntity<CurrencyConversionSampleBean> responseEntity = new
			  RestTemplate().getForEntity(
			  "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
			  CurrencyConversionSampleBean.class, uriVariables);
			  
			  CurrencyConversionSampleBean response = responseEntity.getBody();
			 

	    return new CurrencyConversionSampleBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
	            quantity.multiply(response.getConversionMultiple()), response.getPort());
	  }
	  
	   
	  @Autowired  
	  private ExchangeValueRepository repository;  
	  @GetMapping("/currency-exchange/from/{from}/to/{to}")       //where {from} and {to} are path variable  
	  public ExchangeValueEntity retrieveExchangeValue(@PathVariable String from, @PathVariable String to)   //from map to USD and to map to INR  
	  {         
	  ExchangeValueEntity exchangeValue = repository.findByFromAndTo(from, to);  
	  //setting the port  
	  //exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));  
	  return exchangeValue;  
	  }  
}