package com.demo.soap_service.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
@Features(features="org.apache.cxf.feature.LoggingFeature")
public class HelloWorld {

	@WebMethod
	public String SayHello() {
		return "Hello World!";
	}
}
