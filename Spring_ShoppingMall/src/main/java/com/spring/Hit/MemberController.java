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
	//���� ������ & ������ ��ǰ ����Ʈ
	@RequestMapping("/main")
	public String main(Model model) {

		MemberIDao dao = sqlSession.getMapper(MemberIDao.class);
		model.addAttribute("list", dao.mainDao());
		
		return "/member/main";
	}
	
	//��ٱ��� ����
	//�ֹ�����Ʈ ����
	//��� ����
	//���� ����
	//�Խ��� ��Ϻ���
	@RequestMapping("/board")
	public String board(Model model) {

		MemberIDao dao = sqlSession.getMapper(MemberIDao.class);
		model.addAttribute("list", dao.boardDao());
		
		return "/member/board";
	}
	//�Խ��� �ۺ���
	//�Խ��� �۵��
	//�Խ��� �ۼ���
	//�Խ��� �ۻ���
	
}
