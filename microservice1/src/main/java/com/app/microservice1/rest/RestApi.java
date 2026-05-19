package com.app.microservice1.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @GetMapping("/info")
    public ResponseEntity<String>info() {
        String info="Hello from Sidharth";
        return new ResponseEntity<String>(info, HttpStatus.OK);
    }
}
