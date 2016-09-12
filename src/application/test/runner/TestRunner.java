package application.test.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import application.main.stepDefImpl.LoginPage;

// specify a runner class: Suite.class
@RunWith(Suite.class)

// specify an array of test classes
@Suite.SuiteClasses(
		{
  LoginPage.class
  
  }
)

// the actual class is empty

public class TestRunner {
}

 
 
     