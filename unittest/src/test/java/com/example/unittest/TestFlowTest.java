package com.example.unittest;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFlowTest {
	
	@BeforeClass // 테스트 클래스마다 한 번 호출
	public static void beforeClass() {
		System.out.println("Before Test Class");
	}
	@Before // 테스트 메서드마다 한 번 호출
	public void before() {
		System.out.println("Before Test");
	}	

	@Test
	public void testDivide() {
		// 실행 코드
		double result = 10 / 2.;
		// 실행 코드의 결과를 테스트 하는 코드 (전용 메서드 사용)
		assertTrue("10 / 2 = ?", 5. == result);		
	}	
	@Test
	public void testMultiply() {		
		// 실행 코드
		double result = 10 * 2.;
		// 실행 코드의 결과를 테스트 하는 코드 (전용 메서드 사용)
		assertTrue("10 * 2 = ?", 20. == result);
	}
	
	@After
	public void after() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Test Class");
	}

	
}
