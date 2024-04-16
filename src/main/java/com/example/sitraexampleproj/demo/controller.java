package com.example.sitraexampleproj.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.text.spi.DateFormatProvider;
import java.util.Date;
import java.util.List;


@Controller
public class controller {
    @Autowired
    HttpSession session;
    @RequestMapping("*")
    public String home(HttpSession session, Model model){
//        session.setAttribute("name","aarthik bala");
        model.addAttribute("name",session.getAttribute("name"));
        return "index";
    }

    @RequestMapping("/signup")
    public String signup(HttpSession session){
        session.setAttribute("name","gopal");
        return "signup";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
@RestController
class rest{
    @Autowired
    public servicerepo ser;


    @RequestMapping(value = "/adduser" ,method = RequestMethod.POST)
    public String adduser(@RequestBody user us){
        try{
            ser.adduser(us);
            return "redirect:/";
        }catch (Exception e){
            return "redirect:/signup";
        }
    }

    @PostMapping(value = "/logger")
    public String logger(@RequestBody login lo,HttpSession session){
//        return ResponseEntity.ok(session.getAttribute("name").toString());
        if(ser.checklogin(lo)){
            session.setAttribute("name",ser.findname(lo));
            System.out.println("enter success");
            return "http://localhost:8080";
        }
        else{
            session.removeAttribute("name");
            System.out.println("enter failure");
            return "http://localhost:8080/login";
        }
    }

    @PostMapping(value = "/logout")
    public String logout( HttpSession session){
        session.removeAttribute("name");
        return "redirect:/login";
//        try{
//            session.removeAttribute("name");
//            return "redirect:/login";
//        }
//        catch (Exception e){
//            return "redirect:/";
//        }
    }
    @RequestMapping(value = "/set")
    public String sett(HttpSession session){
        session.setAttribute("name","kumar");
        return "setted sucessfully";
    }
    @PostMapping(value = "/remove")
    public String remove(HttpSession session){
        session.removeAttribute("name");
        return "removed";
    }
    @GetMapping(value="/getsession")
    private ResponseEntity<String> something(HttpSession session){
        //session.setAttribute("name","gopal");
        return new ResponseEntity<>(session.getAttribute("name").toString(),HttpStatus.OK);
    }
}
 