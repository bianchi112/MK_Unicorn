package idpw;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import signup.SignUpDTO;

@WebServlet("/find_id")
public class find_id extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public find_id() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		// ������ ������
//		HttpSession session = request.getSession();

		String idname = "�̼���";
		String email = "123";

		String id = "unicorn";

		String inputIdname = request.getParameter("idname");
		String inputMail = request.getParameter("email");

		PrintWriter out = response.getWriter();

		if (inputIdname == null || inputMail == null || inputIdname.isEmpty() || inputMail.isEmpty()) {
			System.out.println("���� ���Է�");
			out.println("<script>");
			out.println("alert('������ �Է����ּ���.');");
			out.println("location.href = 'idpw.jsp';");
			out.println("</script>");

		} else if (!inputIdname.equals(idname) || !inputMail.equals(email)) {
			System.out.println("���� ����ġ");
			out.println("<script>");
			out.println("alert('�Է��Ͻ� ������ ��ġ�ϴ� ���̵� �����ϴ�.');");
			out.println("location.href = 'idpw.jsp';");
			out.println("</script>");

		} else {
			System.out.println("���� ��ġ");
			out.println("<script>alert('���̵� : " + id + "'); location.href='idpw.jsp';</script>");
		}

	}

//		SignUp signup = new SignUp();
//		List<SignUp> userList = new ArrayList<>();
//		List list = (List) session.getAttribute("signup");
//		System.out.println(list);
//		
//		String id = null;
//
//		boolean ck = false;
//
//		for (int i = 0; i < list.size(); i++) {
//
//			SignUp user = (SignUp) list.get(i);
//			String name = user.getName();
//			String email = user.getEmail();
//
//			if (name.equals(inputIdname) && email.equals(inputMail)) {
//				ck = true;
//				id = user.getId();
//			}
//		}

//		if (ck) {
//			request.setAttribute("found_id", id);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("idpw.jsp");
//			dispatcher.forward(request, response);
//		} else {
//			request.setAttribute("error", "�Է��Ͻ� ������ ��ġ�ϴ� ���̵� �����ϴ�");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("idpw.jsp");
//			dispatcher.forward(request, response);
//		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
