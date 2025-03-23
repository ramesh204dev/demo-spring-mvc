package com.ram.practice;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy =GenerationType.AUTO)
    private  Long id;
    private String name;
    private String email;
}
