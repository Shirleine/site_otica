package com.grupoprosaudi.oticaBomPreco.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "tb_doubts")
public class Doubt extends AbstractModel {

    @NotEmpty
    @Column(name = "name", length = 100)
    private String name;

    @Email
    @Column(name = "email", length = 100)
    private String email;

    @NotEmpty
    @Column(name = "question", columnDefinition = "TEXT")
    private String question;
}