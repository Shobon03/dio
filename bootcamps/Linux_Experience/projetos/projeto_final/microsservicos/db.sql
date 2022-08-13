CREATE DATABASE microsservicos_dio;

USE microsservicos_dio;

CREATE TABLE usuario (
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(50) NULL,
    sobrenome varchar(50) NULL,
    data_nascimento varchar(10) NULL,
    pais varchar(50) NULL,
    PRIMARY KEY (id)
);