package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	//Get Method
	public void get(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget);
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("statusCode::::"+statusCode);
		
		String responseString =EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
		//convert the entire response string into json format
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("responseJson"
				+responseJson);
		
		Header[] heardersArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allheaders = new HashMap<String, String>();
		
		for(Header header :heardersArray)
		{
			allheaders.put(header.getName(), header.getValue());
		}
		
		System.out.println("ALL Headers::::"+allheaders);
	}
	
	
	

}
