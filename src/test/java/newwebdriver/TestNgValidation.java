package newwebdriver;

import org.testng.annotations.Test;

public class TestNgValidation {

	@Test(priority=1)
void openapp()
{
	System.out.println("Opening an A pplication...");
	
}
	@Test(priority=2)
void login()
{
	System.out.println("Login application");
	
}
	@Test(priority=-3)
void logout()

{
System.out.println("Logout successfully");	
}
}
