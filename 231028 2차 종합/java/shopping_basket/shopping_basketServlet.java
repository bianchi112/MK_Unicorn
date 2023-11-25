package shopping_basket;

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

@WebServlet("/shopping_basketServlet")
public class shopping_basketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		String num = request.getParameter("productNum");
		
		String productSize = request.getParameter("productSize");
		String amount = request.getParameter("amount");
	
		
		List<CartDTO> list = (List<CartDTO>) session.getAttribute("cartList");
		if (list == null || list.isEmpty()) {
			list = new ArrayList<>();
		}
		
		CartDTO cart = new CartDTO();
		cart.setNum(Integer.parseInt(num));
		cart.setSize(productSize);
		cart.setAmount(Integer.parseInt(amount));
		System.out.println(cart.getAmount());
		
		list.add(cart);

		session.setAttribute("cartList", list);
		
		
		 String typenumber = request.getParameter("type");
	      System.out.println(typenumber);

		 if("1".equals(typenumber)) {
	         out.print("<script> if(confirm('��ǰ�� ��ϵǾ����ϴ�. ��ٱ��Ϸ� �̵��Ͻðڽ��ϱ�?')){"
		+ "window.location='shopping_basket.jsp';}"
		+ "else { history.go(-1);};</script>");
	   }else if("2".equals(typenumber)){
	         out.print("<script>alert('���ø���Ʈ�� �߰��Ǿ����ϴ�.'); history.go(-1);</script>");
	         
	      }else if("3".equals(typenumber)){
	         
	         response.sendRedirect("payment");
	   } else {
		   System.out.println("����");
	   }


	} 

}
