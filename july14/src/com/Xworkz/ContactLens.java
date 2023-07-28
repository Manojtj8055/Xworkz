package com.Xworkz;

public class ContactLens {

	
	static String company;
	String Type;
	
	
	public static void main(String[] args) {
	System.out.println("Running main in ContactLens");
	
	
	ContactLens ref1=new ContactLens();
	ContactLens ref2=new ContactLens();

	ref1.Type="dustless";
	ref2.Type="dustproof";
	
	ref1.getType();
	System.out.println();
	ref2.getType();
	
	
	}
	static {
		ContactLens.company="LensKArt";
	}
	static void getcompany() {
		System.out.println("ContactLens company is :" + ContactLens.company);
		
	}
void getType() {
	System.out.println("Running non static method in ContcatLens");
	System.out.println("Type of Lens :" + this.Type);
	getcompany();
	
}
}
