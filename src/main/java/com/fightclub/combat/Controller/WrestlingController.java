package com.fightclub.combat.Controller;


import com.fightclub.combat.Model.Wrestling;
import com.fightclub.combat.Repository.WrestlingRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wrestling")
public class WrestlingController {

private final WrestlingRepo wrestlingRepo;


public WrestlingController(WrestlingRepo wrestlingRepo){
    this.wrestlingRepo = wrestlingRepo;
}


@PostMapping("addAllWrestlers")

    public List<Wrestling> addWrestler(@RequestBody List<Wrestling> wrestling){

    return wrestlingRepo.saveAll(wrestling);
}

@GetMapping("fetchWrestlers")

    public List<Wrestling> getWrestlers(){

    return wrestlingRepo.findAll();


}


}
