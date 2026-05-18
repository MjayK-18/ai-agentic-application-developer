package com.coding.agent.ai_application_builder.repository;

import com.coding.agent.ai_application_builder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
