package com.nwpu.um.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nwpu.um.bean.AddressBean;

/**
 * 收货地址Dao接口
 * @author GWD
 *
 */
@Mapper
public interface AddressDao {
	/**
	 * 添加收货地址
	 * @param addressBean
	 * @return
	 */
	public int addAddress(AddressBean addressBean);
	
	/**
	 * 删除收货地址
	 * @param addressId
	 * @param uiid
	 * @return
	 */
	public int delAddress(@Param("addressId")String addressId,@Param("uiid")String uiid);
	
	/**
	 * 查询收货地址
	 * @param uiid
	 * @return
	 */
	public AddressBean queryAddress(@Param("uiid")String uiid);
	
	/**
	 * 修改收货地址
	 * @param addressBean
	 * @return
	 */
	public AddressBean updateAddress(AddressBean addressBean);
}
