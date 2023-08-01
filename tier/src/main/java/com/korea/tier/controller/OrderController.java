package com.korea.tier.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.korea.tier.service.OrderService;
import com.korea.tier.vo.OrderDTO;
import com.korea.tier.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("order/*")
public class OrderController {

	public final OrderService orderService;
	
	@GetMapping("done")
	public RedirectView order(OrderVO orderVO) {
		System.out.println("주문개수 : " + orderVO.getProductCount());
		orderService.order(orderVO);
		return new RedirectView("/product/list");
	}
	
	@GetMapping("list")
	//@RequestParam(required = false) : 해당 파라미터의 null값을 허용
	public String list(Model model, @RequestParam(required = false)String sort) {
		if(sort == null) {
			sort = "resent";
		}
		model.addAttribute("sort", sort);
		List<OrderDTO> list = orderService.getList(sort);
		model.addAttribute("orders", list);
		return "/order/order-list";
	}
}