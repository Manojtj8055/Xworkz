package com.xworkz.string.app;

public class State {

public static void main(String []args) {

 String name = "manu";
 
char result = name.charAt(0);
 int result1 = name.codePointAt(0); 
int result2=name.codePointBefore(3);
String result3=name.replace("manu", "MANU");
int result4=name.compareToIgnoreCase(result3);
boolean result5 =name.contentEquals(result3); 
boolean result6 =name.equalsIgnoreCase(result3);
boolean result7 =name.isEmpty();
String result8 =name.concat("ok");
String result9 =name.substring(1, 4);
int result10 =name.indexOf(result1, result4);
String[] result11 =name.split(result9);
String result12=name.toUpperCase();
String result13=name.toLowerCase();
char[] result14=name.toCharArray();




 System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3 + "\n" 
+ result4 + "\n"+ result5 + "\n"+ result6 + "\n"+ result7 + "\n"+ result8 + "\n"+ result9 +
"\n"+ result10 + "\n" + result11 + "\n" + result12 + "\n" + result13 + "\n" + result14);
 
 
	
}
}