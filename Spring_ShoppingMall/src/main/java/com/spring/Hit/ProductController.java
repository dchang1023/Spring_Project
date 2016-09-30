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
	
	//ī�װ��� ��ǰ ����Ʈ ������
	@RequestMapping(value = "/list", method= RequestMethod.GET)
	public void list(@ModelAttribute("pdt") ProductDto pdt, Model model) {
		logger.info(pdt.toString());
		
		model.addAttribute("list", dao.listDao(pdt));
		
	}
	//��ǰ �� ���� ������
	@RequestMapping("/detail")
	public String view(@RequestParam("item_no") int item_no, Model model) {
		
		model.addAttribute("list", dao.viewDao(item_no));
		
//		List<ReviewDto> re = dao.getReview(item_no);
//		System.out.println(re.size());
		
		model.addAttribute("review", dao.getReview(item_no) ); //������ �ҷ�����
		
		return "/product/detail";
	}
	
	//�����ۼ� �������� �̵�
	@RequestMapping("/writeReview")
	public String writeReview(@RequestParam("item_no") int item_no, Model model) {
		System.out.println("writeReview");
		model.addAttribute("item_no", item_no);
		return "/product/writeReview";
		
	}

	//������
	@RequestMapping("/addReview")
	public void addReview(ReviewDto rd){
		System.out.println("addReview start");
		dao.addReview(rd);
		System.out.println("addReview end");
	}
	
	//���佴��
	@RequestMapping("/updateReview")
	public void updateReview(ReviewDto rd){
		dao.updateReview(rd);
	}
	
	//�������
	@RequestMapping("/deleteReview")
	public void deleteReview(@RequestParam("item_no") int item_no){
		dao.deleteReview(item_no);
	}
	
	//===����
	//��ٱ��Ͽ� ��� 
	
	//===����
	//�ֹ��ϱ� 
	//�ֹ��Ҷ� ������ ����ؼ� ���̺� �ֱ�
	
	//===��~
	//���� ���� 
	//���� ����
	//���� ����
	//���� ����
		
	//===�α� //��۽������Ѵ�
	//Q&A ����
	//Q&A ����
	//Q&A ����
	//Q&A ����
	
	//===�ǿ�����
	//���̺� ����� 

}
