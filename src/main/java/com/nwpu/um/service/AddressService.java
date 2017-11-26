package com.nwpu.um.service;

import com.nwpu.um.model.AddressModel;
import com.nwpu.um.vo.AddressInfo;

/**
 * 收货地址管理接口
 * 
 * @author GWD
 *
 */
public interface AddressService {

	/**
	 * 添加收货地址
	 * @param addressBean
	 * @return
	 */
	public int saveAddress(AddressInfo info);
	
	/**
	 * 删除收货地址
	 * @param uiid
	 * @return
	 */
	public int delAddress(String uiid);
	
	/**
	 * 查询收货地址
	 * @param uiid
	 * @return
	 */
	public AddressModel queryAddress(String uiid);
	
	/**
	 * 修改收货地址
	 * @param info
	 * @return
	 */
	public int updateAddress(AddressInfo info);
}
