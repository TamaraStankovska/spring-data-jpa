package com.example.demo;

import com.example.demo.model.Hero;
import com.example.demo.model.Power;
import com.example.demo.repository.HeroJdbcRepository;
import com.example.demo.repository.HeroRepository;
import org.h2.command.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}




	@Bean
	CommandLineRunner runner(HeroRepository heroRepository){
		return args -> {

			Hero heroMale=new Hero("Iron Man","Marvel");
			List<Power> powers=new ArrayList<>();
			powers.add(Power.Super_strength);
			powers.add(Power.Ability_to_fly);
			powers.add(Power.Durability);
			powers.add(Power.High_Tech_Weapons);
			heroMale.setPowers(powers);

			heroRepository.save(heroMale);

			Hero heroFemale=new Hero("Wonder Woman","DC");
			List<Power> powerList=new ArrayList<>();
			powerList.add(Power.God_Like_Strength);
			powerList.add(Power.Speed);
			powerList.add(Power.Agility);
			heroFemale.setPowers(powerList);

			heroRepository.save(heroFemale);

		};
	}
}
