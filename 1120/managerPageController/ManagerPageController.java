package com.human.unicorn.managerPageController;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.human.unicorn.Productdto.ProductDTO;
import com.human.unicorn.Productservice.ProductService;
import com.human.unicorn.managerPageservice.ManagerPageService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ManagerPageController {

	private static final Logger logger = LoggerFactory.getLogger(ManagerPageController.class);

	@Autowired
	ProductService productService;
	@Autowired
	ManagerPageService managerPageService;
	
	@RequestMapping("/managerMain")
	public String managerMain() {
		System.out.println("������ ����");
		return "managerpage/managerMain";
	}

	@RequestMapping("/managerProduct")
	public String managerProduct(Model model, @ModelAttribute ProductDTO dto, HttpServletRequest request) {

		List<ProductDTO> productList = productService.productList();
		model.addAttribute("productList", productList);

		// �� �Ѿ������ 0�� ����� �� �����ϱ�
		// �ʱⰪ ����
		int pageNum = 1; // ���� ������
		int countPerPage = 10; // �� �������� � ��������

		String tmp_pageNum = request.getParameter("pageNum");
		if (tmp_pageNum != null) {
			try {
				pageNum = Integer.parseInt(tmp_pageNum);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String tmp_countPerPage = request.getParameter("countPerPage");
		if (tmp_countPerPage != null) {
			try {
				countPerPage = Integer.parseInt(tmp_countPerPage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// db���� prodcut ��� ��ü ��ȸ
		Map map = managerPageService.getManagerProductList(pageNum, countPerPage);

		map.put("pageNum", pageNum);
		map.put("countPerPage", countPerPage);

		logger.info("pageNum : " + pageNum);
		logger.error("countPerPage : " + countPerPage);

		// model�� ��Ƽ�
		model.addAttribute("data", map);
		return "managerpage/managerProduct";
	}

	@RequestMapping("/managerProductUpdate")
	public String managerProductUpdate(@RequestParam("productNo") int productNo, Model model) {

		// Ư�� productNo�� �ش��ϴ� ��ǰ ��ȸ
		ProductDTO product = managerPageService.getProductByProductNo(productNo);
		System.out.println(product);
		// ��ȸ�� ��ǰ �����͸� �𵨿� �߰�
		model.addAttribute("product", product);


		return "managerpage/managerProductUpdate";
	}

	@RequestMapping("/managerProductDoUpdate")
	public String managerProductDoUpdate(@ModelAttribute ProductDTO updatedProduct, Model model) {
		System.out.println("������Ʈ ����");
		// ManagerPageService�� ���� ������Ʈ �޼��� ȣ��
		managerPageService.updateProduct(updatedProduct);
		
		// Ư�� productNo�� �ش��ϴ� ��ǰ ��ȸ
		ProductDTO product = managerPageService.getProductByProductNo(updatedProduct.getProductNo());

		// ��ȸ�� ��ǰ �����͸� �𵨿� �߰�
		model.addAttribute("product", product);


		return "redirect:/managerProduct";
	}
	
	@RequestMapping("/managerProductDelete")
    public String managerProductDelete(@RequestParam(value = "productNo", required = false) List<Integer> productNoList) {
        if (productNoList != null && !productNoList.isEmpty()) {
            managerPageService.deleteProducts(productNoList);
        }
        return "redirect:/managerProduct";
    }
	
	@RequestMapping("/managerProductInsert")
	public String managerProductInsert() {
		
		return "managerpage/managerProductInsert";
	}
	
	@RequestMapping("/managerProductDoInsert")
	public String managerProductDoInsert(HttpServletRequest request, @ModelAttribute ProductDTO product) {
	    // ����� �Է� ���� �޾ƿ�
	    String productName = request.getParameter("productName");
	    String productEx = request.getParameter("productEx");
	    String mainImg1 = request.getParameter("mainImg1");
	    String mainImg2 = request.getParameter("mainImg2");
	    String mainImg3 = request.getParameter("mainImg3");
	    String fabric = request.getParameter("fabric");
	    String company = request.getParameter("company");
	    int popularity = Integer.parseInt(request.getParameter("popularity"));
	    int productPrice = Integer.parseInt(request.getParameter("productPrice"));

	    // ProductDTO ��ü�� ����
	    
	    product.setProductName(productName);
	    product.setProductEx(productEx);
	    product.setMainImg1(mainImg1);
	    product.setMainImg2(mainImg2);
	    product.setMainImg3(mainImg3);
	    product.setFabric(fabric);
	    product.setCompany(company);
	    product.setPopularity(popularity);
	    product.setProductPrice(productPrice);

	    // ManagerPageService�� ���� insertProduct �޼��� ȣ��
	    managerPageService.insertProduct(product);

	    // �����̷�Ʈ
	    return "redirect:/managerProduct";
	}

	

}
