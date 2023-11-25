package QnA;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/QnA_removeServlet")
public class QnA_removeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		List<QnADTO> list = (List<QnADTO>) session.getAttribute("QnA_list");
		PrintWriter out = response.getWriter();
		
		if(request.getParameter("index") != null) {
			int index = Integer.parseInt(request.getParameter("index"));
			if (list != null && index >= 0 && index < list.size()) {
	            
	            list.remove(index);

	            session.setAttribute("QnA_list", list);

	            out.print("<script> alert('�����Ǿ����ϴ�'); window.location='QnA.jsp';"
	            		+ "</script>");
	            
	        } else {
	            // ��ȿ���� ���� �ε��� �Ǵ� QnAList�� ���� �� ���� ������ ����
	            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
	        }
		}
		
		
		
		
		
	}

}
