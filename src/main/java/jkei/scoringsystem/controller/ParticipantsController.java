/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.controller;

import java.sql.Timestamp;
import java.util.Date;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import jkei.scoringsystem.model.Contestant;
import jkei.scoringsystem.model.User;
import jkei.scoringsystem.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Kate Dianne
 */

@Controller
public class ParticipantsController {
    @Autowired
    ParticipantService participantService;
    
    
    @RequestMapping(value = "/participants", method = RequestMethod.GET)
    public String showParticipants(){
        return "participants";
    }
    
    @RequestMapping(value = "/addParticipant", method = RequestMethod.POST)
    @ResponseBody
    public User addParticipant(@RequestBody Contestant contestant, HttpServletRequest request){
        User user = new User();

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("UserId")) {
                    contestant.setCreatedBy(Integer.parseInt(cookie.getValue())); // set created by to user id from cookie 
                }  
            }
        }
        
        Date date= new Date();
        long time = date.getTime();
	contestant.setDateCreated(new Timestamp(time)); // set date requested to current datetime

        contestant.setStatusId(1); // set status to 
        
        int result = 0;
        if (contestant.getContestantId()== 0){
            result = participantService.CreateParticipant(contestant);
        }
        else {
//            result = participantService.UpdateParticipant(contestant);
        }

        user.setUserId(result);

        return user;
     
    }
    
    @RequestMapping(value = "/getParticipant", method = RequestMethod.GET)
    @ResponseBody
    public List<Reservation> getReservation( HttpServletRequest request){
        Login login = new Login();
        
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("IsLogin")){
                    login.setIsLogin(Integer.parseInt(cookie.getValue()));
                }  
            }
        }
        
        List<Reservation> reservationList  = reservationService.getReservation();
     
        return reservationList;
        
    }
}
