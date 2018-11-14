package com.example.demo.model;

public enum Power {

    Super_strength (1),
    Ability_to_fly (2),
    Durability (3),
    High_Tech_Weapons (4),
    God_Like_Strength (5),
    Speed (6),
    Agility (7);

    final int power;

    Power(int power){
        this.power=power;
    }

    public int getPower() {
        return power;
    }
}
