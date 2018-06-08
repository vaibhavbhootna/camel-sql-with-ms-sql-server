package com.myPersonalData.service.processor;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.umss.xy.ws.GetMyCar;


public class GetMyCarRequestProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        GetMyCar request = exchange.getIn().getBody(GetMyCar.class);
        
        Map<String, Object> map = new HashMap<>();
        map.put("msisdn", request.getMsisdn());

        exchange.getOut().setBody(map);
    }

}
