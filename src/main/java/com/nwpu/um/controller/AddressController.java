package com.nwpu.um.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nwpu.um.model.AddressModel;
import com.nwpu.um.service.AddressService;
import com.nwpu.um.vo.AddressInfo;
import com.nwpu.um.vo.ResultBean;

/**
 * 收货地址api
 * 
 * @author GWD
 *
 */
@RestController
@RequestMapping("/address")
public class AddressController {

	private final Logger LOG = LoggerFactory.getLogger(AddressController.class);

	@Autowired
	private AddressService addressService;

	/**
	 * 查询收货地址
	 * 
	 * @param addressBean
	 * @return
	 */
	@RequestMapping(value = "queryAddress", method = RequestMethod.GET)
	public ResultBean<AddressModel> queryAddress(@RequestParam("uiid")String uiid) {

		if (StringUtils.isBlank(uiid)) {
			return new ResultBean<AddressModel>(ResultBean.FAILURE_CODE, "uiid不能为空");
		}

		AddressModel addressModel = addressService.queryAddress(uiid);
		return new ResultBean<AddressModel>(ResultBean.SUCCESS_CODE, ResultBean.SUCCESS_DESC, addressModel);
	}

	/**
	 * 添加收货地址
	 * 
	 * @param addressBean
	 * @return
	 */
	@RequestMapping(value = "addAddress", method = RequestMethod.POST)
	public ResultBean<AddressModel> addAddress(@RequestBody AddressInfo info) {

		int num = addressService.saveAddress(info);
		LOG.info("The num is:{}",num);
		if (num != 1) {
			return new ResultBean<AddressModel>(ResultBean.FAILURE_CODE, "添加收货地址失败");
		}
		return new ResultBean<AddressModel>(ResultBean.SUCCESS_CODE, ResultBean.SUCCESS_DESC);
	}

}
