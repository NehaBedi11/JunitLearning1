package com.practice.Junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({FirstTest.class,SecondTest.class})
public class SuitTest {

}
