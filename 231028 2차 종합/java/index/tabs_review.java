package index;

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

/**
 * Servlet implementation class tabs_review
 */
@WebServlet("/tabs_review")
public class tabs_review extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public tabs_review() {
        super();
    }


    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("tabs_review check");
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		
		String num = req.getParameter("productNum");
		String productName = req.getParameter("productName");
		String imageUrl = req.getParameter("imageUrl");
		String imageSub1 = req.getParameter("imageSub1");
		String imageSub2 = req.getParameter("imageSub2");
		
		
		
		
		
		List<tabs_reviewInfoDTO> list = (List<tabs_reviewInfoDTO>) session.getAttribute("reviewList");
		if( list == null || list.isEmpty()) {
			list = new ArrayList<>();
		}
		
		tabs_reviewInfoDTO tri = new tabs_reviewInfoDTO();
		tri.setId("unicorn1");
		tri.setScore("�ڡڡڡ�");
		tri.setScoreValue("4");
		tri.setProductName(productName);
		tri.setProductSize("SS");
		tri.setProductColor("white");
		tri.setReviewcontent("�߾��� �־��. ����� �����");
		tri.setReviewphoto(imageUrl);
		list.add(tri);
		
		tri = new tabs_reviewInfoDTO();
		tri.setId("unicorn2");
		tri.setScore("�ڡڡڡڡ�");
		tri.setScoreValue("5");
		tri.setProductName(productName);
		tri.setProductSize("SS");
		tri.setProductColor("white");
		tri.setReviewcontent("����� �� ���� �ɷȳ׿� ���ް� ���־ �׷���");
		tri.setReviewphoto(imageSub1);
		list.add(tri);

		tri = new tabs_reviewInfoDTO();
		tri.setId("unicorn3");
		tri.setScore("�ڡڡڡڡ�");
		tri.setScoreValue("5");
		tri.setProductName(productName);
		tri.setProductSize("SS");
		tri.setProductColor("black");
		tri.setReviewcontent("������ ������ ���� ");
		tri.setReviewphoto(imageSub2);
		list.add(tri);
		
		
		
		session.setAttribute("reviewList", list);
	}

		
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
