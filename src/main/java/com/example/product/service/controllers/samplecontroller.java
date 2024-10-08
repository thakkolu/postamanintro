package com.example.product.service.controllers;

import com.example.product.service.exception.productnotfoundexception;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class samplecontroller {
    @GetMapping("/Hello")
    public String helloworld(){

        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    public String hellowithname(@PathVariable("name") String name) throws productnotfoundexception{
        if(name.equals("sravani")){
            throw new productnotfoundexception("sravani not found");
        }
        return "Hello " + name;
    }
    @GetMapping("/show/{showid}/seat/{seatid}")
    public String hello(@PathVariable("showid") String showname,@PathVariable("seatid") int seatid){
        return "show name is "+showname+" seatid is "+seatid;
    }
}
