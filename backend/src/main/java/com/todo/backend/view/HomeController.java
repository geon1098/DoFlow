package com.todo.backend.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
    	return "redirect:/todos"; 
}
    @GetMapping("/login")
    public String login(){
    	return "login"; 
}
    @GetMapping("/signup")
    public String signup(){
    	return "signup"; 
}
    @GetMapping("/todos")
    public String todos(){
    	return "todos"; 
}
    @GetMapping("/oauth2/success")
    public String oauthSuccess() {
    	return "oauth-success"; 
}
}