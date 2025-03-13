package com.scrumchat.repository;

import com.scrumchat.model.UserStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserStoryRepository extends JpaRepository<UserStory, UUID> {
}