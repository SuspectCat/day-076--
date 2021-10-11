package com.servlet;

import java.io.IOException;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.dao.UserDao;

@WebServlet(urlPatterns = {
	"/load"
})
public class GetMsg extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * @Override protected void service(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { // TODO Auto-generated method
	 * stub // super.service(req, resp);
	 * 
	 * // String attribute = (String) req.getAttribute("name"); // String attribute2
	 * = (String) req.getAttribute("pwd"); String attribute =
	 * req.getParameter("name"); String attribute2 = req.getParameter("pwd");
	 * 
	 * System.out.println(attribute); System.out.println(attribute2);
	 * 
	 * boolean find = UserDao.find(attribute, attribute2);
	 * 
	 * if (find) { RequestDispatcher requestDispatcher =
	 * req.getRequestDispatcher("E:\\code\\JSP第二阶段\\day-076-周六测试\\HTML\\load.html");
	 * requestDispatcher.forward(req, resp); } else { System.out.println("false"); }
	 * }
	 */
	
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
		
		req.setCharacterEncoding("UTF-8");
		String attribute = req.getParameter("name");
		String attribute2 = req.getParameter("pwd");
		
		System.out.println(attribute);
		System.out.println(attribute2);
		
		boolean find = UserDao.find(attribute, attribute2);
		
		if (find) {
//			RequestDispatcher requestDispatcher = req.getRequestDispatcher("E:\\code\\JSP第二阶段\\day-076-周六测试\\HTML\\load.html");
//			requestDispatcher.forward(req, resp);
			resp.sendRedirect("E:\\code\\JSP第二阶段\\day-076-周六测试\\HTML\\load.html");
		} else {
			System.out.println("false");
		}
	}

}
