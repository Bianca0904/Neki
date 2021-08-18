package com.ProvaNeki.demo.Controlador;

import com.ProvaNeki.demo.Entidade.Skill;
import com.ProvaNeki.demo.Servicos.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public ResponseEntity<List<Skill>> findAll() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<List<Skill>>(skillService.findAllSkill(), headers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Skill> adicionar(@RequestBody Skill skill) {
        return new ResponseEntity<Skill>(this.skillService.adicionar(skill), HttpStatus.CREATED);
    }

}

