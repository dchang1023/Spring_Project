package com.spring.Hit.dao;

import java.util.ArrayList;
import java.util.List;

import com.spring.Hit.dto.ProductDto;
import com.spring.Hit.dto.ReviewDto;

public interface ProductIDao {
	
	//카테고리별 상품 리스트 페이지
	public List<ProductDto> listDao(ProductDto pdt);
	//상품 상세 정보 페이지
	public ProductDto viewDao(int item_no);
	//전체 리뷰 출력 
	public List<ReviewDto> getReview(int item_no);
	//리뷰 등록
	public void addReview(ReviewDto rd);
	//리뷰 수정
	public void updateReview(ReviewDto rd);
	//리뷰 삭제
	public void deleteReview(int item_no);
	
	//장바구니에 담기
	//주문하기
	//리뷰 보기
	//리뷰 쓰기
	//리뷰 수정
	//리뷰 삭제
	//댓글 보기
	//댓글 쓰기
	//댓글 수정
	//댓글 삭제
	
}
