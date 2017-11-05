package com.nwpu.um.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nwpu.um.UMApplicationTests;
import com.nwpu.um.bean.AddressBean;
import com.nwpu.um.dao.AddressDao;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AddressDaoTest extends UMApplicationTests{

	@Autowired
	private AddressDao addressDao;
	
	@Test
	public void testQueryAddress() {
		AddressBean addressBean = new AddressBean();
		String uiid = "123";
		addressBean = addressDao.queryAddress(uiid);
		 Assert.assertEquals("13100001111", addressBean.getPhone());
	}
}
