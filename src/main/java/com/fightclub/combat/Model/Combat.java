package com.fightclub.combat.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Combat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String fighterName;
    private String weightClass;
    private Double weight;

}
