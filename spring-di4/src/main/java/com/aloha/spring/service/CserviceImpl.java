package com.aloha.spring.service;

import org.springframework.stereotype.Service;

// 서비스 빈으로 등록
// 빈등록 어노테이션("빈이름")
// * 빈 이름을 지정하지 않으면 클래스 이름이 빈 이름이 된다.
// * "빈 이름"을 지정하면, @Qualifier("지정한 빈 이름")으로 주입할 수 있다.
@Service("C")
public class CserviceImpl implements MyService {
	
	@Override
	public void test() {
		System.out.println("C serviceImpl...");
	}
}
