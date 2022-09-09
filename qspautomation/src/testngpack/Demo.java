package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void a() {
	 // System.out.println("my name is shruti");
	 // Reporter.log("my name is shruti");
	  Reporter.log("my name is shruti",true);
	  
  }
}
