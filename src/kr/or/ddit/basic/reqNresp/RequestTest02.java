package kr.or.ddit.basic.reqNresp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestTest02.do")
public class RequestTest02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String front = request.getParameter("front");
		String cal = request.getParameter("cal");
		String back = request.getParameter("back");
	
		double f = Double.parseDouble(front);
		double b = Double.parseDouble(back);
		
		double hap=0.0;
		switch (cal) {
		case "+":
			hap = f+b;
			break;
		case "-":
			hap = f-b;
			break;
		case "/":
			hap = f/b;
			break;
		case "*":
			hap = f*b;
			break;
		case "%":
			hap = f%b;
			break;
		}
		
		out.println("<html><head><mete charset='utf-8'>"
				+ "<title>계산 결과</title></head>");
		out.println("<body>");
		out.println("<h2>계산 결과</h2>");
		
		out.print(front + cal + back + " = ");
	
		if(cal.equals("/") && f==0 || b==0) {
			out.println("계산 불능(0으로 나누기)");
		} else {
			out.println( hap);
		}
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
