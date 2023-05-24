package com.sus_society.sus2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sus_society.sus2.model.Hero;

@RestController
public class TestRestCrt {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello Hero !!!";
    }

    @RequestMapping(method=RequestMethod.POST,value="/addhero")
    public void addHero(@RequestBody Hero hero) {
        System.out.println(hero);
    }

    @RequestMapping(method=RequestMethod.GET,value="/msg/{id1}/{id2}")
    public String getMsg(@PathVariable String id1, @PathVariable String id2) {
        return "Composed Message: msg1:"+id1+"msg2:"+id2;
    }

    @RequestMapping(method=RequestMethod.GET,value="/parameters")
    public String getInfoParam(@RequestParam String param1,@RequestParam String param2) {
        return "Parameters: param1:"+param1+"param2:"+param2;
    }
}

