package com.kthree.ws.calc.endpoint;

import javax.xml.ws.Endpoint;

import com.kthree.ws.calc.Calculator;

public class CalculatorEndpointPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/CalculatorWs/Calculator", new Calculator());
	}

}
