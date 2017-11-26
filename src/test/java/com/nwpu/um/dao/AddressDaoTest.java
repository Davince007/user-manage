package com.nwpu.um.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nwpu.um.UMApplicationTests;
import com.nwpu.um.mapper.AddressMapper;
import com.nwpu.um.model.AddressModel;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AddressDaoTest extends UMApplicationTests{
	
	@Autowired
	private AddressMapper addressMapper;
	
	@Test
	public void testQueryAddress() {
		
		String uiid = "123456";
		AddressModel addressModel = addressMapper.queryAddress(uiid);
		Assert.assertEquals(addressModel.getIdNumber(), "420101199001011234");
	}
	
	@Test
	public void testDelAddress() {
	}
	
	@Test
	public void testAddAddress() {
	}
	
	@Test
	public void testUpdateAddress() {
	}
}
