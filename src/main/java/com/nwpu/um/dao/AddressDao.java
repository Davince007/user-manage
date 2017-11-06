package com.nwpu.um.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nwpu.um.model.AddressModel;

/**
 * 收货地址Dao接口
 * 
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
	public int addAddress(AddressModel addressBean);
	
	/**
	 * 删除收货地址
	 * @param uiid
	 * @return
	 */
	public int delAddress(@Param("uiid")String uiid);
	
	/**
	 * 查询收货地址
	 * @param uiid
	 * @return
	 */
	public AddressModel queryAddress(@Param("uiid")String uiid);
	
	/**
	 * 修改收货地址
	 * @param addressBean
	 * @return
	 */
	public int updateAddress(AddressModel addressBean);
}
