package com.jenkins.integration;

import org.junit.Assert;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test
	public void test1() {
	 System.out.println("test 1 executed");	
      Assert.fail();
	}

	@Test
	public void testdev() {
	 System.out.println("test dev executed");
      Assert.fail();
	}

	@Test
	public void test2() {
	 System.out.println("test 2 executed");	
      //Assert.fail();
	}
	
	@Test
	public void test3() {
	 System.out.println("test 3 executed");	
      Assert.fail();
	}
	
	@Test
	public void test4() {
	 System.out.println("test 4 executed");	
      //Assert.fail();
	}

}
