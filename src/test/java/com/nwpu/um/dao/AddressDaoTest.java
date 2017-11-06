package com.nwpu.um.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nwpu.um.UMApplicationTests;
import com.nwpu.um.dao.AddressDao;
import com.nwpu.um.model.AddressModel;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AddressDaoTest extends UMApplicationTests{

	@Autowired
	private AddressDao addressDao;
	
	@Test
	public void testQueryAddress() {
		AddressModel addressBean = new AddressModel();
		String uiid = "123";
		addressBean = addressDao.queryAddress(uiid);
		 Assert.assertEquals("13100001111", addressBean.getPhone());
	}
	
	@Test
	public void testDelAddress() {
		String uiid = "123";
		int num = addressDao.delAddress(uiid);
		Assert.assertEquals(1, num);
	}
	
	@Test
	public void testAddAddress() {
		AddressModel addressBean = new AddressModel();
		addressBean.setUiid("1234");
		addressBean.setIdNumber("420101199001018888");
		addressBean.setIdType("1");
		addressBean.setPhone("13100000001");
		addressBean.setConsignee("Rose");
		addressBean.setProvince("广东省");
		addressBean.setCity("深圳市");
		addressBean.setCounty("福田区");
		addressBean.setTown("福强路");
		addressBean.setDetailAddr("福田花园A栋");
		addressBean.setEmail("123456789@qq,com");
		addressBean.setIsDefaultAddr("Y");
		int num = addressDao.addAddress(addressBean);
		Assert.assertEquals(1, num);
	}
	
	@Test
	public void testUpdateAddress() {
		AddressModel addressBean = addressDao.queryAddress("1234");
		addressBean.setEmail("987654321@qq,com");
		addressBean.setIsDefaultAddr("N");
		int num = addressDao.updateAddress(addressBean);
		Assert.assertEquals(1, num);
	}
}
