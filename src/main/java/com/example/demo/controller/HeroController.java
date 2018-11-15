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


    @GetMapping("/hero/{id}")
    @ResponseBody
    public List<Hero> listHeroById(@PathVariable Long id) {
        return (List<Hero>) heroRepository.findAllById(id);
    }

    @GetMapping("hero/{name}")
    @ResponseBody
    public Optional<Hero> listHeroByName(@PathVariable String name){ return heroRepository.findHeroByName(name);}




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
