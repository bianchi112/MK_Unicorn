package com.human.unicorn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.human.unicorn.dto.CouponDTO;
import com.human.unicorn.service.CouponService;

@Controller
public class CouponController {
	
	@Autowired
	CouponService couponService;

	@RequestMapping("/coupon")
	public String coupon(Model model) {
		
		// �޾ƿ��� ������ �ٲ� �� ���� 
		int userno = 3;

		List coupon = couponService.selectCoupon(userno);

		List list = couponService.validCoupon();
		
		model.addAttribute("coupon", coupon);
		model.addAttribute("userno", userno);
		model.addAttribute("list", list);
		
		return "coupon";
	}
	
	@RequestMapping(value="updateCoupon", method=RequestMethod.POST)
	public String updateCoupon(@ModelAttribute CouponDTO dto) {
		
		int result = couponService.updateCoupon(dto);
		System.out.println("coupon result : " + result);
		
		return "redirect:/coupon";
	}

	@RequestMapping(value="insertCoupon", method=RequestMethod.POST)
	public String insertCoupon(@ModelAttribute CouponDTO dto) {
		
		int userno = 3;
		dto.setUserno(userno);
		
		int result = couponService.insertCoupon(dto);
		System.out.println("insert coupon result : " + result);			

		return "redirect:/coupon";
		
		
	}
	
	@RequestMapping(value="countCoupon", method=RequestMethod.POST)
	@ResponseBody
	public int countCoupon(@ModelAttribute CouponDTO dto) {
		
		System.out.println("dto : "+ dto);
		int result = couponService.countCoupon(dto);
		System.out.println("countCoupon result : " + result);
		
		return result;
	}
}
