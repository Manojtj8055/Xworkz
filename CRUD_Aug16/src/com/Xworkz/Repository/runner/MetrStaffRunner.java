package com.Xworkz.Repository.runner;

import com.Xworkz.Repository.app.Customer.MetroStaffImplRepository;
import com.Xworkz.Repository.app.MetroStaff.MetroStaffDTO;
import com.Xworkz.Repository.app.MetroStaff.MetroStaffRepository;

public class MetrStaffRunner {

	public static void main(String[] args) {
		
		System.out.println("running main in metroi runner");

		MetroStaffDTO dto =new MetroStaffDTO("KAido","Blackbeard","Women",50, 100);
		MetroStaffRepository repository=new MetroStaffImplRepository();
		
		repository.save(dto);
	}
}
