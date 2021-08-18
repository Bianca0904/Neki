package com.ProvaNeki.demo.Servicos;

import com.ProvaNeki.demo.Entidade.Skill;
import com.ProvaNeki.demo.Repositorio.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;


    public List<Skill> findAllSkill() {
        return skillRepository.findAll();
    }

    public Skill adicionar(Skill skill) {
        skill.setSkillId(null);
       return skillRepository.save(skill);
    }
}







