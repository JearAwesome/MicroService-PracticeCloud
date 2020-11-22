package org.cloudpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/getAccountName")
    public String getAccountName(){
        return "Tom";
    }
}
