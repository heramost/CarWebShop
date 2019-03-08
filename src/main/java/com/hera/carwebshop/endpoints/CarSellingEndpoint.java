package com.hera.carwebshop.endpoints;

import com.hera.carwebshop.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarSellingEndpoint {
	private static final String NAMESPACE_URI = "http://localhost:8080";
	@Autowired
	private DealService dealService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SellCarsRequest")
	@ResponsePayload
	public SellCarsResponse getStudent(@RequestPayload SellCarsRequest request) {
		SellCarsResponse response = new SellCarsResponse();
		response.setResult(dealService.createDeal(request));
		return response;
	}
}
