package com.hh.springMVC.framework.servlet;

import java.util.Map;

public class HHModelAndView {


	//ҳ��ģ��
	private String view;

	/** Model Map */
	//Ҫ��ҳ���ϴ���ȥ��ֵ
	private Map<String,Object> model;
	
	public HHModelAndView(String view){
		this.view = view;
	}
	
	public HHModelAndView(String view,Map<String,Object> model){
		this.view = view;
		this.model = model;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}

}
