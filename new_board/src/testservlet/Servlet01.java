package testservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
		
		req.setAttribute("num1", num1);
		req.setAttribute("num2", num2);
		req.setAttribute("add", add);
		
		RequestDispatcher dispatcher =
				req.getRequestDispatcher("./Servlet01.jsp");
		dispatcher.forward(req, resp);
	}
	
	
}

