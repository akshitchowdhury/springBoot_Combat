package com.fightclub.combat.Repository;

import com.fightclub.combat.Model.Wrestling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WrestlingRepo extends JpaRepository<Wrestling, Long> {
}
