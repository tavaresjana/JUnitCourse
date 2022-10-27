package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass //aparece no começo
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before // irá aparecer a msg do sysout antes de começar cada teste
	public void setup() {
		System.out.println("Before test");
	}

	@Test
	public void test1() {
		System.out.println("teste1 executed");
	}

	@Test
	public void test2() {
		System.out.println("teste2 executed");
	}

	@After
	public void teardown() {
		System.out.println("After test");
	}

	@AfterClass //aparece no fim
	public void afterClass() {
		System.out.println("After Class");
	}
}
