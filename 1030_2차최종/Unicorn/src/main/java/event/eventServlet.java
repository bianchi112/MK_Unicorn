package event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/eventServlet")
public class eventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[ eventServlet check ]");
 HttpSession session = request.getSession();
		 
		 List<EventDTO> list =  new ArrayList<>();
		 EventDTO eventList = new EventDTO();
		 
		 eventList.setEventTilte("���侲�� ������GO!");
		 eventList.setEventDate("2023.10.23 - 2023.12.31");
		 eventList.setEventImgUrl("https://t4.ftcdn.net/jpg/04/00/15/03/240_F_400150323_k2FWi3Mk1D8tJ9xEGnl9x27WO61eLPbv.jpg");
		 eventList.setEventDetails(" <h5>���� �̺�Ʈ</h5>���� �� ���� �ۼ��ϸ� ������ ����! <br><br><br><br>"
		 		+ " *��� ���� �̹����� ������ �ٸ� �� �ֽ��ϴ�.<br>\r\n"
		 		+ "            *��� ������ ��� ������ ���� ���� �Ǵ� �������� �� �� �ֽ��ϴ�.<br>\r\n"
		 		+ "            *�ش� �̺�Ʈ ���� ���Ǵ� 0000-0000���� Ȯ���ϼ���.");
		list.add(eventList);
		 
		 eventList = new EventDTO();
		 eventList.setEventTilte("HELLO AUTUMN ���� �̺�Ʈ");
		 eventList.setEventDate("2023.10.17 - 2023.12.04");
		 eventList.setEventImgUrl("https://t3.ftcdn.net/jpg/06/34/07/84/240_F_634078401_DD0xqDmzJcgSobr8T5tIfFk5uxEMmIEQ.jpg");
		 eventList.setEventDetails(" <h5>���� �̺�Ʈ</h5>�ش�Ⱓ ħ�� �����ϸ� ������ ����! <br><br><br><br>"
				 + " *��� ���� �̹����� ������ �ٸ� �� �ֽ��ϴ�.<br>\r\n"
			 		+ "            *��� ������ ��� ������ ���� ���� �Ǵ� �������� �� �� �ֽ��ϴ�.<br>\r\n"
			 		+ "            *�ش� �̺�Ʈ ���� ���Ǵ� 0000-0000���� Ȯ���ϼ���.");
		 list.add(eventList);
		 eventList = new EventDTO();
		 eventList.setEventTilte("��ȥ�κ� �̺�Ʈ");
		 eventList.setEventDate("2023.10.17 - 2023.12.04");
		 eventList.setEventImgUrl("https://t3.ftcdn.net/jpg/06/17/34/00/240_F_617340029_VAdAxm3Jf0RuMm7igvAH7RYyhmnTArlF.jpg");
		 eventList.setEventDetails("<h5>���� ����� Ŭ��</h5> ���� ����� Ŭ������ �����ϸ� ������ ����! <br><br><br><br>"
				 + " ���� �Ⱓ�� ���� ����� �����Ϸκ��� 6���� �� �Դϴ�.<br>"
			 		+ "            *��� ���� �̹����� ������ �ٸ� �� �ֽ��ϴ�.<br>"
			 		+ "            *��� ������ ��� ������ ���� ���� �Ǵ� �������� �� �� �ֽ��ϴ�.<br>"
			 		+" *��������� ���� ���Ǵ� 0000-0000���� Ȯ���ϼ���.");
		 list.add(eventList);
		 eventList = new EventDTO();
		 eventList.setEventTilte("���� ȸ���� ���� ���� ����");
		 eventList.setEventDate("2023.10.17 - 2023.12.04");
		 eventList.setEventImgUrl("https://t4.ftcdn.net/jpg/06/36/13/99/240_F_636139988_fxwEOLwa44QWFo8gPUC6WLb3xqOhBulA.jpg");
		 eventList.setEventDetails(" <h5>���� ȸ���ǰ� ���� ����!</h5> ���� ����Ʈ 0.5% ���� & ���� <br><br><br><br>"
				 + "  *����Ʈ ��ȿ�Ⱓ�� 3���Դϴ�.<br>"
			 		+ "           *��� ���� �̹����� ������ �ٸ� �� �ֽ��ϴ�.<br>"
			 		+ "           *��� ������ ��� ������ ���� ���� �Ǵ� �������� �� �� �ֽ��ϴ�.<br>"
			 		+" *�ش� �̺�Ʈ ���� ���Ǵ� 0000-0000���� Ȯ���ϼ���.");
		 list.add(eventList);
		 
		 session.setAttribute("eventList", list);
		 response.sendRedirect("event.jsp");
		
	}

}
