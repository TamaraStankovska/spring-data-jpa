package com.example.demo.repository;

import com.example.demo.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HeroJdbcRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Hero findByName(String name) {
        return jdbcTemplate.queryForObject("select name,id from hero where name='Iron Man'", new Object[] { name },
                new BeanPropertyRowMapper<Hero>(Hero.class));
    }
}
