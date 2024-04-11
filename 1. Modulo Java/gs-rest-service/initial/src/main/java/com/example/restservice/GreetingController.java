package com.example.restservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/")
    public String index(@RequestParam(name="username", required=false, defaultValue="mario") String username, @RequestParam(name="password", required=false, defaultValue="password") String password){
        Connection connection = new Connection(username, password);
        connection.connect();
        return username + " " + password;
    }
}
