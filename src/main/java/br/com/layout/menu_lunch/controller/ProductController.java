package br.com.layout.menu_lunch.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController  // notation to my aplication map my routes.
@RequestMapping("/product") // notation to indicate the endpoint will listen. 
public class ProductController {
    @GetMapping
    // response method to send to client
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok("deu ok");
    }
}
