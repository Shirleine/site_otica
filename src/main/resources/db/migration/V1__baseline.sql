CREATE TABLE tb_addresses
(
    id           UUID        NOT NULL,
    street       VARCHAR(100),
    number       VARCHAR(5),
    neighborhood VARCHAR(100),
    city         VARCHAR(100),
    state        VARCHAR(20) NOT NULL,
    cep          VARCHAR(8),
    CONSTRAINT pk_tb_addresses PRIMARY KEY (id)
);

CREATE TABLE tb_administrators
(
    id         UUID         NOT NULL,
    name       VARCHAR(100),
    email      VARCHAR(100) NOT NULL,
    password   VARCHAR(255),
    cpf        VARCHAR(11),
    birth_date date         NOT NULL,
    address    UUID         NOT NULL,
    CONSTRAINT pk_tb_administrators PRIMARY KEY (id)
);

CREATE TABLE tb_curriculums
(
    id    UUID NOT NULL,
    date  date NOT NULL,
    name  VARCHAR(100),
    email VARCHAR(100),
    file  UUID NOT NULL,
    CONSTRAINT pk_tb_curriculums PRIMARY KEY (id)
);

CREATE TABLE tb_doubts
(
    id       UUID NOT NULL,
    name     VARCHAR(100),
    email    VARCHAR(100),
    question TEXT,
    CONSTRAINT pk_tb_doubts PRIMARY KEY (id)
);

CREATE TABLE tb_files
(
    id   UUID NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_tb_files PRIMARY KEY (id)
);

CREATE TABLE tb_measurements
(
    id     UUID  NOT NULL,
    height FLOAT NOT NULL,
    width  FLOAT NOT NULL,
    depth  FLOAT NOT NULL,
    CONSTRAINT pk_tb_measurements PRIMARY KEY (id)
);

CREATE TABLE tb_products
(
    id          UUID        NOT NULL,
    name        VARCHAR(150),
    brand       VARCHAR(50),
    model       VARCHAR(50),
    colors      VARCHAR(100),
    material    VARCHAR(50),
    gender      VARCHAR(10) NOT NULL,
    measure     UUID        NOT NULL,
    reference   VARCHAR(255),
    description TEXT,
    CONSTRAINT pk_tb_products PRIMARY KEY (id)
);

CREATE TABLE tb_queries
(
    id         UUID                        NOT NULL,
    query_type VARCHAR(15)                 NOT NULL,
    doctor     VARCHAR(100),
    date_time  TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT pk_tb_queries PRIMARY KEY (id)
);

CREATE TABLE tb_questions
(
    id       UUID NOT NULL,
    category VARCHAR(100),
    question VARCHAR(255),
    answer   TEXT,
    CONSTRAINT pk_tb_questions PRIMARY KEY (id)
);

ALTER TABLE tb_administrators
    ADD CONSTRAINT FK_TB_ADMINISTRATORS_ON_ADDRESS FOREIGN KEY (address) REFERENCES tb_addresses (id);

ALTER TABLE tb_curriculums
    ADD CONSTRAINT FK_TB_CURRICULUMS_ON_FILE FOREIGN KEY (file) REFERENCES tb_files (id);

ALTER TABLE tb_products
    ADD CONSTRAINT FK_TB_PRODUCTS_ON_MEASURE FOREIGN KEY (measure) REFERENCES tb_measurements (id);