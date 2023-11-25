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

import productList.ProductInfoDTO;

@WebServlet("/cart_removeServlet")
public class cart_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		// �ֹ� or ���� �� ������ 
		String button = request.getParameter("button");	
		
		// ������ ��ǰ �ε��� (�����ϱ� ����)
		String index = request.getParameter("cartProductIndex");
		System.out.println("index" + index);
		
		// ������ ��ǰ���� ��ǰ�ε��� ��ȣ �迭 ( �ֹ��ϱ� ����)
		String[] indexArr = request.getParameterValues("checkedProduct");
		
		
		System.out.println("indexArr" + indexArr);
		

		if(button.equals("�ֹ�")) {
			System.out.println("�ֹ��ϱ� ����");
			
			for(String chkIndex : indexArr ) {
				System.out.println(chkIndex);
				int num = Integer.parseInt(chkIndex)-1;
				
				List<ProductInfoDTO> productList = (List<ProductInfoDTO>) session.getAttribute("list");
				List<OrderDTO> orderList = (List<OrderDTO>) session.getAttribute("orderList");
				
				if(orderList == null) {
					orderList = new ArrayList<>();
				}
				
	
				// ������ ��ǰ�� �̹���, ��ǰ��, ���ΰ���, ��ǰ���� orderDTO�� ��������
				// �׸��� orderDTO�� orderList ���ǿ� ����
				OrderDTO order = new OrderDTO();
				order.setCheckedName(productList.get(num).getProductName());
				order.setCheckedImageUrl(productList.get(num).getImageUrl());
				order.setCheckedDiscountPrice(productList.get(num).getSalePrice());
				order.setCheckedProductPrice(Integer.parseInt(productList.get(num).getProductPrice().replace(",", "").replace("��","")));
			
				orderList.add(order);
				session.setAttribute("orderList", orderList);
	
				
			
			}
			
			response.sendRedirect("payment");

			
		} else if( button.equals("����") ) {
			if(index != null) {
				// ��ٱ��Ͽ� ��� ����Ʈ
				List<CartDTO> cartList = (List<CartDTO>) session.getAttribute("cartList");
				cartList.remove(Integer.parseInt(index));
				session.setAttribute("cartList", cartList);
				
				out.print("<script> alert('�����Ǿ����ϴ�'); window.location='shopping_basket.jsp';"
		        		+ "</script>");
			} else {
				out.print("<script> alert('���ΰ�ħ ���ּ���'); history.go(-1);"
		        		+ "</script>");
			}
		}
		
		
		
		
	}

}
