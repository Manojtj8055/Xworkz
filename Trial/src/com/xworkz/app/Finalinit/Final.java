package com.xworkz.app.Finalinit;

public class Final {

	private final String technologyName;
	private final String technologyFeatures;
	private final boolean technology;
	public Final(String technologyName, String technologyFeatures, boolean technology) {
		
		this.technologyName = technologyName;
		this.technologyFeatures = technologyFeatures;
		this.technology = technology;
	}
	 public final void show() {
		 System.out.println("Technology is  " + technologyName);
		 System.out.println("Features of this technology " + technologyFeatures );
		 System.out.println("Exits = " + technology);

		 
	 }
	
	

}
