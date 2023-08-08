package com.Xworz.Interrface.app.patent;

public class NewProduct implements PatentRule {

	public void getSymbol() {
		System.out.println("Symbol should not be similar");
		
	}
	public void getTR() {
		System.out.println("TradeMark should be diff");
	}
	
}
