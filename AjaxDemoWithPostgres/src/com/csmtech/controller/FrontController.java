package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.csmtech.util.DbUtil;


public class FrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		//pw.println("working");
		Session session=DbUtil.getSessionFactory().openSession();
		//pw.println(session);
		
		req.setAttribute("countryList",session.createQuery("from Countries").list());
		req.setAttribute("stateList",session.createQuery("from States").list());
		req.setAttribute("cityList",session.createQuery("from Cities").list());
		
		req.getRequestDispatcher("myAddress.jsp").forward(req, resp);
	}
	
}
