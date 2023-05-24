package com.sus_society.sus2.service;

import com.sus_society.sus2.repository.HeroRepository;
import org.springframework.stereotype.Service;

import com.sus_society.sus2.model.Hero;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class HeroService {
    @Autowired
    HeroRepository hRepository;
    public void addHero(Hero h) {
        Hero createdHero=hRepository.save(h);
        System.out.println(createdHero);
    }

    public Hero getHero(int id) {
        Optional<Hero> hOpt =hRepository.findById(id);
        return hOpt.orElse(null);
    }
}
