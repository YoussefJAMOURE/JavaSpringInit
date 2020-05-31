package com.demo.demo.data.entitie;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "billionaires")
public class Billionaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String career;
}
