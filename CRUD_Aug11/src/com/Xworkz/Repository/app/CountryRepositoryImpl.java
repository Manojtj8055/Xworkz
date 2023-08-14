package com.Xworkz.Repository.app;

public class CountryRepositoryImpl implements CountryRepository{

	String[] allnames=new String[TOTAL_COUNTRY];
	
	private int num=0;
	
	private int start=0;

	@Override
	public void Country(String name) {
		
		if(num<TOTAL_COUNTRY) {
			allnames[num]=name;
			System.out.println("names at index: "+num+ " is: " +allnames[num]);
			num++;
		}
		else {
			System.err.println("Index limit exceeded,Cannot store values");
		}
	}

@Override
	public void diplay() {
		for(int Start=0;Start<10;Start++) {
			System.out.println("index value " + Start + " country name " + allnames[Start]);
		}
	} 

	@Override
	public boolean isExist(String name) {
		for(int index=0; index<allnames.length; index++)
		{
			String ref=allnames[index];
			if(ref.equalsIgnoreCase(name)) {
			System.out.println("Name checked is : "+name);	
			return true;
		}
			else {
				}
			}
		return false;
	}

	@Override
	public void findStartsWith(String name) {
		String[] values =new String[TOTAL_COUNTRY];
		for(int index=0;index<TOTAL_COUNTRY;index++) {
			String substring = allnames[index];
			if(substring.startsWith(name)) {
				values[start]=substring;
				System.out.println("Country name Starting with "+ name + " is " + values[start]);
				start++;
			}
		}
		return;
	}

	@Override
	public void findEndsWith(String name) {
		String[] values=new String[TOTAL_COUNTRY];
		for(int index=0; index<TOTAL_COUNTRY;index++) {
			String subString=allnames[index];
			if(subString.endsWith(name)) {
				values[start]=subString;
				System.out.println("Country name ending with " + name + " is "+ values[start]);
				start++;
			}
		}
	return ;
	}
	
	
	

}
