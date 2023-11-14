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
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_questions")
public class Question extends AbstractModel {

    @NotEmpty
    @Column(name = "category", length = 100)
    private String category;

    @NotEmpty
    @Column(name = "question", length = 255)
    private String question;

    @NotEmpty
    @Column(name = "answer", columnDefinition = "TEXT")
    private String answer;
}
