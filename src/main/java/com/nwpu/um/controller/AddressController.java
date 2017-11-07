package com.nwpu.um.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nwpu.um.bean.AddressBean;
import com.nwpu.um.bean.ResultBean;
import com.nwpu.um.service.AddressService;

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
	public ResultBean<AddressBean> queryAddress(AddressBean addressBean) {

		String uiid = addressBean.getUiid();
		if (StringUtils.isBlank(uiid)) {
			return new ResultBean<AddressBean>(ResultBean.FAILURE_CODE, "uiid不能为空");
		}

		addressBean = addressService.queryAddress(addressBean.getUiid());
		LOG.info("The addressBean is:{}", addressBean);
		return new ResultBean<AddressBean>(ResultBean.SUCCESS_CODE, ResultBean.SUCCESS_DESC, addressBean);
	}

	/**
	 * 添加收货地址
	 * 
	 * @param addressBean
	 * @return
	 */
	@RequestMapping(value = "addAddress", method = RequestMethod.POST)
	public ResultBean<AddressBean> addAddress(@RequestBody AddressBean addressBean) {

		int num = addressService.addAddress(addressBean);
		LOG.info("The num is:{}",num);
		if (num != 1) {
			return new ResultBean<AddressBean>(ResultBean.FAILURE_CODE, "添加收货地址失败");
		}
		return new ResultBean<AddressBean>(ResultBean.SUCCESS_CODE, ResultBean.SUCCESS_DESC);
	}

}
