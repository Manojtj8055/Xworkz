package com.Xworkz.Repository.app.Customer;

import com.Xworkz.Repository.app.MetroStaff.MetroStaffDTO;
import com.Xworkz.Repository.app.MetroStaff.MetroStaffRepository;

public class MetroStaffImplRepository implements MetroStaffRepository {
	
	MetroStaffDTO[] dtos=new MetroStaffDTO[TOTAL_COUNT];
	int index=0;
	
	@Override
	public void save(MetroStaffDTO dto) {

		if(this.index<TOTAL_COUNT) {
			this.dtos[index]=dto;
			System.out.println(dto);
			index++;
		}
		else {
			System.err.println("cannot add next values");
		}
	}
		
	}


