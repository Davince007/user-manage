package com.nwpu.um.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwpu.um.mapper.AddressMapper;
import com.nwpu.um.model.AddressModel;
import com.nwpu.um.service.AddressService;
import com.nwpu.um.vo.AddressInfo;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressMapper addressDao;

	@Override
	public int saveAddress(AddressInfo info) {
		return addressDao.saveAddress(info);
	}

	@Override
	public int delAddress(String uiid) {
		return addressDao.delAddress(uiid);
	}

	@Override
	public AddressModel queryAddress(String uiid) {
		return addressDao.queryAddress(uiid);
	}

	@Override
	public int updateAddress(AddressInfo info) {
		return addressDao.updateAddress(info);
	}
}
