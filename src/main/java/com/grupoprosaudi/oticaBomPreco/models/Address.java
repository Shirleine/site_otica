package com.grupoprosaudi.oticaBomPreco.models;

import com.grupoprosaudi.oticaBomPreco.enums.State;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_addresses")
public class Address extends AbstractModel {

    @NotEmpty
    @Column(name = "street", length = 100)
    private String street;

    @NotEmpty
    @Column(name = "number", length = 5)
    private String number;

    @NotEmpty
    @Column(name = "neighborhood", length = 100)
    private String neighborhood;

    @NotEmpty
    @Column(name = "city", length = 100)
    private String city;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "state", length = 20)
    private State state;

    @NotEmpty
    @Column(name = "cep", length = 8)
    private String cep;
}