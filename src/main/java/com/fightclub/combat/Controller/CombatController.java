package com.fightclub.combat.Controller;


import com.fightclub.combat.Model.Combat;
import com.fightclub.combat.Repository.CombatRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/combat")
public class CombatController {

    private final CombatRepo combatRepo;


    public CombatController(CombatRepo combatRepo){
        this.combatRepo = combatRepo;
    }


    @PostMapping("/addFighter")

    public Combat addCombatant(@RequestBody Combat combat){

        return combatRepo.save(combat);


    }

    @GetMapping("fetchAll")
    public List<Combat> getFighters(){

        return combatRepo.findAll();
    }
}
