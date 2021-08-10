package com.epam.training.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class  User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}