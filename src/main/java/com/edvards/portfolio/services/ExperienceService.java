package com.edvards.portfolio.services;

import com.edvards.portfolio.models.Experience;
import com.edvards.portfolio.repos.ExperienceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    private final ExperienceRepo experienceRepo;
    @Autowired
    public ExperienceService(ExperienceRepo experienceRepo){
        this.experienceRepo = experienceRepo;
    }

    public void addExperience(Experience experience){
        experienceRepo.save(experience);
    }

    public List<Experience> getAllExperiences(){
        return experienceRepo.findAll();
    }

    public void removeExperience(Long id){
        experienceRepo.deleteById(id);
    }
}
