package com.project.rescue.user;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;
    private String name;
    @Column(unique=true)
    private String email;
    private String Password;
    private String address;
    private String phone_number;
    private user_role role;
    private user_status status;

}
