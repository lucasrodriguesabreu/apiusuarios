CREATE TABLE tb_user (
    id INT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(50) NOT NULL
);

INSERT INTO tb_user (id, nome, email, senha) VALUES (1, 'lucas', 'lucas@hotmail.com', '1234');