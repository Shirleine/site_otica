package com.grupoprosaudi.oticaBomPreco.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_measurements")
public class Measure extends AbstractModel {

    @NotNull
    @Column(name = "height")
    private Float height;

    @NotNull
    @Column(name = "width")
    private Float width;

    @NotNull
    @Column(name = "depth")
    private Float depth;
}
