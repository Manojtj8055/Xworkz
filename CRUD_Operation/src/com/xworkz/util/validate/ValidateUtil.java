package com.xworkz.util.validate;

public class ValidateUtil {

	public static boolean validateString(String str) {
		if(str!=null && !str.isEmpty() && str.length()>=5 && str.length()<=30) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean validateNo(int i) {
		if(i>0 && i<500) {
			return true;
		}else {
		return false;
		}
	}
}
