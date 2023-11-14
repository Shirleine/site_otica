package com.grupoprosaudi.oticaBomPreco.models;

import com.grupoprosaudi.oticaBomPreco.enums.QueryType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_queries")
public class Query extends AbstractModel {

    @NotNull
    @Column(name = "query_type", length = 15)
    @Enumerated(EnumType.STRING)
    private QueryType queryType;

    @NotEmpty
    @Column(name = "doctor", length = 100)
    private String doctor;

    @NotNull
    @Column(name = "date_time")
    private LocalDateTime dateTime;
}