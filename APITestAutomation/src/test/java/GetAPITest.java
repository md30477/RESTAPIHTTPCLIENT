import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.client.RestClient;
import com.qa.utils.PropertyFileReader;

public class GetAPITest extends TestBase{
	
	TestBase testbase;
	PropertyFileReader propertyFileReader ;
	RestClient restClient;
	String url;
	
	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException
	{
		testbase= new TestBase();
		propertyFileReader = new PropertyFileReader();
		String serviceUrl = propertyFileReader.getValue("URL");
		String apiurl = propertyFileReader.getValue("serviceURL");
		
		url = serviceUrl + apiurl ;
		
		System.out.println("url"+url);
		
		restClient= new RestClient();
		
	}
	
	
	@Test
	public void getTest() throws ClientProtocolException, IOException
	{
		restClient.get(url);
	}

}
