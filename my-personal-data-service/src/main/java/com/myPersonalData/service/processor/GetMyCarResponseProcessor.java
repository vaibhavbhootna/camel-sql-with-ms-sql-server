package com.myPersonalData.service.processor;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.umss.xy.ws.Car;
import com.umss.xy.ws.Color;
import com.umss.xy.ws.GetMyCarResponse;
import com.umss.xy.ws.Person;
import com.umss.xy.ws.Persons;
import com.umss.xy.ws.ResponseBody;
import com.umss.xy.ws.ResponseHeader;

public class GetMyCarResponseProcessor implements Processor {

	private static final Logger LOGGER = LoggerFactory.getLogger(GetMyCarResponseProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		GetMyCarResponse response = new GetMyCarResponse();
		List dbResponse = exchange.getIn().getBody(List.class);

		LOGGER.info(dbResponse.toString());
		
		ResponseHeader header = new ResponseHeader();

		if (dbResponse == null || dbResponse.isEmpty()) {
			header.setCode(0);
			header.setDescription("No information was found to show.");
		} else {
			Map map = (Map) dbResponse.get(0);
			header.setCode(1);
			header.setDescription("The query was successfully completed.");

			ResponseBody body = new ResponseBody();
			Persons persons = new Persons();

			Person person = new Person();
			//[{DNI=11, Name=Juan1, FName=Perez1, LName=Arnez1, CarModel=M2018, BrandName=Toyota, 
			//PrimaryColor=Red, SecondaryColor=Red}]
			
			person.setIdPerson(new BigInteger(map.get("DNI").toString()).intValue());
			person.setName(map.get("Name").toString());
			person.setFirstName(map.get("FName").toString());
			person.setLastName(map.get("LName").toString());

			Car car = new Car();

			car.setBrand(map.get("BrandName").toString());
			car.setModel(map.get("CarModel").toString());

			Color color = new Color();
			color.setPrimary(map.get("PrimaryColor").toString());
			color.setSecondary(map.get("SecondaryColor").toString());

			car.setColor(color);
			person.setCar(car);

			persons.getPerson().add(person);
			body.setPersons(persons);
			response.setResponseBody(body);
		}
		response.setResponseHeader(header);
		exchange.getOut().setBody(response);

	}

}
