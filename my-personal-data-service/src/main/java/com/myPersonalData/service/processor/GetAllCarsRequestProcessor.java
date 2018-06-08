package com.myPersonalData.service.processor;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.umss.xy.ws.GetAllCars;

public class GetAllCarsRequestProcessor implements Processor {

	private static final Logger LOGGER = LoggerFactory.getLogger(GetAllCarsRequestProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		GetAllCars request = exchange.getIn().getBody(GetAllCars.class);

		Map<String, Object> parameters = new HashMap<>();
		parameters.put("msisdn", request.getMsisdn());
		
		exchange.getOut().setBody(parameters);
	}

}
