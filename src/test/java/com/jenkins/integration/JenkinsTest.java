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
	public void testdevupdate() {
	 System.out.println("test devupdate executed");
      Assert.fail();
	}

    @Test
	public void testcommit1() {
	 System.out.println("test commit1 executed");
      Assert.fail();
	}

    @Test
	public void testcommit2() {
	 System.out.println("test commit2 executed");
      Assert.fail();
	}

    @Test
	public void testcommit11() {
	 System.out.println("test commit11 executed");
      Assert.fail();
	}

    @Test
	public void testcommit13() {
	 System.out.println("test commit13 executed");
      Assert.fail();
	}

    @Test
	public void testcommit12() {
	 System.out.println("test commit12 executed");
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
