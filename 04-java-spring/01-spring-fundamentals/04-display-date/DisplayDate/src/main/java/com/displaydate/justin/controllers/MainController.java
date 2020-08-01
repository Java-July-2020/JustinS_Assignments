<<<<<<< HEAD
package com.displaydate.justin.controllers;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping()
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/time")
	public String timePage(Model model) {
		Date time = new Date();
		DateFormat timeformat = new SimpleDateFormat("hh:mm aa");
		String timeFT = (timeformat.format(time)).toString();
		model.addAttribute("theTime", timeFT);
		return "timeindex.jsp";
	}
	
	@RequestMapping("/date")
	public String datePage(Model model) {
	Date todaysDate = new Date();
	DateFormat month = new SimpleDateFormat("MMMM");
	String monthFormat = month.format(todaysDate).toString();
	DateFormat day = new SimpleDateFormat("dd");
	String dayFormat = day.format(todaysDate).toString();
	DateFormat year = new SimpleDateFormat("yyyy");
	String yearFormat = year.format(todaysDate).toString();
	DateFormat dayofTheWeek = new SimpleDateFormat("EEEE");
	String dayofTheWeekFormat = dayofTheWeek.format(todaysDate).toString();
	String returnString = "Today is " + dayofTheWeekFormat + ", the " + dayFormat + " of " + monthFormat + ", " + yearFormat;
	model.addAttribute("theDate", returnString);
	System.out.println(returnString);
		return "dateindex.jsp";
	}
	
}
=======
package com.displaydate.justin.controllers;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping()
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/time")
	public String timePage(Model model) {
		Date time = new Date();
		DateFormat timeformat = new SimpleDateFormat("hh:mm aa");
		String timeFT = (timeformat.format(time)).toString();
		model.addAttribute("theTime", timeFT);
		return "timeindex.jsp";
	}
	
	@RequestMapping("/date")
	public String datePage(Model model) {
	Date todaysDate = new Date();
	DateFormat month = new SimpleDateFormat("MMMM");
	String monthFormat = month.format(todaysDate).toString();
	DateFormat day = new SimpleDateFormat("dd");
	String dayFormat = day.format(todaysDate).toString();
	DateFormat year = new SimpleDateFormat("yyyy");
	String yearFormat = year.format(todaysDate).toString();
	DateFormat dayofTheWeek = new SimpleDateFormat("EEEE");
	String dayofTheWeekFormat = dayofTheWeek.format(todaysDate).toString();
	String returnString = "Today is " + dayofTheWeekFormat + ", the " + dayFormat + " of " + monthFormat + ", " + yearFormat;
	model.addAttribute("theDate", returnString);
	System.out.println(returnString);
		return "dateindex.jsp";
	}
	
}
>>>>>>> 2f7d9fadc580410673e35d4ea32db23a3d87efb9
