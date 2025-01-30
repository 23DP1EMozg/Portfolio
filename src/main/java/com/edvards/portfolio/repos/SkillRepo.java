package com.edvards.portfolio.repos;

import com.edvards.portfolio.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill, Long> {
}
