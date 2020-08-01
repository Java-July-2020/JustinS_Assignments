<<<<<<< HEAD
package com.sessioncounter.justin.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
		

	@RequestMapping("/")
    //...
    public String index(HttpSession session){
		if(session.getAttribute("count") ==  null) {
			session.setAttribute("count", 0);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping("/count")
	public String counter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount++;
		session.setAttribute("count", currentCount);
		model.addAttribute("count", currentCount);
		return "count.jsp";
	}
	
	@RequestMapping("/doubleCount")
		public String doubleCounter(HttpSession session, Model model) {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount = currentCount + 2;
			session.setAttribute("count", currentCount);
			model.addAttribute("count", currentCount);
		return "doubleCount.jsp";
	}

}
=======
package com.sessioncounter.justin.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
		

	@RequestMapping("/")
    //...
    public String index(HttpSession session){
		if(session.getAttribute("count") ==  null) {
			session.setAttribute("count", 0);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping("/count")
	public String counter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount++;
		session.setAttribute("count", currentCount);
		model.addAttribute("count", currentCount);
		return "count.jsp";
	}
	
	@RequestMapping("/doubleCount")
		public String doubleCounter(HttpSession session, Model model) {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount = currentCount + 2;
			session.setAttribute("count", currentCount);
			model.addAttribute("count", currentCount);
		return "doubleCount.jsp";
	}

}
>>>>>>> 2f7d9fadc580410673e35d4ea32db23a3d87efb9
