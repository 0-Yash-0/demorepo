package project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		String fname=req.getParameter("fname");
		String mname=req.getParameter("mname");
		String tmarks=req.getParameter("quantity");
		out.println("name "+ name);
		out.println(pass);
		out.println(fname);
		out.println(mname);
		out.println(tmarks);
		System.out.println("Name: "+name);
		System.out.println("Password: "+pass);
		System.out.println("Father's name: "+fname);
		System.out.println("Mother's name: "+mname);
		System.out.println("Total Marks: "+tmarks);
	}
	
} 
