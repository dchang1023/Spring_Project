package com.spring.Hit;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.Hit.dao.MemberIDao;


@Controller
@RequestMapping("/member")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private SqlSession sqlSession;
	//메인 페이지 & 간략한 상품 리스트
	@RequestMapping("/main")
	public String main(Model model) {

		MemberIDao dao = sqlSession.getMapper(MemberIDao.class);
		model.addAttribute("list", dao.mainDao());
		
		return "/member/main";
	}
	
	//장바구니 관리
	//주문리스트 관리
	//댓글 관리
	//리뷰 관리
	//게시판 목록보기
	@RequestMapping("/board")
	public String board(Model model) {

		MemberIDao dao = sqlSession.getMapper(MemberIDao.class);
		model.addAttribute("list", dao.boardDao());
		
		return "/member/board";
	}
	//게시판 글보기
	//게시판 글등록
	//게시판 글수정
	//게시판 글삭제
	
}
