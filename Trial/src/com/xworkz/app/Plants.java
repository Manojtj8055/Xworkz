package com.xworkz.app;

public class Plants {
	
	private String Weather;
	private String Region;
	public Plants(String weather, String region) {
		
		this.Weather = weather;
		this.Region = region;
	}
	
	public void printinfo() {
		
		System.out.println("Weather of the plant is :" + Weather);
		System.out.println("Region of the plant is :" + Region);

	}
	
	
	
		
	

}
