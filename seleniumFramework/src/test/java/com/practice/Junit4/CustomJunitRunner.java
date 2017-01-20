package com.practice.Junit4;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class CustomJunitRunner extends BlockJUnit4ClassRunner{

	public CustomJunitRunner(Class<?> klass) throws InitializationError {
		super(klass);
		// TODO Auto-generated constructor stub
	}
	@Override 
	public void run(RunNotifier paramRunNotifier){
		paramRunNotifier.addListener(new JUnitExecutionListener());
		super.run(paramRunNotifier);
	}

}
