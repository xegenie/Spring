package com.aloha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aloha.spring.dao.BoardDAO;
import com.aloha.spring.dto.Board;

public class BoardServiceImpl implements BoardService {

	// BoardSerivceImpl --> BoardDAO 의존
	private BoardDAO boardDAO;
	int test;
	
	@Autowired
	public BoardServiceImpl() {
		
	}
	// 의존성 자동 주입
	// - 빈으로 등록된 BoardDAO 를 주입
	@Autowired
	public BoardServiceImpl(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	
	@Override
	public List<Board> list() {
		return boardDAO.list();
	}

}