package com.italo.RainbowSix.repository;

import com.italo.RainbowSix.model.AgentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface AgentRepository extends  JpaRepository<AgentModel, UUID> {
     Optional<AgentModel> findByName(String name);
}
