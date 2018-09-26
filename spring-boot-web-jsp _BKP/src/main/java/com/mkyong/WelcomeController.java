package com.mkyong;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mkyong.bean.User;
import com.mkyong.service.Userservice;

@RestController
public class WelcomeController {

	@Autowired
	private Userservice userservice;
	//List<User> userlist=new ArrayList<User>();
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@Value("${welcome.msg1:test}")
	private String msg1 ="test value for testing puprous only";

	@RequestMapping("/")
	public ModelAndView welcome() {
		
		return new ModelAndView("login");
	}
	@RequestMapping("/logout")
	public ModelAndView exit() {
		
		return new ModelAndView("login");
	}
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView login( HttpServletRequest req) {
		String username=req.getParameter("username");
		String password=req.getParameter("pwd");
		System.out.println(username+" "+password);
		//userservice.adduser(user);
		//userlist.add(user);
		//model.addAttribute("msg", "Record updated !!");
		if(username.equals("admin") && password.equals("admin123"))
		{
		return new ModelAndView("welcome");
	     // return "register";
		//return "Registration";
		}
		else 
			return new ModelAndView("login");
	}
	
	/*
	 * 
	 *rest call example::
	 */
	@GetMapping("/users")
	public List getCustomers() {
		List<User> userlist=userservice.allUsers();
		return userlist;
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		
		 return new ModelAndView("Registration","command",new User()); 
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save( @ModelAttribute("user") User  user) {
		
		System.out.println(user.getEmail()+" "+user.getPassword());
		userservice.adduser(user);
		//userlist.add(user);
		//model.addAttribute("msg", "Record updated !!");
		
		return new ModelAndView("welcome","msg","record added sucessfully !!");
	     // return "register";
		//return "Registration";
	}
	
	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	public ModelAndView view() {
		
		System.out.println("view all clicked");
		//System.out.println(user.getEmail()+" "+user.getPassword());
		//userlist.add(user);
		List<User> userlist=userservice.allUsers();
		System.out.println(userlist);
		return new ModelAndView("register","list",userlist);
	     // return "register";
	}
	
	@RequestMapping(value="/dtview",method = RequestMethod.GET)
	public ModelAndView dtview() {
		
		System.out.println("view all clicked");
		//System.out.println(user.getEmail()+" "+user.getPassword());
		//userlist.add(user);
		List<User> userlist=userservice.allUsers();
		System.out.println(userlist);
		return new ModelAndView("datatable","list",userlist);
	     // return "register";
	}

	@RequestMapping("/remove/{username}")
    public ModelAndView removePerson(@PathVariable("username") String username,Model model){
		System.out.println(username);
	
        //this.personService.removePerson(username);
		List li=userservice.removeUser(username);
		
		
        return new ModelAndView("datatable","list",li) ;
		//return "redirect:/datatable.jsp";
	}
 
    @RequestMapping("/edit/{username}")
    public String editPerson(@PathVariable("username") String username, Model model){
      //  model.addAttribute("person", this.personService.getPersonById(id));
      //  model.addAttribute("listPersons", this.personService.listPersons());
     int i=userservice.updateUser(username);
     
     System.out.println(username);
    	
    	return "Registraion";
    }
    
	
	
}