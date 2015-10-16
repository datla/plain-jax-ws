package com.kthree.ws.service.calc.endpoint;

import javax.xml.ws.Endpoint;

import com.kthree.ws.service.calc.Calculator;

public class CalculatorEndpointPublisher {
	 public static void main(String[] args) {
	        Endpoint.publish("http://localhost:8080/CalculatorWs/Calculator",
	                        new Calculator());
	    }

}
