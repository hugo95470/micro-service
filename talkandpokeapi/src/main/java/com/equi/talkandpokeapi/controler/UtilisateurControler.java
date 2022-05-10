package com.equi.talkandpokeapi.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurControler {

    @GetMapping(value = "/")
    public String hello(){
        return "hello";
    }

}
