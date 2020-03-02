package com.demo.mainTest;

import org.testng.annotations.Test;

import com.demo.parser.Parser;
import com.demo.pojo.CarDetails;
import com.demo.pojo.PersonalDetails;


public class Demo {
	
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setId("1");
		personalDetails.setFirstName("Pushkal");
		personalDetails.setLastName("Singh");
		personalDetails.setGender("Male");
		personalDetails.setDob("03-04-1993");
		
		CarDetails carDetails = new CarDetails("1", "Altroz", personalDetails);
		
		Parser parser = new Parser();
		parser.createJSONfromPOJO(carDetails);
	}

}
