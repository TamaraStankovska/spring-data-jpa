package com.example.demo.repository;

import com.example.demo.model.Hero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface HeroRepository extends CrudRepository<Hero,Long> {
    List<Hero> findAllById(Long id);

    @Query("SELECT h.id, h.name FROM Hero h where h.name = :name")
    Optional<Hero> findHeroByName(@Param("name") String name);

}
