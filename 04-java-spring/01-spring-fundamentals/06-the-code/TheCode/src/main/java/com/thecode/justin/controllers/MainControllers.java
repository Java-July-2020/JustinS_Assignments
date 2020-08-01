<<<<<<< HEAD
package com.thecode.justin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainControllers {
	
	@RequestMapping()
	public String index(@ModelAttribute("errors") String errors, Model model) {
		if (errors.isEmpty()) {
			return "index.jsp";
		}
		else {
			model.addAttribute("errors", errors);
			return "index.jsp";
		}
	}
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String code(@RequestParam("code") String value, RedirectAttributes redirectAttributes) {
		if (value.equals("bushido")) {
			return "code.jsp";
		}
		else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
	}
    
}
=======
package com.thecode.justin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainControllers {
	
	@RequestMapping()
	public String index(@ModelAttribute("errors") String errors, Model model) {
		if (errors.isEmpty()) {
			return "index.jsp";
		}
		else {
			model.addAttribute("errors", errors);
			return "index.jsp";
		}
	}
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String code(@RequestParam("code") String value, RedirectAttributes redirectAttributes) {
		if (value.equals("bushido")) {
			return "code.jsp";
		}
		else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
	}
    
}
>>>>>>> 2f7d9fadc580410673e35d4ea32db23a3d87efb9
