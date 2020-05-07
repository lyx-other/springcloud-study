package com.common;

import lombok.Data;

/**
 * 返回数据封装
 */
@Data
public class ResponseBean<T>
{
	private Boolean success;

	private String msg; // 要传给前端的数据

	private T data; // 要传给前端的数据

	private ResponseBean()
	{
	}

	private ResponseBean(Boolean success, String msg, T data)
	{
		this.success = success;
		this.msg = msg;
		this.data = data;
	}

	public static <T> ResponseBean<T> success()
	{
		return new ResponseBean<T>(true,null,null);
	}

	public static <T> ResponseBean<T> successMsg(String msg)
	{
		return new ResponseBean<T>(true, msg, null);
	}

	public static <T> ResponseBean<T> successData(T data)
	{
		return new ResponseBean<T>(true,null,data);
	}

	public static <T> ResponseBean<T> successMsgData(String msg, T data)
	{
		return new ResponseBean<T>(true,msg,data);
	}

	public static <T> ResponseBean<T> errorMsg(String msg)
	{
		return new ResponseBean<T>(false, msg, null);
	}
}