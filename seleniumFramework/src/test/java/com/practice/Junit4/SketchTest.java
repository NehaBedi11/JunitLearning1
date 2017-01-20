package com.practice.Junit4;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SketchTest {

	WebDriver driver;
	@Test
	public void drawSquareTest() {
		driver= new FirefoxDriver();
		driver.get("https://sketch.io/sketchpad/");
		//handling Close icon 
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".icon-close")));
		driver.findElement(By.cssSelector(".icon-close")).click();
		WebElement sketchSheet=driver.findElement(By.tagName("sketch-scrollarea"));
		WebElement pencil =driver.findElement(By.xpath("//span[@data-tool='pencil']"));
		//Asserting tool tip text
		assertThat(pencil.getAttribute("data-tooltip"),CoreMatchers.is("pencil"));
		pencil.click();
		Dimension size=sketchSheet.getSize();
		Point location =sketchSheet.getLocation();
		Actions action = new Actions(driver);
		System.out.println(location.y+(size.height/2));
		System.out.println(location.y);
		action.moveByOffset(location.x+(size.width/2),257).clickAndHold()
		.moveByOffset(location.x+(size.width),257)
		.release()
		.perform();
		
	}
}
