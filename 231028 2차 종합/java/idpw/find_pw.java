package idpw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/find_pw")
public class find_pw extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public find_pw() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String pwname = "�̼���";
		String id = "unicorn";

		String inputPwname = request.getParameter("pwname");
		String inputId = request.getParameter("id");

		PrintWriter out = response.getWriter();
		
		if (inputPwname == null || inputId == null || inputPwname.isEmpty() || inputId.isEmpty()) {
			System.out.println("���� ���Է�");
			out.println("<script>");
			out.println("alert('������ �Է����ּ���.');");
			out.println("location.href = 'idpw.jsp';");
			out.println("</script>");
			
		} else if (!inputPwname.equals(pwname) || !inputId.equals(id)) {
			System.out.println("���� ����ġ");
			out.println("<script>");
			out.println("alert('�̸� �Ǵ� ���̵� Ʋ���ϴ�.');");
			out.println("location.href = 'idpw.jsp';");
			out.println("</script>");

		}
		
		else {
			System.out.println("���� ��ġ");
			out.println("<script>alert('��й�ȣ �缳�� ��ũ�� �̸��Ϸ� �����߽��ϴ�.'); location.href='idpw.jsp';</script>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
