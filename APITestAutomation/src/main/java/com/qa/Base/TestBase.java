package com.qa.Base;
import com.qa.utils.APITestAutomationLogger;
import com.qa.utils.PropertyFileReader;

public class TestBase {
	PropertyFileReader propertyFileReader ;
	public String browserType="";
	APITestAutomationLogger log =null;
	public TestBase()
	{
		propertyFileReader = new PropertyFileReader();
		
	}
	
	
	public void intialization()
	{
		try {
			
			}catch(Exception e){
				e.printStackTrace();
			}
	

}
	
		
}
