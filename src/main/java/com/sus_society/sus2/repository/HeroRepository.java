package com.sus_society.sus2.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.sus_society.sus2.model.Hero;

public interface HeroRepository extends CrudRepository<Hero, Integer> {

    public List<Hero> findByName(String name);
}
