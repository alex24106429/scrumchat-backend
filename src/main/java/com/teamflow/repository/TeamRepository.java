package com.teamflow.repository;

import com.teamflow.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TeamRepository extends JpaRepository<Team, UUID> {}
