package com.spring.Hit.dao;

import java.util.ArrayList;

import com.spring.Hit.dto.BoardDto;
import com.spring.Hit.dto.MemberDto;
import com.spring.Hit.dto.ProductDto;

public interface MemberIDao {
	//���������� & ������ ��ǰ ����Ʈ
	public ArrayList<ProductDto> mainDao();
	//ȸ�� ����
	public void writeDao(String id, String password);
	//ȸ�� ���� ����
	public MemberDto viewDao(String id);
	//ȸ�� ���� ����
	public void deleteDao(String id);
	
	//��ٱ��� ����
	//�ֹ�����Ʈ ����
	//��� ����
	//���� ����
	//�Խ��� ��Ϻ���
	public ArrayList<BoardDto> boardDao();
	
	//�Խ��� �ۺ���
	//�Խ��� �۵��
	//�Խ��� �ۼ���
	//�Խ��� �ۻ���
	
}
