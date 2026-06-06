package com.coding.agent.ai_application_builder.repository;

import aj.org.objectweb.asm.commons.Remapper;
import com.coding.agent.ai_application_builder.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlanRepository extends JpaRepository<Plan, Long> {
    Optional<Plan> findByStripePriceId(String id);
}
