package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	@Before(order=1)
	public void beforMethod()
	{
	System.out.println("This is before method");	
	}@Before(order=0)
	public void beforMethods()
	{
	System.out.println("This is before method1");	
	}
	@After(order=1)
	public void afterMethod()
	{
		System.out.println("This is after Method");
	}
	@After(order=0)
	public void afterMethods()
	{
		System.out.println("This is after Method1");
	}


}
