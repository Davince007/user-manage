package com.nwpu.um.vo;
/**
 * 用户收货地址信息
 * 
 * @author GWD
 *
 */

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class AddressInfo implements Serializable {
	/**
	 * 序列化版本ID
	 */
	private static final long serialVersionUID = -1404462225869812886L;
	/**
	 * 主键
	 */
	private long addrId;
	/**
	 * 用户信息表主键
	 */
	@NotBlank
	@Length(min = 1, max = 32, message = "uiid不能为空")
	private String uiid;
	/**
	 * 证件号码
	 */
	@NotBlank
	@Length(min = 15, max = 18, message = "idNumber不能为空")
	private String idNumber;
	/**
	 * 证件类型
	 */
	@NotBlank
	@Length(min = 1, max = 1, message = "idType不能为空")
	private String idType;
	/**
	 * 手机号码
	 */
	@NotBlank
	@Length(min = 11, max = 11, message = "手机号码不能为空")
	private String phone;
	/**
	 * 收货人
	 */
	@NotBlank
	@Length(min = 1, max = 15, message = "收货人名不能为空")
	private String consignee;
	/**
	 * 省
	 */
	@NotBlank
	@Length(min = 1, max = 15, message = "省名称不能为空")
	private String province;
	/**
	 * 市
	 */
	@NotBlank
	@Length(min = 1, max = 15, message = "市名称不能为空")
	private String city;
	/**
	 * 区（县）
	 */
	@Length(min = 1, max = 15)
	private String county;
	/**
	 * 街道（镇）
	 */
	@Length(min = 1, max = 15)
	private String town;
	/**
	 * 详细地址
	 */
	@NotBlank
	@Length(min = 1, max = 120, message = "详细地址不能为空")
	private String detailAddr;
	/**
	 * 收件人邮箱
	 */
	@NotBlank
	@Email(message = "请输入正确的邮箱")
	@Length(min = 1, max = 45, message = "电子邮箱不能为空")
	private String email;
	/**
	 * 是否为默认地址
	 */
	@NotBlank
	@Length(min = 1, max = 1, message = "默认地址选项不能为空")
	private String isDefaultAddr;

	/**
	 * 创建人
	 */
	private String createUser;

	/**
	 * 创建日期
	 */
	private String createDate;

	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 修改人
	 */
	private String updateUser;

	/**
	 * 修改日期
	 */
	private String updateDate;

	/**
	 * 修改时间
	 */
	private String updateTime;

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public long getAddrId() {
		return addrId;
	}

	public void setAddrId(long addrId) {
		this.addrId = addrId;
	}

	public String getUiid() {
		return uiid;
	}

	public void setUiid(String uiid) {
		this.uiid = uiid;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getDetailAddr() {
		return detailAddr;
	}

	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsDefaultAddr() {
		return isDefaultAddr;
	}

	public void setIsDefaultAddr(String isDefaultAddr) {
		this.isDefaultAddr = isDefaultAddr;
	}

	@Override
	public String toString() {
		return "AddressInfo [addrId=" + addrId + ", uiid=" + uiid + ", idNumber=" + idNumber + ", idType=" + idType
				+ ", phone=" + phone + ", consignee=" + consignee + ", province=" + province + ", city=" + city
				+ ", county=" + county + ", town=" + town + ", detailAddr=" + detailAddr + ", email=" + email
				+ ", isDefaultAddr=" + isDefaultAddr + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", createTime=" + createTime + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", updateTime=" + updateTime + "]";
	}

}
