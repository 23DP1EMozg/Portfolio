package com.edvards.portfolio.repos;

import com.edvards.portfolio.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepo extends JpaRepository<Experience, Long> {
}
