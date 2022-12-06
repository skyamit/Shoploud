package com.example.Shoploud.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/")
    public ResponseEntity<String> nothing(){
        return new ResponseEntity<>(null);
    }

}
