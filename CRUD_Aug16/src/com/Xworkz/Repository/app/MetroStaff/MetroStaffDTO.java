package com.Xworkz.Repository.app.MetroStaff;

public class MetroStaffDTO {

	private String TicketCounter;
	
	private String Watchmen;
	
	private String Driver;
	
	private int NoOfEmployee;
	
	private int StaffAttendance;

	
	public String getTicketCounter() {
		return TicketCounter;
	}

	public void setTicketCounter(String ticketCounter) {
		this.TicketCounter = ticketCounter;
	}

	public String getWatchmen() {
		return Watchmen;
	}

	public void setWatchmen(String watchmen) {
		this.Watchmen = watchmen;
	}

	public String getDriver() {
		return Driver;
	}

	public void setDriver(String driver) {
		this.Driver = driver;
	}

	public int getNoOfEmployee() {
		return NoOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.NoOfEmployee = noOfEmployee;
	}

	public int getStaffAttendance() {
		return StaffAttendance;
	}

	public void setStaffAttendance(int staffAttendance) {
		this.StaffAttendance = staffAttendance;
	}

	public MetroStaffDTO() {}
	
	
	public MetroStaffDTO(String ticketCounter, String watchmen, String driver, int noOfEmployee, int staffAttendance) {
		
		this.TicketCounter = ticketCounter;
		this.Watchmen = watchmen;
		this.Driver = driver;
		this.NoOfEmployee = noOfEmployee;
		this.StaffAttendance = staffAttendance;
	}

	@Override
	public String toString() {
		return "MetroStaffDTO [TicketCounter=" + TicketCounter + ", Watchmen=" + Watchmen + ", Driver=" + Driver
				+ ", NoOfEmployee=" + NoOfEmployee + ", StaffAttendance=" + StaffAttendance + "]";
	}
	
	
	
	
}
