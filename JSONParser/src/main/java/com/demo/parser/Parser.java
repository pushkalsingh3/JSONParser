package com.demo.parser;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.demo.pojo.CarDetails;
import com.demo.pojo.PersonalDetails;
import com.demo.utils.FileUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Parser extends FileUtils {
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	Date date = Calendar.getInstance().getTime();
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY_hh-mm-ss");
	String strDate = dateFormat.format(date);
	
	public PersonalDetails createPOJOfromJSON(String json) {
		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails = gson.fromJson(json, PersonalDetails.class);
		return personalDetails;
	}
	
	public void createJSONfromPOJO(CarDetails personalDetails) {
		try {
			String path = System.getProperty("user.dir")+"/src/test/resources/com/demo/json/"+"json"+strDate+".json";
			createJSONFile(path);
			System.out.println(gson.toJson(personalDetails));
			gson.toJson(personalDetails, fileWriter);
			fileWriter.flush();
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
