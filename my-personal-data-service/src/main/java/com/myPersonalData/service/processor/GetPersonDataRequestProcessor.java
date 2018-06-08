package com.myPersonalData.service.processor;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.umss.xy.ws.GetPersonData;


public class GetPersonDataRequestProcessor implements Processor {

	private static final Logger LOGGER = LoggerFactory.getLogger(GetPersonDataRequestProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        GetPersonData request = exchange.getIn().getBody(GetPersonData.class);
        LOGGER.info("GetPersonData Msisdn : {}", request.getMsisdn().intValue());
        Map<String, Object> sqlParameters = new HashMap<>();
        sqlParameters.put("msisdn", request.getMsisdn());
        
        exchange.getOut().setBody(sqlParameters);
    }
}
