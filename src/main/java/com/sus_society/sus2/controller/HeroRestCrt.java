package com.sus_society.sus2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sus_society.sus2.model.Hero;
import com.sus_society.sus2.service.HeroService;

@RestController
public class HeroRestCrt {
    @Autowired
    HeroService hService;

    @RequestMapping(method=RequestMethod.POST,value="/hero")
    public void addHero(@RequestBody Hero hero) {
        hService.addHero(hero);
    }

    @RequestMapping(method=RequestMethod.GET,value="/hero/{id}")
    public Hero getHero(@PathVariable String id) {
        return hService.getHero(Integer.parseInt(id));
    }
}
