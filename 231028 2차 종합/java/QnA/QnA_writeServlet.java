package QnA;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;

@WebServlet("/QnA_writeServlet")
public class QnA_writeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

        String QnA_title = request.getParameter("QnA_title");
        String QnA_details = request.getParameter("QnA_details");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();

        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        String date = year + "-" + month + "-" + day;

        if (QnA_title == "") {
            out.print("<script>alert('������ �Է����ּ���'); history.go(-1);</script>");
        } else if (QnA_details == "") {
            out.print("<script>alert('�����Ͻ� ������ �Է����ּ���'); history.go(-1);</script>");
        } else {
            // ���ǿ��� ������ �� ����� ������
            List<QnADTO> list = (List<QnADTO>) session.getAttribute("QnA_list");
            
            if (list == null) {
                list = new ArrayList<>();
            }

            QnADTO qnaList = new QnADTO();
            qnaList.setInquiryTitle(QnA_title);
            qnaList.setInquiryWriter((String) session.getAttribute("id"));
            qnaList.setInquiryDate(date);
            qnaList.setInquiryDetails(QnA_details);
            list.add(qnaList);

            session.setAttribute("QnA_list", list);

            out.print("<script> alert('��ϵǾ����ϴ�'); location.href='QnA.jsp';</script>");
        }
	
	}

	
	
}
