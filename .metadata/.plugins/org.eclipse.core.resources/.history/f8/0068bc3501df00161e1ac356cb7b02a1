package com.practice.Junit4;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SecondTest {
	
	private String url;
	private String title;
	public SecondTest(String furl,String ftitle){
		url= furl;
		title=ftitle;
	}
	
	@Parameters
	public static Collection<Object[]> getParameters(){
		return Arrays.asList(new Object[][]{
			{"hey","Google"},
			{"https://gmail.com/","Gmail"}
		});
	}
	@Test
	public void SecondOneTest(){
		System.out.println("TEST_CASE CONTENT_SECONDONETEST");
		Assert.fail("failed on purpose");
	}
}
