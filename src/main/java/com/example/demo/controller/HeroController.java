package com.example.demo.controller;

import com.example.demo.model.Hero;
import com.example.demo.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HeroController {

    private HeroRepository heroRepository;

    @Autowired
    public  HeroController(HeroRepository heroRepository){
        this.heroRepository=heroRepository;
    }


    @RequestMapping(value = "/hero",method = RequestMethod.GET)
    @ResponseBody
    public List<Hero> getHeroes(){
        return (List<Hero>) heroRepository.findAll();
    }


    @GetMapping("/hero/findById/{id}")
    @ResponseBody
    public Optional<Hero> listHeroById(@PathVariable(value = "id") Long id) {
        return heroRepository.findById(id);
    }

    @GetMapping("/hero/{name}")
    @ResponseBody
    public Hero listHeroByName(@PathVariable(value = "name") String name){
        Hero hero = heroRepository.findByName(name);
        return hero;
    }

    @RequestMapping(value = "/hero",method = RequestMethod.POST)
    @ResponseBody
    public void saveHero(@RequestBody Hero hero){
        heroRepository.save(hero);
    }


    @PostMapping("/delete/{id}")
    @ResponseBody
    public void deleteHero(@RequestBody Long id) {
         heroRepository.deleteById(id);
    }





}
