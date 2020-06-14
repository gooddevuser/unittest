package com.example.unittest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

// JUnit 4.x를 따르는 테스트 클래스
public class HelloUnitTest2 {

	@Test // 이 메서드는 테스트 메서드입니다.
	public void testDivide() {
		//try {
			// 실행 코드
			double result = 10 / 2.;
			// 실행 코드의 결과를 테스트 하는 코드 (전용 메서드 사용)
			assertTrue("10 / 2 = ?", 5. == result);
		//} catch (Exception ex) {
			
		//}
		
	}
	
	@Test
	public void testMultiply() {
		
		// 실행 코드
		double result = 10 * 2.;
		// 실행 코드의 결과를 테스트 하는 코드 (전용 메서드 사용)
		assertTrue("10 * 2 = ?", 20. == result);
		
		
	}
	
}
