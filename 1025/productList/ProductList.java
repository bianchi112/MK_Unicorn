package productList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProductList")

public class ProductList extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("hihi");
		List<ProductInfo> list = new ArrayList<>();

		ProductInfo productInfo = new ProductInfo();

		productInfo.setImageUrl(
				"https://p.turbosquid.com/ts-thumb/Gy/YjE1S2/EW8FhVnx/2/jpg/1484822727/1920x1080/fit_q87/9bfebf34e4e063bf52e3f14a86ebf5649768be28/2.jpg");
		productInfo.setImageSub1(
				"https://p.turbosquid.com/ts-thumb/Gy/YjE1S2/dEPLHjL6/1/jpg/1484822727/1920x1080/fit_q87/14ecf7da1041964abfbd4c68905823e6e073a40b/1.jpg");
		productInfo.setImageSub2(
				"https://p.turbosquid.com/ts-thumb/Gy/YjE1S2/3up7grk7/3/jpg/1484822727/1920x1080/fit_q87/3f2a5cc1b3e8c362dc71ecbcbb65c6898a838ab9/3.jpg");
		productInfo.setimagedetail("https://ifh.cc/g/P7w0b0.jpg");
		productInfo.setProductNum(1);
		productInfo.setProductName("��ũ���ݸ�&ȭ��Ʈ �� ����");
		productInfo.setProductPrice("500,000��");
		productInfo.setPopularity(3);

		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://p.turbosquid.com/ts-thumb/Vb/LGD4wh/Vx/1/jpg/1694927627/1920x1080/fit_q87/a7ab9227a758bb7a720a77a0e15589554883d30d/1.jpg");
		productInfo.setImageSub1(
				"https://p.turbosquid.com/ts-thumb/Vb/LGD4wh/lB/3/jpg/1694927628/1920x1080/fit_q87/2506c91cfe7d589c73b1d791acb08e7eece0c968/3.jpg");
		productInfo.setImageSub2(
				"https://p.turbosquid.com/ts-thumb/Vb/LGD4wh/ss/2/jpg/1694927640/1920x1080/fit_q87/9931b499a1770972b812f04971096181c6c84185/2.jpg");
		productInfo.setimagedetail("https://ifh.cc/g/Yno1M3.jpg");
		productInfo.setProductNum(2);
		productInfo.setProductName("��ǰ2");
		productInfo.setProductPrice("30,000��");
		productInfo.setPopularity(4);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://images.pexels.com/photos/3457285/pexels-photo-3457285.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		productInfo.setProductNum(3);
		productInfo.setProductName("��ǰ3");
		productInfo.setProductPrice("50,000��");
		productInfo.setPopularity(8);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://images.pexels.com/photos/3705540/pexels-photo-3705540.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		productInfo.setProductNum(4);
		productInfo.setProductName("��ǰ4");
		productInfo.setProductPrice("80,000��");
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://images.pexels.com/photos/2705/bed-bedroom-room-furniture.jpg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		productInfo.setProductNum(5);
		productInfo.setProductName("��ǰ5");
		productInfo.setProductPrice("40,000��");
		productInfo.setPopularity(9);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://images.pexels.com/photos/279746/pexels-photo-279746.jpeg?auto=compress&cs=tinysrgb&w=400");
		productInfo.setProductNum(6);
		productInfo.setProductName("��ǰ6");
		productInfo.setProductPrice("90,000��");
		productInfo.setPopularity(1);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://images.pexels.com/photos/262048/pexels-photo-262048.jpeg?auto=compress&cs=tinysrgb&w=400");
		productInfo.setProductNum(7);
		productInfo.setProductName("��ǰ7");
		productInfo.setProductPrice("60,000��");
		productInfo.setPopularity(2);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://images.pexels.com/photos/1743229/pexels-photo-1743229.jpeg?auto=compress&cs=tinysrgb&w=400");
		productInfo.setProductNum(8);
		productInfo.setProductName("��ǰ8");
		productInfo.setProductPrice("80,000��");
		productInfo.setPopularity(6);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl("https://i.insider.com/5f32f07a505f5372d46d2cc1?width=600&format=jpeg&auto=webp");
		productInfo.setProductNum(9);
		productInfo.setProductName("��ǰ9");
		productInfo.setProductPrice("70,000��");
		productInfo.setPopularity(7);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeNCn6fbpL4-bRWMB7EVhVEf3ejshCCtAKwQ&usqp=CAU");
		productInfo.setProductNum(10);
		productInfo.setProductName("��ǰ10");
		productInfo.setProductPrice("200,000��");
		productInfo.setPopularity(7);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl("https://m.media-amazon.com/images/I/91thjI3lKAL._AC_UF894,1000_QL80_.jpg");
		productInfo.setProductNum(11);
		productInfo.setProductName("��ǰ11");
		productInfo.setProductPrice("240,000��");
		productInfo.setPopularity(11);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://images.pexels.com/photos/1454806/pexels-photo-1454806.jpeg?auto=compress&cs=tinysrgb&w=400");
		productInfo.setProductNum(12);
		productInfo.setProductName("��ǰ12");
		productInfo.setProductPrice("30,000��");
		productInfo.setPopularity(18);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqOTORljGwCGUnXj4pcOvSIMd8cpivEuKSlbOiT98BdeQl1nC0DYkgqDbHMsBHhd6z3BM&usqp=CAU");
		productInfo.setProductNum(13);
		productInfo.setProductName("��ǰ13");
		productInfo.setProductPrice("180,000��");
		productInfo.setPopularity(7);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl("https://m.media-amazon.com/images/I/81TvyBlyXWL._AC_UF894,1000_QL80_.jpg");
		productInfo.setProductNum(14);
		productInfo.setProductName("��ǰ14");
		productInfo.setProductPrice("150,000��");
		productInfo.setPopularity(5);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkgalp1vEOMShAS1kn_tTiXeJqoVU_pUfNRQ&usqp=CAU");
		productInfo.setProductNum(15);
		productInfo.setProductName("��ǰ15");
		productInfo.setProductPrice("230,000��");
		productInfo.setPopularity(16);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://i0.wp.com/joinerydesignco.com/wp-content/uploads/2022/02/Loft-Bed-White-Oak.jpg?resize=839%2C1024&ssl=1");
		productInfo.setProductNum(16);
		productInfo.setProductName("��ǰ16");
		productInfo.setProductPrice("110,000��");
		productInfo.setPopularity(5);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://www.bobbyrabbit.co.uk/cdn/shop/products/bronx-metal-bed-matt-olive-green_ds-childrens-bed_vipack_bobby_rabbit-2_1024x1024.jpg?v=1614778874");
		productInfo.setProductNum(17);
		productInfo.setProductName("��ǰ17");
		productInfo.setProductPrice("160,000��");
		productInfo.setPopularity(8);
		list.add(productInfo);

		productInfo = new ProductInfo();
		productInfo.setImageUrl(
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR05sXWDHiVNTSM54YJtrgeH1Lo4p1RMegUWg&usqp=CAU");
		productInfo.setProductNum(18);
		productInfo.setProductName("��ǰ18");
		productInfo.setProductPrice("350,000��");
		productInfo.setPopularity(7);
		list.add(productInfo);

		request.setAttribute("list", list);
//      request.getRequestDispatcher("/pdtest.jsp").forward(request, response);

		request.setAttribute("productInfo", productInfo);

		// ������ ������
		HttpSession session = request.getSession();

		// list �����͸� ���ǿ� ����
		session.setAttribute("list", list);

		// ����Ʈ�� �α⵵�� ���� ������ ����
		List<ProductInfo> sortedList = new ArrayList<>(list);
		sortedList.sort((a, b) -> b.getPopularity() - a.getPopularity());

		// ����Ʈ�� ���� 10���� ����
		List<ProductInfo> top10List = sortedList.subList(0, Math.min(10, sortedList.size()));

		// request�� ���� 10�� ����Ʈ�� �߰�
		request.setAttribute("top10List", top10List);

		request.getRequestDispatcher("/ProductList.jsp").forward(request, response);
	}

}