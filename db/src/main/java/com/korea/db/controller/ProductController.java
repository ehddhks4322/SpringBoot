package com.korea.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.korea.db.mapper.ProductMapper;
import com.korea.db.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProductController {

	@Autowired
	private final ProductMapper productMapper;
	
	@GetMapping("register")
	public String register(Model model) {
		model.addAttribute("productVO", new ProductVO());
		return "product-register";
	}
	
	@PostMapping("register")
	public RedirectView register(ProductVO productVO) {
		productMapper.insert(productVO);
		return new RedirectView("list");
	}
	
	@GetMapping("list")
	public String list(Model model) {
		List<ProductVO> list = productMapper.select();
		model.addAttribute("list",list);
		
		return "product-list";
	}
}
