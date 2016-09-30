package com.spring.Hit.dao;

import java.util.ArrayList;

import com.spring.Hit.dto.BoardDto;
import com.spring.Hit.dto.MemberDto;
import com.spring.Hit.dto.ProductDto;

public interface MemberIDao {
	//메인페이지 & 간략한 상품 리스트
	public ArrayList<ProductDto> mainDao();
	//회원 가입
	public void writeDao(String id, String password);
	//회원 정보 보기
	public MemberDto viewDao(String id);
	//회원 정보 삭제
	public void deleteDao(String id);
	
	//장바구니 관리
	//주문리스트 관리
	//댓글 관리
	//리뷰 관리
	//게시판 목록보기
	public ArrayList<BoardDto> boardDao();
	
	//게시판 글보기
	//게시판 글등록
	//게시판 글수정
	//게시판 글삭제
	
}
