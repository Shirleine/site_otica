package com.grupoprosaudi.oticaBomPreco.models;

import com.grupoprosaudi.oticaBomPreco.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_products")
public class Product extends AbstractModel {

    @NotEmpty
    @Column(name = "name", length = 150)
    private String name;

    @NotEmpty
    @Column(name = "brand", length = 50)
    private String brand;

    @NotEmpty
    @Column(name = "model", length = 50)
    private String model;

    @NotEmpty
    @Column(name = "colors", length = 100)
    private String colors;

    @NotEmpty
    @Column(name = "material", length = 50)
    private String material;

    @NotNull
    @Column(name = "gender", length = 10)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull
    @JoinColumn(name = "measure")
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Measure measure;

    /** Perguntar o que é essa referência */
    @NotEmpty
    @Column(name = "reference")
    private String reference;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
}