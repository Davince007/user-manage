package com.nwpu.um.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwpu.um.bean.AddressBean;
import com.nwpu.um.dao.AddressDao;
import com.nwpu.um.service.AddressService;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDao addressDao;

	@Override
	public int addAddress(AddressBean addressBean) {
		return addressDao.addAddress(addressBean);
	}

	@Override
	public int delAddress(String uiid) {
		return addressDao.delAddress(uiid);
	}

	@Override
	public AddressBean queryAddress(String uiid) {
		return addressDao.queryAddress(uiid);
	}

	@Override
	public int updateAddress(AddressBean addressBean) {
		return addressDao.updateAddress(addressBean);
	}
}
