package hello.Infrastructure;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.Services.ListGreetingsService;


@Controller
public class ListGreetingsController {

	    private ListGreetingsService listGreetings;
	    
	    ListGreetingsController (ListGreetingsService listGreetings) {
	    	this.listGreetings = listGreetings;
	    }

	    @RequestMapping(value="/list-greetings")
	    public String listGreetings(Model model) {
	    	model.addAttribute("greetings", this.listGreetings.run());
	        return "all-greetings";
	    }
}