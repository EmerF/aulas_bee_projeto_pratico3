CREATE TABLE IF NOT EXISTS produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    descricao VARCHAR(100),
    preco double
    );

INSERT INTO produtos (nome, descricao, preco) VALUES
    ('agua com gás', 'Agua', '5.0');