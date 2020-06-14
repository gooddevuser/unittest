package com.example.unittest;

import junit.framework.TestCase;

//JUnit 3.x를 따르는 테스트 클래스
public class HelloUnitTest extends TestCase {

	public void testDivide() {
		try {
		// 실행 코드
			double result = 10 / 2.;
		// 실행 코드의 결과를 테스트 하는 코드 (전용 메서드 사용)
		//assertEquals("10 / 2 = ?", 5., result);
		} catch (Exception ex) {
			
		}
		
		
	}
	
	public void testMultiply() {
		
		// 실행 코드
		double result = 10 * 2.;
		// 실행 코드의 결과를 테스트 하는 코드 (전용 메서드 사용)
		assertEquals("10 * 2 = ?", 20., result);
		
		
	}
	
}
