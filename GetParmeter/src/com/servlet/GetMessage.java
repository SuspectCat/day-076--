/*
 * @Descripttion: 
 * @version: 
 * @@Company: QianFengJiaoYu JAVAEE-2103
 * @Author: SuspectCat
 * @Date: 2021-10-09 14:44:39
 * @LastEditors: SuspectCat
 * @LastEditTime: 2021-10-11 09:33:24
 * @name: SuspectCat
 * @test: test font
 * @msg: This file was be created by SuspectCat.
 * @param: 
 * @return: 
 */
package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
	"/upload"
})
public class GetMessage extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		doPost(req, resp);
		
		// ��ȡ������Ϣ
		req.setCharacterEncoding("UTF-8");	// ���post��������
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("userpwd"));
		
		// ��ȡGet�������������ַ���
		System.out.println(req.getQueryString());
		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL().toString());
	}

}

/**
 * InnerGetMessage 
 */
class InnerGetMessage {

	
}