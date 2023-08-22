package com.xworkz.service.util.validate;

public class ValidateUtil {

	public static boolean validateString(String str) {
		if(str!=null && !str.isEmpty() && str.length()>0 && str.length()<30){
			return true;
		}else {
			return false;
		}
	}
		public static boolean validateNumber(double d) {
			if(d>0 && d<22000) {
				return true;
			}
			else
			{
			}				
			return false;

			}
		
		public static int validateNum(int d) {
			if(d>0 && d<22000) {
			
			}
			else
			{
			}
			return d;				
			

			}

}
