package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.csmtech.entity.Cities;
import com.csmtech.entity.States;
import com.csmtech.util.DbUtil;

public class GetStatesByCountryId extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		
		Integer cId=Integer.parseInt(req.getParameter("cId"));
		Session session=DbUtil.getSessionFactory().openSession();
		
		List<States> stateList=session.createQuery("from States where countryId="+cId).list();
		String t=" ";
		
		for(States x:stateList) {
			t+="<option value='"+x.getStateId()+"'>x.getName()"+"</option>";
			
		}
		pw.println(t);
		
	}
		
}
