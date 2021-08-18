package com.ProvaNeki.demo.Entidade;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "userSkill")
public class UserSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Integer userSkillId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "knowledge_level")
    private Integer nivelConhecimento;

    @Column(name = "created_at")
    private Timestamp criadoEm;

    @Column(name = "updated_at")
    private Timestamp atualizadoEm;


}
