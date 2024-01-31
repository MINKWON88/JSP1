package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gugu")
public class Gugu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		num 이라는 매개변수로 넘어온 요청받은 데이터를 정수로 변경하여 num 에 저장
		int num = Integer.parseInt(request.getParameter("num"));
//		한글을 UTF-8형식으로 전달
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>구구단 " + num + "단</h2>");
		for (int i = 1; i <= 9; i++) {
//			out.println(num + " * " + i + " = " + num * i + "<br>");
			out.printf("%d * %d = %d<br>", num, i, num * i);
		}
		out.println("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
