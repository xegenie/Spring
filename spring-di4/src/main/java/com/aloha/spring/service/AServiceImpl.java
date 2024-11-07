package com.aloha.spring.service;

import org.springframework.stereotype.Service;

@Service	// 서비스 빈으로 등록
			// 빈 이름 지정하지 않으면, "AserviceImpl"로 지정
public class AServiceImpl implements MyService {

	@Override
	public void test() {
		System.out.println("A serviceImpl...");
	}
}