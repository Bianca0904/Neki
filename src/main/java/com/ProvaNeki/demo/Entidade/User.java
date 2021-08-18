package com.ProvaNeki.demo.Entidade;


import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer userId;

    @Column(name = "login")
    private String username;

    @Column(name = "password")
    private String senha;

    @Column(name = "last_login_date")
    private Calendar ultimoLogin;

    @OneToMany(mappedBy =  "user")
    private List<UserSkill> listUserSkill;

}
