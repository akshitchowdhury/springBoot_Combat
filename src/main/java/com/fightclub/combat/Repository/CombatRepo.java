package com.fightclub.combat.Repository;

import com.fightclub.combat.Model.Combat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CombatRepo extends JpaRepository<Combat, Long> {
}
