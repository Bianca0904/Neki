package com.ProvaNeki.demo.Entidade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer skillId;


    @Column(name = "name")
    private String skillname;

    @Column(name = "version")
    private String skillVersion;

    @Column(name = "description")
    private String skillDescription;

    @Column(name = "image_url")
    private String skillImageUrl;


    public Skill() {
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    public String getSkillVersion() {
        return skillVersion;
    }

    public void setSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public String getSkillImageUrl() {
        return skillImageUrl;
    }

    public void setSkillImageUrl(String skillImageUrl) {
        this.skillImageUrl = skillImageUrl;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }
}