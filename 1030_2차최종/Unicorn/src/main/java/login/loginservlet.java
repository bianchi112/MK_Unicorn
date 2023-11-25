package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginservlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		List<loginList> list = new ArrayList<>();

		loginList loginList = new loginList();

		loginList.setName("������");
		loginList.setId("unicorn1");
		loginList.setPw("1234");
		loginList.setEmail("unicorn1@naver.com");
		loginList.setPhone("010-1234-5678");
		loginList.setAddress("õ�Ƚ� ������ ���ﵿ");
		list.add(loginList);

		loginList = new loginList();

		loginList.setName("������");
		loginList.setId("unicorn2");
		loginList.setPw("1234");
		loginList.setEmail("unicorn2@naver.com");
		loginList.setPhone("010-1234-5678");
		loginList.setAddress("õ�Ƚ� ������ ���ﵿ");
		list.add(loginList);

		loginList = new loginList();

		loginList.setName("�質��");
		loginList.setId("unicorn3");
		loginList.setPw("1234");
		loginList.setEmail("unicorn3@naver.com");
		loginList.setPhone("010-1234-5678");
		loginList.setAddress("õ�Ƚ� ������ ���ﵿ");
		list.add(loginList);

		loginList = new loginList();

		loginList.setName("�ڽſ�");
		loginList.setId("unicorn4");
		loginList.setPw("1234");
		loginList.setEmail("unicorn4@naver.com");
		loginList.setPhone("010-1234-5678");
		loginList.setAddress("õ�Ƚ� ������ ���ﵿ");
		list.add(loginList);
		
		loginList = new loginList();
		
		loginList.setName("�̼���");
		loginList.setId("unicorn5");
		loginList.setPw("1234");
		loginList.setEmail("unicorn5@naver.com");
		loginList.setPhone("010-1234-5678");
		loginList.setAddress("õ�Ƚ� ������ ���ﵿ");
		list.add(loginList);
		
		loginList = new loginList();
		
		loginList.setName("�ָ���");
		loginList.setId("unicorn6");
		loginList.setPw("1234");
		loginList.setEmail("unicorn6@naver.com");
		loginList.setPhone("010-1234-5678");
		loginList.setAddress("õ�Ƚ� ������ ���ﵿ");
		list.add(loginList);


		request.setAttribute("list", list);

		request.setAttribute("loginList", loginList);

		System.out.println("loginservlet check");
		HttpSession session = request.getSession();
		// list �����͸� ���ǿ� ����
		session.setAttribute("list", list);

		String id = "unicorn";
		String name = "������";
		String pw = "1234";
		String phoneNumber = "010-1234-5678";
		String address = "�泲 õ�Ƚ� ������ ����� 134";
		String email = "unicorn@gmail.com";
		String zipcode = "31144";
		String detailAddress = "8�� Unicorn";
//		String boughtProduct = "��ũ���ݸ�&ȭ��Ʈ �� ���� ����";
		String boughtProduct = "��ũ���ݸ�&ȭ��Ʈ";
		String review = "";

		String inputId = request.getParameter("id");
		String inputPw = request.getParameter("pw");

		if (id.equals(inputId) && pw.equals(inputPw)) {
			// ���̵�� ��й�ȣ�� ��ġ�ϴ� ���
			session.setAttribute("id", id);
			session.setAttribute("name", name);
			session.setAttribute("phoneNumber", phoneNumber);
			session.setAttribute("address", address);
			session.setAttribute("email", email);
			session.setAttribute("zipcode", zipcode);
			session.setAttribute("detailAddress", detailAddress);
			session.setAttribute("boughtProduct", boughtProduct);
			session.setAttribute("review", review);
			System.out.println("id, pw ��ġ");
			response.sendRedirect("index.jsp");
			
		} else if (inputId == null || inputPw == null || inputId.isEmpty() || inputPw.isEmpty()) {
			// ���̵� �Ǵ� ��й�ȣ�� �Է����� ���� ���
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('���̵� �Ǵ� ��й�ȣ�� �Է����ּ���.');");
			out.println("location.href = 'login.jsp';");
			out.println("</script>");
		} else {
			// ���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʴ� ���
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.');");
			out.println("location.href = 'login.jsp';");
			out.println("</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
