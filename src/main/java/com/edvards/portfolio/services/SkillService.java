package com.edvards.portfolio.services;

import com.edvards.portfolio.models.Skill;
import com.edvards.portfolio.repos.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepo skillRepo;
    @Autowired
    public SkillService(SkillRepo skillRepo){
        this.skillRepo = skillRepo;
    }
    public void addSkill(Skill skill){
        skillRepo.save(skill);
    }

    public List<Skill> getSkills(){
        return skillRepo.findAll();
    }

    public void removeSkill(Long id){
        skillRepo.deleteById(id);
    }
}
