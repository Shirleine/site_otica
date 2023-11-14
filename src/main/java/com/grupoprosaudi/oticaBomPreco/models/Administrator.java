package com.grupoprosaudi.oticaBomPreco.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_administrators")
public class Administrator extends AbstractModel {

    @NotEmpty
    @Column(name = "name", length = 100)
    private String name;

    @Email
    @NotNull
    @Column(name = "email", length = 100)
    private String email;

    @NotEmpty
    @Column(name = "password")
    private String password;

    @CPF
    @Column(name = "cpf", length = 11)
    private String cpf;

    @NotNull
    @Column(name = "birth_date")
    private LocalDate birthDate;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "address")
    private Address address;
}
