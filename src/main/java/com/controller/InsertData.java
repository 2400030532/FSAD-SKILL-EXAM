package com.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.model.EmplpoyeeManager;
@WebServlet("/InsertData")
public class InsertData extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
         
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int eid=Integer.parseInt(request.getParameter("t1"));
		String ename=request.getParameter("t2");
		double esal=Double.parseDouble(request.getParameter("t3"));
		Employee e1=new Employee();
		e1.setEid(eid);
		e1.setEname(ename);
		e1.setEsal(esal);
		try
		{
			EmplpoyeeManager em=new EmplpoyeeManager();
			String ack=em.insertData(e1);
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.print(ack);
			
		}
		catch (Exception e) 
		{
			
		}
			
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
}
