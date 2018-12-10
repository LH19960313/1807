package com.jt.sys.demo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.xml.ws.Service;
import java.io.Serializable;

/**
 * 通过此对象实现微服务数据的封装操作
 * @author Administrator
 *
 */
public class JsonResult implements Serializable{
	private  final  String name="service";
	private static final long serialVersionUID = 3133625495337010656L;
	/** 状态码,1表示正确,0表示错误*/
	private int state=1;
	/** 状态对应的消息*/
	private String message="OK";
	/**要呈现的数据*/
	private Object data;
	/**服务提供者**/
	private String ServiceProvider;
	//如果在哪个微服务出现了微服务内部业务错误应当 存入当前的服务名称
	public JsonResult(Throwable e){
		this.state=0;
		this.message=e.getMessage();
		this.ServiceProvider= name;
	}
	public JsonResult() {}
	public JsonResult(Object data) {
		super();
		this.data = data;
	}

	public void setState(int state) {
		this.state = state;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public int getState() {
		return state;
	}
	public String getMessage() {
		return message;
	}
	public Object getData() {
		return data;
	}
	public String getServiceProvider() {
		return ServiceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		ServiceProvider = serviceProvider;
	}
}
