package application.main.stepDefImpl;

import java.util.List;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class JsonValidation {

	public static void main(String args[])
	{
		
	}
	
	public void getJson()
	{
		String url="";
		String username="";
		String password="";
		
		Response response= RestAssured.given().expect().statusCode(200).when().get("/path");
		
		List<String> ids= JsonPath.with(response.asString()).get();
	}
}
