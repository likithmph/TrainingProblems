package com.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MakeController {
@RequestMapping(value = "/home" , method = RequestMethod.GET)
public String homePage() {
	return "homepage";
}
@GetMapping("/greet")
public String greetAgain() {
	return "greetpage";
}

}
