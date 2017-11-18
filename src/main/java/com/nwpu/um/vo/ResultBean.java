package com.nwpu.um.vo;

import java.io.Serializable;

public class ResultBean <T> implements Serializable{

	private static final long serialVersionUID = 9027468563707925143L;
	
	public static final String SUCCESS_CODE = "000000";
	public static final String FAILURE_CODE = "999999";
	public static final String APP_ERROR = "111111";
	public static final String SUCCESS_DESC = "SUCCESS";

	/** 返回码 */
	private String resultCode;
	/** 返回描述信息 */
	private String resultDesc;
	/** 返回数据 */
	private T data;

	public ResultBean(String resultCode, T data) {
		this.resultCode = resultCode;
		this.data = data;
	}

	public ResultBean(String resultCode, String resultDesc) {
		this.resultCode = resultCode;
		this.resultDesc = resultDesc;
	}
	
	public ResultBean(String resultCode, String resultDesc, T data) {
		this.resultCode = resultCode;
		this.resultDesc = resultDesc;
		this.data = data;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
