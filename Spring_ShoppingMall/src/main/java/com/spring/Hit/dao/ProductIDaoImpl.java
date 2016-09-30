package com.spring.Hit.dao;

import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.Hit.dto.ProductDto;
import com.spring.Hit.dto.ReviewDto;

@Repository
public class ProductIDaoImpl implements ProductIDao{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="com.spring.Hit.dao.ProductIDao";

	@Override
	public List<ProductDto> listDao(ProductDto pdt) {
		return session.selectList("listDao", pdt);
	}
	
	@Override
	public ProductDto viewDao(int item_no) {
		return session.selectOne("viewDao", item_no);
	}

	@Override
	public List<ReviewDto>getReview(int item_no) {
		return session.selectList("getReview", item_no);
	}

	@Override
	public void addReview(ReviewDto rd) {
		System.out.println(rd.getId());
		System.out.println(rd.getItem_no());
		System.out.println(rd.getReview_con());
		System.out.println(rd.getReview_tit());
		session.insert("addReview", rd);
		
	}

	@Override
	public void updateReview(ReviewDto rd) {
		session.update("updateReview", rd);
	}

	@Override
	public void deleteReview(int item_no) {
		session.delete("item_no", item_no);
	}

	
}
