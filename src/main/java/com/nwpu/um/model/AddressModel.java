package com.nwpu.um.model;
/**
 * 用户收货地址信息
 * 
 * @author GWD
 *
 */

import java.io.Serializable;
import java.sql.Timestamp;

import org.hibernate.validator.constraints.Email;

public class AddressModel implements Serializable{
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
	private String uiid;
	/**
	 * 证件号码
	 */
	private String idNumber;
	/**
	 * 证件类型
	 */
	private String idType;
	/**
	 * 手机号码
	 */
	private String phone;
	/**
	 * 收货人
	 */
	private String consignee;
	/**
	 * 省
	 */
	private String province;
	/**
	 * 市
	 */
	private String city;
	/**
	 * 区（县）
	 */
	private String county;
	/**
	 * 街道（镇）
	 */
	private String town;
	/**
	 * 详细地址
	 */
	private String detailAddr;
	/**
	 * 收件人邮箱
	 */
	@Email(message="请输入正确的邮箱")
	private String email;
	/**
	 * 是否为默认地址
	 */
	private String isDefaultAddr;
	/**
	 * 创建时间
	 */
	private Timestamp createTime;
	/**
	 * 更新时间
	 */
	private Timestamp updateTime;

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

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "AddressBean [addrId=" + addrId + ", uiid=" + uiid + ", idNumber=" + idNumber + ", idType="
				+ idType + ", phone=" + phone + ", consignee=" + consignee + ", province=" + province + ", city=" + city
				+ ", county=" + county + ", town=" + town + ", detailAddr=" + detailAddr + ", email=" + email
				+ ", isDefaultAddr=" + isDefaultAddr + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}

}
