package com.practice.Junit4;

import org.junit.Assert;		
import org.junit.Rule;		
import org.junit.Test;		
import org.junit.rules.ErrorCollector;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;	

public class ErrorCollectorExample {
	@Rule		
    public ErrorCollector collector = new ErrorCollector();							

    @Test
    public void example() {					
    collector.addError(new Throwable("There is an error in first line"));	
    collector.addError(new Exception("There is an error in first line"));	
    collector.addError(new Throwable("There is an error in second line"));							

    // whenever an assert would fail it will print the errors   
    System.out.println("Hello");					
        try {		
            Assert.assertTrue("A " == "B");					
        } catch (Throwable t) {					
        	collector.addError(t);					
        }		
        System.out.println("World!!!!");					
    }		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses(ErrorCollectorExample.class);
		for(Failure failure : result.getFailures())		{
			System.out.println(failure.toString());
		}
		System.out.println("Result was successful: "+result.wasSuccessful());

	}
}
