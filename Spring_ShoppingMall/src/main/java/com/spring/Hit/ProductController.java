package com.spring.Hit;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.Hit.dao.ProductIDao;
import com.spring.Hit.dto.ProductDto;
import com.spring.Hit.dto.ReviewDto;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@Inject
	private ProductIDao dao;
	
	//카테고리별 상품 리스트 페이지
	@RequestMapping(value = "/list", method= RequestMethod.GET)
	public void list(@ModelAttribute("pdt") ProductDto pdt, Model model) {
		logger.info(pdt.toString());
		
		model.addAttribute("list", dao.listDao(pdt));
		
	}
	//상품 상세 정보 페이지
	@RequestMapping("/detail")
	public String view(@RequestParam("item_no") int item_no, Model model) {
		
		model.addAttribute("list", dao.viewDao(item_no));
		
//		List<ReviewDto> re = dao.getReview(item_no);
//		System.out.println(re.size());
		
		model.addAttribute("review", dao.getReview(item_no) ); //리뷰목록 불러오기
		
		return "/product/detail";
	}
	
	//리뷰작성 페이지로 이동
	@RequestMapping("/writeReview")
	public String writeReview(@RequestParam("item_no") int item_no, Model model) {
		System.out.println("writeReview");
		model.addAttribute("item_no", item_no);
		return "/product/writeReview";
		
	}

	//리뷰등록
	@RequestMapping("/addReview")
	public void addReview(ReviewDto rd){
		System.out.println("addReview start");
		dao.addReview(rd);
		System.out.println("addReview end");
	}
	
	//리뷰슈정
	@RequestMapping("/updateReview")
	public void updateReview(ReviewDto rd){
		dao.updateReview(rd);
	}
	
	//리뷰삭제
	@RequestMapping("/deleteReview")
	public void deleteReview(@RequestParam("item_no") int item_no){
		dao.deleteReview(item_no);
	}
	
	//===동건
	//장바구니에 담기 
	
	//===광원
	//주문하기 
	//주문할때 적립금 계산해서 테이블에 넣기
	
	//===나~
	//리뷰 보기 
	//리뷰 쓰기
	//리뷰 수정
	//리뷰 삭제
		
	//===민규 //댓글식으러한대
	//Q&A 보기
	//Q&A 쓰기
	//Q&A 수정
	//Q&A 삭제
	
	//===건오오빠
	//테이블 만들기 

}
