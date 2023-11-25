package mypage;


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


@WebServlet("/couponServlet")
public class couponServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public couponServlet() {
        super();
    } 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		
		// ����
		HttpSession session = request.getSession();
		
		// ���� �� �޾ƿ�
		String coupon_num = request.getParameter("coupon_num");
		
		// ���Ƿ� ����� ������ȣ��
		String[] coupon_nums = new String[]{"10041004","82828282","12341234"};
		
		// ��ȿ�� ������ȣ ������ list
		 List<String> coupon_list = new ArrayList<String>();
		
		// ���ǿ��� ��������Ʈ �Ӽ��� ���� �� temp�� ����
		List temp = (List)session.getAttribute("temp");
		
		// temp == null�� ��� ���ο� list ����
		if( temp == null ) {
			temp = new ArrayList<String>();
		}
		
		boolean validcoupon = false;
		
		for(int i=0; i<coupon_nums.length; i++) {
			if(coupon_nums[i].equals(coupon_num)) {
				
				validcoupon = true;
				
				System.out.println("true, coupon_num : " + coupon_num);
				out.println("<script>");
				out.println("alert('������ ��ϵǾ����ϴ�.')");				
				out.println("location.href='mypage_coupon.jsp';");
				out.println("</script>");
				
				temp.add(coupon_num);
				
				session.setAttribute("temp", temp);
				
				break;

				} 
			}
			
		if(validcoupon == false	) {
			System.out.println("false");
			out.println("<script>");
			out.println("alert('��ȿ���� ���� ��ȣ�Դϴ�.');");
//			out.println("history.go(-1)");
			out.println("location.href='mypage_coupon.jsp';");
			out.println("</script>");

		}
		
		
//		int num1 = 10041004;
//		int num2 = 82828282;
//		int num3 = 12341234;
//		
//		String coupon_num1 = String.valueOf(num1);
//		String coupon_num2 = String.valueOf(num2);
		// ������ȣ ����Ʈ
		//List<String> coupon_list = new ArrayList<String>();
		
		/*	
		if( coupon_num1.equals(request.getParameter("coupon_num")) || coupon_num2.equals(request.getParameter("coupon_num")) ) {
			System.out.println("true");
			out.println("<script>");
			out.println("alert('������ ��ϵǾ����ϴ�.');");
//			out.println("location.href='mypage_coupon.jsp';");	// ������ ���ΰ�ħ
			out.println("history.go(-1)");
			out.println("</script>");
			
			// ����Ʈ�� �߰�
			coupon_list.add(coupon_num);
			
			int size = coupon_list.size();
			System.out.println("size : " + size);
			
			// ���ǿ� ����Ʈ �� �߰�
			session.setAttribute("coupon_list", coupon_list);
			
			
//			request.setAttribute("coupon_num", coupon_num); ������ ���ΰ�ħ�Ǹ� �����������
			
		} else {
			System.out.println("false");
			out.println("<script>");
			out.println("alert('��ȿ���� ���� ��ȣ�Դϴ�.');");
//			out.println("history.go(-1)");
			out.println("location.href='mypage_coupon.jsp';");
			out.println("</script>");
			
		}
		*/
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
