package com.grupoprosaudi.oticaBomPreco.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_files")
public class File extends AbstractModel {

    @NotEmpty
    @Column(name = "name")
    private String name;
}