package com.project.rescue.rescuer;

import com.project.rescue.user.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rescuer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;
    @ManyToOne(fetch =FetchType.LAZY )
    private User user;
    private type_rescuer type;

}
