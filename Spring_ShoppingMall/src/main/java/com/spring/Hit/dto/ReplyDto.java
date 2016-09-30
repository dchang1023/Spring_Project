package com.spring.Hit.dto;

import java.sql.Timestamp;

public class ReplyDto {
	private int reply_no;	//´ñ±Û ¹øÈ£
	private String id;		//¾ÆÀÌµð
	private int item_no;	//»óÇ° ¹øÈ£
	private String reply_tit;	//´ñ±Û Á¦¸ñ
	private String reply_con;	//´ñ±Û ³»¿ë
	private Timestamp reply_date;//´ñ±Û ÀÛ¼º ½Ã°£
	
	public ReplyDto() {
		// TODO Auto-generated constructor stub
	}

	public ReplyDto(int reply_no, String id, int item_no, String reply_tit, String reply_con, Timestamp reply_date) {
		this.reply_no = reply_no;
		this.id = id;
		this.item_no = item_no;
		this.reply_tit = reply_tit;
		this.reply_con = reply_con;
		this.reply_date = reply_date;
	}

	public int getReply_no() {
		return reply_no;
	}

	public void setReply_no(int reply_no) {
		this.reply_no = reply_no;
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

	public String getReply_tit() {
		return reply_tit;
	}

	public void setReply_tit(String reply_tit) {
		this.reply_tit = reply_tit;
	}

	public String getReply_con() {
		return reply_con;
	}

	public void setReply_con(String reply_con) {
		this.reply_con = reply_con;
	}

	public Timestamp getReply_date() {
		return reply_date;
	}

	public void setReply_date(Timestamp reply_date) {
		this.reply_date = reply_date;
	}

}
