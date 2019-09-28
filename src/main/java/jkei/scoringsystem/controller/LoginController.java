/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.controller;

import jkei.scoringsystem.model.Login;
import jkei.scoringsystem.model.User;
import jkei.scoringsystem.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JC
 */

@Controller
public class LoginController {
    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/login", method = RequestMethod.GET )
    public ModelAndView showLogin(HttpServletResponse response, HttpServletRequest request){
        ModelAndView mav = new ModelAndView("loginpage");
        mav.addObject("login", new Login());
        
        return mav;
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET )
    public ModelAndView register(HttpServletResponse response, HttpServletRequest request){
        ModelAndView mav = new ModelAndView("registerpage");
        mav.addObject("register", new User());
        
        return mav;
    }
    
    @RequestMapping(value = "/registered",method = RequestMethod.POST )
    @ResponseBody
    public ModelAndView registered(
    @ModelAttribute("register") User user) {
      ModelAndView mav = null;
      userService.register(user);
      mav = new ModelAndView("loginpage");
      return mav;
    }
    
    @RequestMapping(value = "/loginProcess",method = RequestMethod.POST )
    @ResponseBody
    public ModelAndView loginProcess(
    @ModelAttribute("login") Login login) {
      ModelAndView mav = null;
      User user = userService.validateUser(login);
      if (null != user) {
      mav = new ModelAndView("welcomepage");
      mav.addObject("firstname", user.getFirstname());
      mav.addObject("lastname", user.getLastname());
      } else {
      mav = new ModelAndView("loginpage");
      mav.addObject("message", "Username or Password is wrong!!");
      }
      return mav;
    }
    
    
    
    @RequestMapping(value = "/loginProcess1", method = RequestMethod.POST )
    @ResponseBody
    public User loginProcess1(@RequestBody Login login) {
       
     
      return  userService.validateUser(login);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET )
    public String showHome(HttpServletResponse response, HttpServletRequest request){
//        ModelAndView mav = new ModelAndView("home");
//        mav.addObject("login", new Login());
        
        return "home";
    }
    
    
    @RequestMapping("/test/ajax")
    public ModelAndView showTime(){
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("test", "hehe");
        
        return mav;
    }
    
    
    
}
