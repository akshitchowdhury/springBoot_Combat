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

    public List<Combat> addCombatant(@RequestBody List<Combat> combat){

        return combatRepo.saveAll(combat);


    }

    @GetMapping("fetchAll")
    public List<Combat> getFighters(){

        return combatRepo.findAll();
    }

    @GetMapping("fetchMidWeights")

    public List<Combat> getMidWeights(){

List<Combat> allFighters = combatRepo.findAll();

   return allFighters.stream()
                .filter(fighter -> fighter.getWeight() >= 75)
                .toList();
    }


    @GetMapping("fetchLightWeights")

    public List<Combat> getLightWeights(){

        List<Combat> allFighters = combatRepo.findAll();

      return  allFighters.stream().filter(fighter-> fighter.getWeight() <=70).toList();
    }

}
