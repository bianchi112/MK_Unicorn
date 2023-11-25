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
		List<ProductInfoDTO> list = new ArrayList<>();

		ProductInfoDTO ProductInfoDTO = new ProductInfoDTO();

		ProductInfoDTO.setImageUrl(
				"https://p.turbosquid.com/ts-thumb/Gy/YjE1S2/EW8FhVnx/2/jpg/1484822727/1920x1080/fit_q87/9bfebf34e4e063bf52e3f14a86ebf5649768be28/2.jpg");
		ProductInfoDTO.setImageSub1(
				"https://p.turbosquid.com/ts-thumb/Gy/YjE1S2/dEPLHjL6/1/jpg/1484822727/1920x1080/fit_q87/14ecf7da1041964abfbd4c68905823e6e073a40b/1.jpg");
		ProductInfoDTO.setImageSub2(
				"https://p.turbosquid.com/ts-thumb/Gy/YjE1S2/3up7grk7/3/jpg/1484822727/1920x1080/fit_q87/3f2a5cc1b3e8c362dc71ecbcbb65c6898a838ab9/3.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/P7w0b0.jpg");
		ProductInfoDTO.setProductNum(1);
		ProductInfoDTO.setProductName("��ũ���ݸ�&ȭ��Ʈ �� ����");
		ProductInfoDTO.setProductPrice("500,000��");
		ProductInfoDTO.setproductbrand("��������");
		ProductInfoDTO.setproductcompany("�������۴�");
		ProductInfoDTO.setproductnumber("bed0001");
		ProductInfoDTO.setproductmadein("õ��");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2023-05-02");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl(
				"https://p.turbosquid.com/ts-thumb/Vb/LGD4wh/Vx/1/jpg/1694927627/1920x1080/fit_q87/a7ab9227a758bb7a720a77a0e15589554883d30d/1.jpg");
		ProductInfoDTO.setImageSub1(
				"https://p.turbosquid.com/ts-thumb/Vb/LGD4wh/lB/3/jpg/1694927628/1920x1080/fit_q87/2506c91cfe7d589c73b1d791acb08e7eece0c968/3.jpg");
		ProductInfoDTO.setImageSub2(
				"https://p.turbosquid.com/ts-thumb/Vb/LGD4wh/ss/2/jpg/1694927640/1920x1080/fit_q87/9931b499a1770972b812f04971096181c6c84185/2.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/Yno1M3.jpg");
		ProductInfoDTO.setProductNum(2);
		ProductInfoDTO.setProductName("�����̾� ���� ����");
		ProductInfoDTO.setProductPrice("900,000��");
		ProductInfoDTO.setPopularity(4);
		ProductInfoDTO.setproductbrand("��������");
		ProductInfoDTO.setproductcompany("��������");
		ProductInfoDTO.setproductnumber("bed0002");
		ProductInfoDTO.setproductmadein("õ�� ������");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2023-04-05");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/nGtnnh.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/ASOqtm.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/a3TNav.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/PqR0M0.jpg");
		ProductInfoDTO.setProductNum(3);
		ProductInfoDTO.setProductName("�� ���� ����");
		ProductInfoDTO.setProductPrice("56,0000��");
		ProductInfoDTO.setPopularity(8);
		ProductInfoDTO.setproductbrand("�ſ��ó�");
		ProductInfoDTO.setproductcompany("���׿�");
		ProductInfoDTO.setproductnumber("bed0003");
		ProductInfoDTO.setproductmadein("������");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2022-03-05");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/KmYAbR.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/wAN449.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/qrQa4r.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/84gTqs.jpg");
		ProductInfoDTO.setProductNum(4);
		ProductInfoDTO.setProductName("������ �� �к긯 ����");
		ProductInfoDTO.setProductPrice("800,000��");
		ProductInfoDTO.setproductbrand("����������");
		ProductInfoDTO.setproductcompany("���������������󸶳�������");
		ProductInfoDTO.setproductnumber("bed0004");
		ProductInfoDTO.setproductmadein("Ķ�����Ͼ�");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2021-05-04");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/ZQlG1G.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/Y8rj34.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/pfga2m.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/YVlHJm.jpg");
		ProductInfoDTO.setProductNum(5);
		ProductInfoDTO.setProductName("��� �÷η� ����");
		ProductInfoDTO.setProductPrice("400,000��");
		ProductInfoDTO.setPopularity(9);
		ProductInfoDTO.setproductbrand("���̾�");
		ProductInfoDTO.setproductcompany("���̾����۴�");
		ProductInfoDTO.setproductnumber("bed0005");
		ProductInfoDTO.setproductmadein("�Ͽ���");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2021-01-02");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/tWxjfM.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/XZ24zA.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/oG7d7T.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/FP8Av7.jpg");
		ProductInfoDTO.setProductNum(6);
		ProductInfoDTO.setProductName("���ĵ� ���̺� �����̵� ����");
		ProductInfoDTO.setProductPrice("900,000��");
		ProductInfoDTO.setPopularity(1);
		ProductInfoDTO.setproductbrand("��������");
		ProductInfoDTO.setproductcompany("���ǰ��װ���");
		ProductInfoDTO.setproductnumber("bed0006");
		ProductInfoDTO.setproductmadein("�ƻ�");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2022-03-04");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/NWfyfS.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/0s02r0.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/tcpB3t.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/qAOqxQ.jpg");
		ProductInfoDTO.setProductNum(7);
		ProductInfoDTO.setProductName("��ũ ��� ���� ����");
		ProductInfoDTO.setProductPrice("600,000��");
		ProductInfoDTO.setPopularity(2);
		ProductInfoDTO.setproductbrand("������");
		ProductInfoDTO.setproductcompany("�������»����");
		ProductInfoDTO.setproductnumber("bed0007");
		ProductInfoDTO.setproductmadein("���");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2021-04-05");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/pCTCs1.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/PWvD82.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/tarMQ3.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/L69KWf.jpg");
		ProductInfoDTO.setProductNum(8);
		ProductInfoDTO.setProductName("�� ���� ����&����");
		ProductInfoDTO.setProductPrice("800,000��");
		ProductInfoDTO.setPopularity(6);
		ProductInfoDTO.setproductbrand("�����İ�");
		ProductInfoDTO.setproductcompany("��������");
		ProductInfoDTO.setproductnumber("bed0008");
		ProductInfoDTO.setproductmadein("��Ÿ��Ͼ�");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2022-05-05");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/NCJKtq.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/ZmpqJm.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/XsBCSG.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/WC8DXd.jpg");
		ProductInfoDTO.setProductNum(9);
		ProductInfoDTO.setProductName("ĥ�己 �����׾� ����");
		ProductInfoDTO.setProductPrice("700,000��");
		ProductInfoDTO.setPopularity(7);
		ProductInfoDTO.setproductbrand("����");
		ProductInfoDTO.setproductcompany("�������۴�");
		ProductInfoDTO.setproductnumber("bed0009");
		ProductInfoDTO.setproductmadein("õ��");
		ProductInfoDTO.setproductuserage("7~14��");
		ProductInfoDTO.setproductmadeday("1998-03-03");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/9K03L4.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/NPZzmo.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/fNtfx4.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/cQCvtO.jpg");
		ProductInfoDTO.setProductNum(10);
		ProductInfoDTO.setProductName("��� ���� ����");
		ProductInfoDTO.setProductPrice("900,000��");
		ProductInfoDTO.setPopularity(7);
		ProductInfoDTO.setproductbrand("���۷�");
		ProductInfoDTO.setproductcompany("������۴�");
		ProductInfoDTO.setproductnumber("bed0010");
		ProductInfoDTO.setproductmadein("�߱�");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2023-08-09");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/GlG7Ks.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/F3dqvn.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/rkCyDB.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/XgcHRj.jpg");
		ProductInfoDTO.setProductNum(11);
		ProductInfoDTO.setProductName("�׷��� & ����� ����");
		ProductInfoDTO.setProductPrice("840,000��");
		ProductInfoDTO.setPopularity(11);
		ProductInfoDTO.setproductbrand("���̷���");
		ProductInfoDTO.setproductcompany("�׷������۴�");
		ProductInfoDTO.setproductnumber("bed0011");
		ProductInfoDTO.setproductmadein("�Ϻ�");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2023-08-01");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/oPoZMj.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/OLv6M8.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/SBbpj6.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/2cFpSS.jpg");
		ProductInfoDTO.setProductNum(12);
		ProductInfoDTO.setProductName("��� ������ �ƴ� ����");
		ProductInfoDTO.setProductPrice("300,000��");
		ProductInfoDTO.setPopularity(18);
		ProductInfoDTO.setproductbrand("����");
		ProductInfoDTO.setproductcompany("�����۴�");
		ProductInfoDTO.setproductnumber("bed0012");
		ProductInfoDTO.setproductmadein("�س�");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2021-11-30");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/68v2S2.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/6tD0br.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/kkkfcA.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/QtT2bB.jpg");
		ProductInfoDTO.setProductNum(13);
		ProductInfoDTO.setProductName("���� ĥ�己 �����׾� ����");
		ProductInfoDTO.setProductPrice("880,000��");
		ProductInfoDTO.setPopularity(7);
		ProductInfoDTO.setproductbrand("��ĥ�己");
		ProductInfoDTO.setproductcompany("��ĥ�己���۴�");
		ProductInfoDTO.setproductnumber("bed-0013");
		ProductInfoDTO.setproductmadein("����");
		ProductInfoDTO.setproductuserage("7~11��");
		ProductInfoDTO.setproductmadeday("2020-12-24");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/OMZfW4.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/Dp2P9s.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/zklrWw.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/fnYnyj.jpg");
		ProductInfoDTO.setProductNum(14);
		ProductInfoDTO.setProductName("���� �׷��� ����");
		ProductInfoDTO.setProductPrice("450,000��");
		ProductInfoDTO.setPopularity(5);
		ProductInfoDTO.setproductbrand("���ø�");
		ProductInfoDTO.setproductcompany("���ø����۴�");
		ProductInfoDTO.setproductnumber("bed0014");
		ProductInfoDTO.setproductmadein("�λ�");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2021-08-04");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/SZthzr.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/B5Rm7x.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/5y8cTj.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/zoj2ox.jpg");
		ProductInfoDTO.setProductNum(15);
		ProductInfoDTO.setProductName("���� ���� ����");
		ProductInfoDTO.setProductPrice("430,000��");
		ProductInfoDTO.setPopularity(16);
		ProductInfoDTO.setproductbrand("���Ĵ�ħ��");
		ProductInfoDTO.setproductcompany("���Ĵ�ħ�����۴�");
		ProductInfoDTO.setproductnumber("bed0015");
		ProductInfoDTO.setproductmadein("�λ�");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2022-06-04");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/rZFpqc.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/DTWNcs.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/MsVQqZ.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/TAMP8B.jpg");
		ProductInfoDTO.setProductNum(16);
		ProductInfoDTO.setProductName("ȭ��Ʈ & �׷����� ���� ����");
		ProductInfoDTO.setProductPrice("400,000��");
		ProductInfoDTO.setPopularity(5);
		ProductInfoDTO.setproductbrand("ȭ��Ʈ��");
		ProductInfoDTO.setproductcompany("ȭ��Ʈ���۴�");
		ProductInfoDTO.setproductnumber("bed0016");
		ProductInfoDTO.setproductmadein("����");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2020-11-04");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/2VF1AM.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/h19Mk1.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/wJ7jPz.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/Q0WFcF.jpg");
		ProductInfoDTO.setProductNum(17);
		ProductInfoDTO.setProductName("�ӽ�Ÿ�� �к긯 ����");
		ProductInfoDTO.setProductPrice("660,000��");
		ProductInfoDTO.setPopularity(8);
		ProductInfoDTO.setproductbrand("�ӽ��и�");
		ProductInfoDTO.setproductcompany("�ӽ��и����۴�");
		ProductInfoDTO.setproductnumber("bed0017");
		ProductInfoDTO.setproductmadein("����");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2019-04-15");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		ProductInfoDTO = new ProductInfoDTO();
		ProductInfoDTO.setImageUrl("https://ifh.cc/g/ANygZp.jpg");
		ProductInfoDTO.setImageSub1("https://ifh.cc/g/p10AVw.jpg");
		ProductInfoDTO.setImageSub2("https://ifh.cc/g/HJhAYK.jpg");
		ProductInfoDTO.setimagedetail("https://ifh.cc/g/KPz1qr.jpg");
		ProductInfoDTO.setProductNum(18);
		ProductInfoDTO.setProductName("�����̾� �к긯 ����");
		ProductInfoDTO.setProductPrice("750,000��");
		ProductInfoDTO.setPopularity(7);
		ProductInfoDTO.setproductbrand("����");
		ProductInfoDTO.setproductcompany("�������۴�");
		ProductInfoDTO.setproductnumber("bed0018");
		ProductInfoDTO.setproductmadein("õ��");
		ProductInfoDTO.setproductuserage("������");
		ProductInfoDTO.setproductmadeday("2022-04-15");
		ProductInfoDTO.setSalePrice(50000);
		list.add(ProductInfoDTO);

		request.setAttribute("list", list);
//      request.getRequestDispatcher("/pdtest.jsp").forward(request, response);

		request.setAttribute("ProductInfoDTO", ProductInfoDTO);

		// ������ ������
		HttpSession session = request.getSession();

		// list �����͸� ���ǿ� ����
		session.setAttribute("list", list);

		// ����Ʈ�� �α⵵�� ���� ������ ����
		List<ProductInfoDTO> sortedList = new ArrayList<>(list);
		sortedList.sort((a, b) -> b.getPopularity() - a.getPopularity());

		// ����Ʈ�� ���� 10���� ����
		List<ProductInfoDTO> top10List = sortedList.subList(0, Math.min(10, sortedList.size()));

		// request�� ���� 10�� ����Ʈ�� �߰�
		request.setAttribute("top10List", top10List);

		request.getRequestDispatcher("/ProductList.jsp").forward(request, response);
	}

}