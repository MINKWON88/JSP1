package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hundred")
public class Hundred extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Hundred() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		1부터 100까지 연산
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		PrintWriter out = response.getWriter();
//		print 와 println 차이는 소스볼 때 html 문서를 줄바꿈
		out.println("<html><body>");
		out.println("<h2>" + sum + "<h2>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
