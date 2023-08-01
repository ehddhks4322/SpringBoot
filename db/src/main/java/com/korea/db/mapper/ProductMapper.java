package com.korea.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.db.vo.ProductVO;

@Mapper
public interface ProductMapper {

	//상품 추가
	public void insert(ProductVO productVO);
	
	//상품 조회
	public List<ProductVO> select();
	
}
