package com.hh.springMVC.dome.mvc.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hh.springMVC.dome.service.INamedService;
import com.hh.springMVC.dome.service.IService;
import com.hh.springMVC.framework.annotation.HHAutowired;
import com.hh.springMVC.framework.annotation.HHController;
import com.hh.springMVC.framework.annotation.HHRequestMapping;
import com.hh.springMVC.framework.annotation.HHRequestParam;
import com.hh.springMVC.framework.annotation.HHResponseBody;
import com.hh.springMVC.framework.servlet.HHModelAndView;

@HHController
@HHRequestMapping("/web")
public class FirstAction {

	@HHAutowired
	private IService service;

	@HHAutowired("myName")
	private INamedService namedService;

	@HHRequestMapping("/query/.*.json")
//	@HHResponseBody
	public HHModelAndView query(HttpServletRequest request, HttpServletResponse response,
			@HHRequestParam(value = "name", required = false) String name) throws Exception {
//		out(response, "get Param name= "+ name);
		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println("ทรฮสมห");
		return new HHModelAndView("first.hh",model);
	}

	@HHRequestMapping("/query/add.json")
	public HHModelAndView add(HttpServletRequest request, HttpServletResponse response,
			@HHRequestParam(value = "name", required = false) String name) throws Exception {
		out(response, "get Param name= "+ name);
		return null;
	}

	public void out(HttpServletResponse response, String string) {
		try {
			response.getWriter().write(string);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
