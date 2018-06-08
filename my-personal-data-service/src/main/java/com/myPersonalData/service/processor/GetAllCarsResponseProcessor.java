package com.myPersonalData.service.processor;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.umss.xy.ws.Address;
import com.umss.xy.ws.Car;
import com.umss.xy.ws.Cars;
import com.umss.xy.ws.Color;
import com.umss.xy.ws.GetAllCarsResponse;
import com.umss.xy.ws.ResponseBody;
import com.umss.xy.ws.ResponseHeader;

public class GetAllCarsResponseProcessor implements Processor {

	private static final Logger LOGGER = LoggerFactory.getLogger(GetAllCarsResponseProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		GetAllCarsResponse response = new GetAllCarsResponse();
		List dbResponse = exchange.getIn().getBody(List.class);

		LOGGER.info(dbResponse.toString());

		ResponseHeader header = new ResponseHeader();

		if (dbResponse == null || dbResponse.isEmpty()) {
			header.setCode(0);
			header.setDescription("No information was found to show.");
		} else {
			header.setCode(1);
			header.setDescription("The query was successfully completed.");

			ResponseBody body = new ResponseBody();
			Cars cars = new Cars();
			for (Object object : dbResponse) {
				if (object instanceof Map) {
					Map map = (Map) object;

					LOGGER.info("Data : {} ", map.toString());

					Car car = new Car();

					 car.setIdCar(new BigInteger(map.get("ID").toString()).intValue());
					car.setBrand(map.get("BrandName").toString());
					car.setModel(map.get("CarModel").toString());

					Color color = new Color();
					color.setPrimary(map.get("color_pri").toString());
					color.setSecondary(map.get("CarColor").toString());

					car.setColor(color);
					cars.getCar().add(car);
				}
			}
			// SELECT id_car as ID, model as CarModel, brand as BrandName,
			// color_pri, color_sec as CarColor FROM Car WHERE brand=:#msisdn
			body.setCars(cars);
			response.setResponseBody(body);
		}
		response.setResponseHeader(header);
		exchange.getOut().setBody(response);
	}

}
