package com.java.address.dao;

import com.java.address.dto.AddressDto;



public interface AddressDao {
	public int write(AddressDto addressDto);
	public AddressDto select(String name);
	public int deleteOk(String name);
	public int updateOk(AddressDto addressDto);
}
