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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.human.unicorn.Productdto.ProductDTO;
import com.human.unicorn.Productservice.ProductService;
import com.human.unicorn.dto.NoticeDTO;
import com.human.unicorn.managerPageservice.ManagerPageService;
import com.human.unicorn.memberdto.MemberDTO;

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
	public String managerProductDelete(
			@RequestParam(value = "productNo", required = false) List<Integer> productNoList) {
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

	// ������ ��������
	@RequestMapping("managerNotice")
	public String managerNotis(Model model, @ModelAttribute NoticeDTO noticedto, HttpServletRequest request) {

		// �� �Ѿ������ 0�� ����� �� �����ϱ�
		// �ʱⰪ ����
		int pageNum = 1; // ���� ������
		int countPerPage = 10; // �� �������� � ��������

		String notice_pageNum = request.getParameter("pageNum");
		if (notice_pageNum != null) {
			try {
				pageNum = Integer.parseInt(notice_pageNum);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String notice_countPerPage = request.getParameter("countPerPage");
		if (notice_countPerPage != null) {
			try {
				countPerPage = Integer.parseInt(notice_countPerPage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// db���� prodcut ��� ��ü ��ȸ
		Map map = managerPageService.getManagerNoticeList(pageNum, countPerPage);

		map.put("pageNum", pageNum);
		map.put("countPerPage", countPerPage);

		logger.info("pageNum : " + pageNum);
		logger.error("countPerPage : " + countPerPage);

		// model�� ��Ƽ�
		model.addAttribute("data", map);

		return "managerpage/managerNotice";
	}

	/*
	 * // ������ ����
	 * 
	 * @RequestMapping("managerCoupon") public String managerCoupon(Model
	 * model, @ModelAttribute ProductDTO dto, HttpServletRequest request) {
	 * List<couponDTO> couponList = productService.productList();
	 * model.addAttribute("couponList", couponList);
	 * 
	 * // �� �Ѿ������ 0�� ����� �� �����ϱ� // �ʱⰪ ���� int pageNum = 1; // ���� ������ int
	 * countPerPage = 10; // �� �������� � ��������
	 * 
	 * String tmp_pageNum = request.getParameter("pageNum"); if (tmp_pageNum !=
	 * null) { try { pageNum = Integer.parseInt(tmp_pageNum); } catch (Exception e)
	 * { e.printStackTrace(); } }
	 * 
	 * String coupon_countPerPage = request.getParameter("countPerPage"); if
	 * (coupon_countPerPage != null) { try { countPerPage =
	 * Integer.parseInt(coupon_countPerPage); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 * 
	 * // db���� prodcut ��� ��ü ��ȸ Map couponmap =
	 * managerPageService.getManagerProductList(pageNum, countPerPage);
	 * 
	 * couponmap.put("pageNum", pageNum); couponmap.put("countPerPage",
	 * countPerPage);
	 * 
	 * logger.info("pageNum : " + pageNum); logger.error("countPerPage : " +
	 * countPerPage);
	 * 
	 * // model�� ��Ƽ� model.addAttribute("coupondata", couponmap);
	 * 
	 * return "managerpage/managerCoupon"; }
	 */

	@RequestMapping("/managerMember")
	public String managerMember(Model model, @ModelAttribute MemberDTO memberdto, HttpServletRequest request) {

		// �� �Ѿ������ 0�� ����� �� �����ϱ�
		// �ʱⰪ ����
		int pageNum = 1; // ���� ������
		int countPerPage = 10; // �� �������� � ��������

		String member_pageNum = request.getParameter("pageNum");
		if (member_pageNum != null) {
			try {
				pageNum = Integer.parseInt(member_pageNum);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String member_countPerPage = request.getParameter("countPerPage");
		if (member_countPerPage != null) {
			try {
				countPerPage = Integer.parseInt(member_countPerPage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// db���� prodcut ��� ��ü ��ȸ
		Map map = managerPageService.getManagerMemberList(pageNum, countPerPage);

		map.put("pageNum", pageNum);
		map.put("countPerPage", countPerPage);

		logger.info("pageNum : " + pageNum);
		logger.error("countPerPage : " + countPerPage);

		// model�� ��Ƽ�
		model.addAttribute("data", map);

		return "managerpage/managerMember";
	}

	@RequestMapping(value = "managerMemberDelete", method = RequestMethod.POST)
	public String managerMemberDelete(
			@RequestParam(value = "selectedUsers", required = false) List<Integer> selectedUsers) {
		if (selectedUsers != null && !selectedUsers.isEmpty()) {
			managerPageService.deleteMembers(selectedUsers);
		}
		return "redirect:/managerMember";
	}

	  @RequestMapping("/managerMemberDetails")
	    public String managerDetails(@RequestParam("memberNo") int memberNo, Model model) {
	        // Ŭ���� ȸ���� ������ ��ȸ
	        MemberDTO member = managerPageService.getMemberByMemberNo(memberNo);

	        // ��ȸ�� ȸ�� ������ �𵨿� �߰�
	        model.addAttribute("member", member);

	        // managerMemberDetails.jsp�� �̵�
	        return "managerpage/managerMemberDetails";

	  }
}
