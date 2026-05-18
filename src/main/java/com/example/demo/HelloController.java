package com.example.demo; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> sayHello() {
        Map<String, Object> response = new HashMap<>();
        
        response.put("message", "Hello from Spring Boot!");
        response.put("team", "Solo-Student"); 
        response.put("indexes", new int[]{77285});
        
        return response;
    }
}