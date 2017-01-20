package com.practice.Junit4;

import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class JUnitExecutionListener extends RunListener {

	@Override
	public void testRunStarted(Description description) throws Exception {
		System.out.println("Number of test cases to execute: "+ description.testCount());
	}

	@Override
	public void testRunFinished(Result result) throws Exception {
		System.out.println("Number of test cases executed: "+ result.getRunCount());
	}

	@Override
	public void testStarted(Description description) throws Exception {
		System.out.println("Starting Test:"+ description.getMethodName());
	}

	@Override
	public void testFinished(Description description) throws Exception {
		System.out.println("Finished Test:"+ description.getMethodName());
	}

	@Override
	public void testFailure(Failure failure) throws Exception {
		System.out.println("Test Failed :"+failure.getDescription().getMethodName());
		System.out.println("Stack Trace :"+failure.getTrace());
	}
	@Override
	public void testAssumptionFailure(Failure failure) {
		System.out.println("Failed: " + failure.getDescription().getMethodName());
	}

	@Override
	public void testIgnored(Description description) throws Exception {
		System.out.println("Ignored: " + description.getMethodName());
	}
}
