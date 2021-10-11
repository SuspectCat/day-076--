/*
 * @Descripttion: 
 * @version: 
 * @@Company: QianFengJiaoYu JAVAEE-2103
 * @Author: SuspectCat
 * @Date: 2021-10-10 16:13:46
 * @LastEditors: SuspectCat
 * @LastEditTime: 2021-10-11 09:41:03
 * @name: SuspectCat
 * @test: test font
 * @msg: This file was be created by SuspectCat.
 * @param: 
 * @return: 
 */
package com.config;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigDemo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		ServletConfig servletConfig = getServletConfig();
		Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
		
		while (initParameterNames.hasMoreElements()) {
			String string = (String) initParameterNames.nextElement();
			System.out.println(servletConfig.getInitParameter(string));
		}
	}
	
}
