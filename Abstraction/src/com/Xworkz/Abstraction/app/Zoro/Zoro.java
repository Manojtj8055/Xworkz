package com.Xworkz.Abstraction.app.Zoro;

public class Zoro {

private Kidney kidney;
	
	public Zoro(Kidney kidney) {
		this.kidney = kidney;
		System.out.println("Kidney arguement constructor of zoro");
	}

	public void check() {
		if(kidney!=null) {
			System.out.println("kidney is not null");
			this.kidney.clean();
		}
		else {
			System.err.println("Kidney is null, kidney not working...");
		}
	}
}
