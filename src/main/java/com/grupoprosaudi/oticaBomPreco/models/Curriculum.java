package com.grupoprosaudi.oticaBomPreco.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_curriculums")
public class Curriculum extends AbstractModel {

    @NotNull
    @Column(name = "date")
    private LocalDate date;

    @NotEmpty
    @Column(name = "name", length = 100)
    private String name;

    @Email
    @Column(name = "email", length = 100)
    private String email;

    @NotNull
    @JoinColumn(name = "file")
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private File file;
}