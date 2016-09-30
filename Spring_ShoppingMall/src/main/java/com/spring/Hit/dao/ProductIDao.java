package com.spring.Hit.dao;

import java.util.ArrayList;
import java.util.List;

import com.spring.Hit.dto.ProductDto;
import com.spring.Hit.dto.ReviewDto;

public interface ProductIDao {
	
	//ī�װ��� ��ǰ ����Ʈ ������
	public List<ProductDto> listDao(ProductDto pdt);
	//��ǰ �� ���� ������
	public ProductDto viewDao(int item_no);
	//��ü ���� ��� 
	public List<ReviewDto> getReview(int item_no);
	//���� ���
	public void addReview(ReviewDto rd);
	//���� ����
	public void updateReview(ReviewDto rd);
	//���� ����
	public void deleteReview(int item_no);
	
	//��ٱ��Ͽ� ���
	//�ֹ��ϱ�
	//���� ����
	//���� ����
	//���� ����
	//���� ����
	//��� ����
	//��� ����
	//��� ����
	//��� ����
	
}
