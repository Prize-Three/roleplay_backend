package com.prizethree.roleplay.controller;


import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("test sucess");
    }
}
