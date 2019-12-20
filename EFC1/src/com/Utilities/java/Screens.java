package com.Utilities.java;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.DriverFactory.java.Testefc;

public class Screens  extends Testefc{

	
	
public  void takeScreen() throws Throwable {
		
		SimpleDateFormat date = new SimpleDateFormat("dd_yy_mm hh_ss_mm");
		Date d = new Date();
		String d1= date.format(d)	;	
	         File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       	FileUtils.copyFile(file, new File("./screenshotss/screen+"+d1+".png"));
	 	
}
}
