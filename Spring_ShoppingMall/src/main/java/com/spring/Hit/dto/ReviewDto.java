package com.spring.Hit.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class ReviewDto {
	private int review_no;		//���� ��ȣ
	private String id;			//���̵�
	private int item_no;		//��ǰ��ȣ
	private String review_tit;	//���� ����
	private String review_con;	//���� ����
	private Date review_date;	//���� �ۼ���
	
	public ReviewDto() {
		// TODO Auto-generated method stub

	}

	public ReviewDto(int review_no, String id, int item_no, String review_tit, String review_con,
			Date review_date) {
		this.review_no = review_no;
		this.id = id;
		this.item_no = item_no;
		this.review_tit = review_tit;
		this.review_con = review_con;
		this.review_date = review_date;
	}



	public int getReview_no() {
		return review_no;
	}

	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getItem_no() {
		return item_no;
	}

	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}

	public String getReview_tit() {
		return review_tit;
	}

	public void setReview_tit(String review_tit) {
		this.review_tit = review_tit;
	}

	public String getReview_con() {
		return review_con;
	}

	public void setReview_con(String review_con) {
		this.review_con = review_con;
	}

	public Date getReview_date() {
		return review_date;
	}

	public void setReview_date(Date review_date) {
		this.review_date = review_date;
	}
	
}
