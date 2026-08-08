package com.myservlet;

public class ServiceBean 
{
	private String type,service;
	
	public ServiceBean() {}
	
	public ServiceBean(String type, String service) {
		
		this.type = type;
		this.service = service;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	String getService() {
		return service;
	}

	void setService(String service) {
		this.service = service;
	}
	//BusinessLogic method
	public String getServiceStatus() {
		String serivce=null;
		if(type.equals("current")) 
			serivce="overdarft";
		if(type.equals("savings")) 
			serivce="FD";
		return"serivce";

  }
}
