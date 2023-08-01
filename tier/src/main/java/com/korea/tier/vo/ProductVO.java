package com.korea.tier.vo;

import lombok.Data;

@Data
public class ProductVO {
//	PRODUCT_ID NUMBER PRIMARY KEY,
//	PRODCUT_NAME VARCHAR2(500) NOT NULL, -제품이름
//	PRODUCT_STOCK NUMBER DEFAULT 0, -재고
//	PRODUCT_PRICE NUMBER DEFAULT 0, -가격
//	REGISTER_DATE DATE DEFAULT SYSDATE, -등록날짜
//	UPDATE_DATE DATE DEFAULT SYSDATE -수정날짜
	
	//alt + shift 마우스좌클릭
	private int productId;
	private String productName;
	private int productStock;
	private int productPrice;
	private String registerDate;
	private String updateDate;
}
