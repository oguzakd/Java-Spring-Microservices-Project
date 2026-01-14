package com.oguzhanakduman.micro.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @jakarta.persistence.SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 50)
    private Long id;

    private String name;
    private String email;
    private String username;
    private String password;

}
