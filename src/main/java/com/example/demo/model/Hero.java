package com.example.demo.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String studio;

    @Column(name="powers")
    @ElementCollection(targetClass=Power.class)
    private List<Power> powers;

    private Hero(){
    }

    public Hero(String name, String studio) {
        this.name = name;
        this.studio = studio;
    }

    public List<Power> getPowers() {
        return powers;
    }

    public void setPowers(List<Power> powers) {
        this.powers = powers;
    }


}