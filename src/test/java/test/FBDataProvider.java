package test;

import org.testng.annotations.DataProvider;

public class FBDataProvider {
	
	@DataProvider( name ="LoginData")
	public static String[][] FacebookLoginData()
	{
		String [][] data = {{"pallavip@gmail.com","123"},{"Sonali@gmail.com","1234"}};
		
		return data;
	}
	

}
