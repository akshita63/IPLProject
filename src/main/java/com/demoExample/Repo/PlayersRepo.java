package com.demoExample.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoExample.Entity.PlayersEntity;

public interface PlayersRepo  extends JpaRepository<PlayersEntity, Integer>{

}
