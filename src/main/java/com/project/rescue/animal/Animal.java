package com.project.rescue.animal;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Animal {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String species;
private Long age ;
private Long Weight ;
private String color ;
private String Gender;
private String description ;


}
