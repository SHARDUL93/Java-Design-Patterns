package com.shardul.patterns.builder;

import com.shardul.patterns.builder.HttpClient.HttpClientBuilder;

public class Test {

	public static void main(String[] args) {

		HttpClient httpClient = new HttpClient("GET", "http://test.com", null, null, null, null);
		
		System.out.println("Using HttpClient: ");
		System.out.println(httpClient.toString());
		
		
		HttpClientBuilder builder = new HttpClient.HttpClientBuilder();
		HttpClient httpClient2 = builder
				.method("POST")
				.url("testurl")
				.body("{}")
				.secure("user", "pass")
				.build();
		
		System.out.println("Using HttpClientBuilder: ");
		System.out.println(httpClient2.toString());
		
		

	}

}
