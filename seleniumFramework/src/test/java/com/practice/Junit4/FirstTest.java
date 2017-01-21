package com.practice.Junit4;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Parameterized.class)
public class FirstTest {
	
	private String url;
	private String title;
	public FirstTest(String furl,String ftitle){
		url= furl;
		title=ftitle;
	}
	
	@Parameters
	public static Collection<Object[]> getParameters(){
		return Arrays.asList(new Object[][]{
			{"https://google.co.in/","Google"},
			{"https://gmail.com/","Gmail"}
		});
	}
	@Test
	public void FirstTest(){
		WebDriver driver= new FirefoxDriver();
		driver.get(url);
		assertTrue(true);
		assertFalse(false);
		assertThat("expectedMessage",CoreMatchers.is("expectedMessage"));
		assertThat("expectedMessage",containsString("Message"));
		assertThat("expectedMessage",CoreMatchers.anyOf(CoreMatchers.containsString("Hello"),CoreMatchers.containsString("expectedMessage")));
		System.out.println("TEST_CASE CONTENT_FIRST_TEST");
	}

	@Test
	public void AssertionExampleTest(){
		assertTrue(true);
		assertFalse(false);
		//This is mostly used to comapre expected & actual Messages. CoreMatcher is part of Hamcrest
		//& in-built matchers as used below 
		assertThat("expectedMessage",CoreMatchers.is("expectedMessage"));
		assertThat("expectedMessage",containsString("Message"));
		assertThat("expectedMessage",CoreMatchers.anyOf(CoreMatchers.containsString("Hello"),CoreMatchers.containsString("expectedMessage")));
		if(1!=2)
		fail("Failling the test on Purpose");
	}
}
