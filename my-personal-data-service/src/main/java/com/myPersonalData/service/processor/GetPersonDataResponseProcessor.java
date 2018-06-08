package com.myPersonalData.service.processor;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.umss.xy.ws.Address;
import com.umss.xy.ws.GetPersonDataResponse;
import com.umss.xy.ws.Person;
import com.umss.xy.ws.Persons;
import com.umss.xy.ws.ResponseBody;
import com.umss.xy.ws.ResponseHeader;

public class GetPersonDataResponseProcessor implements Processor {

	private static final Logger LOGGER = LoggerFactory.getLogger(GetPersonDataResponseProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		List dbResponse = exchange.getIn().getBody(List.class);

		LOGGER.info(dbResponse.toString());
		Map map = (Map) dbResponse.get(0);

		GetPersonDataResponse response = new GetPersonDataResponse();
		ResponseHeader header = new ResponseHeader();

		if (map == null || map.isEmpty()) {
			header.setCode(0);
			header.setDescription("No information was found to show.");
		} else {
			header.setCode(1);
			header.setDescription("The query was successfully completed.");

			ResponseBody body = new ResponseBody();
			Persons persons = new Persons();

			Person person = new Person();
			person.setName(map.get("Name").toString());
			person.setFirstName(map.get("FName").toString());
			person.setLastName(map.get("LName").toString());
			Address address = new Address();
			address.setStreet(map.get("Direction").toString());
			address.setCity(map.get("City").toString());
			address.setCountry(map.get("Country").toString());
			person.getAddress().add(address);

			persons.getPerson().add(person);
			body.setPersons(persons);
			response.setResponseBody(body);
		}
		response.setResponseHeader(header);
		exchange.getOut().setBody(response);
	}

}
