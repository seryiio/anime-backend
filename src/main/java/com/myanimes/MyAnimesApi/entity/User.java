package com.myanimes.MyAnimesApi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;
    private String email;

    @Column(name = "register_data")
    private Date registerData;
}
