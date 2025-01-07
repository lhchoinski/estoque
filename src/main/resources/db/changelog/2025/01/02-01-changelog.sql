-- liquibase formatted sql

--changeset Luiz:20250106-02-01
INSERT INTO users (name, user_name, email, password, phone_number, cpf, active)
VALUES ('ADMIN', 'admin', 'admin@exemplo.com',
        '$2a$10$lSrI2h./WOgFdyM7vkO9..gq50bfPluo0HyAHA7ySVldjaYCERMpu', '00000000000', '00000000000',true);

-- changeset Luiz:20250106-02-02
INSERT INTO items (name, description, price, active)
VALUES
    ('BANANA', 'Banana', '3.00', true),
    ('BOLACHA', 'Bolacha', '5.50', true),
    ('MACA', 'Maçã', '4.00', true),
    ('ARROZ', 'Arroz', '20.00', true),
    ('FEIJAO', 'Feijão', '15.00', true),
    ('LEITE', 'Leite', '4.50', true),
    ('PAO', 'Pão', '2.00', true),
    ('AZEITE', 'Azeite', '12.00', true),
    ('QUEIJO', 'Queijo', '25.00', true),
    ('MANTEIGA', 'Manteiga', '8.00', false),
    ('CERVEJA', 'Cerveja', '3.00', true),
    ('SABONETE', 'Sabonete', '1.50', true),
    ('DESINFETANTE', 'Desinfetante', '5.00', true),
    ('LIMAO', 'Limão', '2.00', true),
    ('CENOURA', 'Cenoura', '3.00', true),
    ('BATATA', 'Batata', '4.00', false),
    ('ALFACE', 'Alface', '3.50', true),
    ('TOMATE', 'Tomate', '6.00', true),
    ('PEITO DE FRANGO', 'Peito de Frango', '20.00', false),
    ('CARNE MOIDA', 'Carne Moída', '25.00', true),
    ('LINGUIÇA', 'Linguiça', '15.00', true),
    ('OVO', 'Ovo', '8.00', true),
    ('AÇUCAR', 'Açúcar', '5.00', true),
    ('CACHORRO QUENTE', 'Cachorro Quente', '10.00', true),
    ('PIZZA', 'Pizza', '30.00', true),
    ('HAMBURGUER', 'Hamburguer', '12.00', true),
    ('BATATA FRITA', 'Batata Frita', '8.00', true),
    ('MAIONESE', 'Maionese', '4.50', true),
    ('KETCHUP', 'Ketchup', '3.00', true),
    ('MUSTARDA', 'Mostarda', '3.00', true),
    ('ALHO', 'Alho', '5.00', true),
    ('CEBOLA', 'Cebola', '4.00', true),
    ('REQUEIJÃO', 'Requeijão', '8.00', true),
    ('CREME DE LEITE', 'Creme de leite', '6.00', true),
    ('YOGURTE', 'Iogurte', '5.00', false),
    ('BEBIDA ENERGÉTICA', 'Bebida Energética', '7.00', true),
    ('AGUA', 'Água', '1.00', true),
    ('JUIZA', 'Suco', '4.00', true),
    ('PRESUNTO', 'Presunto', '12.00', true),
    ('TUBO DE CREME', 'Creme Dental', '3.00', true),
    ('DESODORANTE', 'Desodorante', '8.00', true),
    ('XAMPU', 'Shampoo', '10.00', true),
    ('CONDICIONADOR', 'Condicionador', '9.00', true),
    ('BALDE', 'Balde', '15.00', true),
    ('ESFREGÃO', 'Esfregão', '7.00', true),
    ('VASSOURA', 'Vassoura', '10.00', true),
    ('RODO', 'Rodo', '6.00', true),
    ('PANO DE CHÃO', 'Pano de Chão', '5.00', true),
    ('LIMPADOR', 'Limpador', '4.00', true),
    ('MOPA', 'Mopa', '18.00', false),
    ('LIXO', 'Lixeira', '12.00', true),
    ('PASTA DE DENTES', 'Pasta de Dentes', '4.00', true),
    ('LIMPEZA', 'Produtos de Limpeza', '20.00', true),
    ('CALCIO', 'Suplemento de Cálcio', '25.00', true),
    ('VITAMINA C', 'Vitamina C', '18.00', true),
    ('GASES', 'Gás', '60.00', false),
    ('PAPEL HIGIENICO', 'Papel Higiênico', '15.00', true),
    ('TOALHA DE PAPEL', 'Toalha de Papel', '10.00', true),
    ('GUARDANAPO', 'Guardanapo', '3.00', true),
    ('LIMPADOR DE VIDRO', 'Limpador de Vidro', '6.00', true),
    ('PIROGA', 'Pizza Piroga', '28.00', true),
    ('BATATA DOCE', 'Batata Doce', '6.00', true),
    ('FEIJAO PRETO', 'Feijão Preto', '18.00', true),
    ('FEIJAO BRANCO', 'Feijão Branco', '17.00', true),
    ('CENTEIO', 'Centeio', '20.00', true),
    ('ALMEIRIM', 'Almeirim', '12.00', true),
    ('MOLHO', 'Molho', '4.50', true),
    ('PIPOCAS', 'Pipocas', '5.50', true),
    ('CHOCOLATE', 'Chocolate', '9.00', true),
    ('DOCE', 'Doce', '6.50', true),
    ('BISCOITO', 'Biscoito', '4.00', true),
    ('PRATO', 'Prato', '2.00', true),
    ('GARRAFA', 'Garrafa', '3.00', true),
    ('MESA', 'Mesa', '50.00', true),
    ('CADEIRA', 'Cadeira', '40.00', true),
    ('SOFA', 'Sofá', '250.00', true),
    ('GUARDARROPA', 'Guarda-roupa', '350.00', true),
    ('CAMA', 'Cama', '300.00', true),
    ('PISO', 'Piso', '70.00', false),
    ('LAMPADEIRO', 'Lâmpada', '5.00', true),
    ('TAPETE', 'Tapete', '30.00', true),
    ('JOGO DE CAMA', 'Jogo de Cama', '80.00', true),
    ('TACO', 'Taco', '6.00', true),
    ('JOGO DE TALHERES', 'Jogo de Talheres', '15.00', true),
    ('TAÇA', 'Taça', '10.00', true),
    ('VITRINE', 'Vitrine', '100.00', true),
    ('BRINQUEDO', 'Brinquedo', '20.00', true),
    ('LIVRO', 'Livro', '30.00', true),
    ('REVISTA', 'Revista', '7.00', true),
    ('CADERNO', 'Caderno', '10.00', true),
    ('CANETA', 'Caneta', '2.00', true),
    ('LAPIS', 'Lápis', '1.50', true),
    ('BORRACHA', 'Borracha', '1.00', true),
    ('FITA', 'Fita', '4.00', true),
    ('ESTOJO', 'Estojo', '8.00', true),
    ('MOCHILA', 'Mochila', '40.00', true),
    ('CELULAR', 'Celular', '1200.00', true),
    ('TELEVISÃO', 'Televisão', '1500.00', true),
    ('NOTEBOOK', 'Notebook', '2500.00', true),
    ('CARREGADOR', 'Carregador', '50.00', true),
    ('FONE DE OUVIDO', 'Fone de Ouvido', '80.00', true),
    ('MOUSE', 'Mouse', '20.00', true),
    ('TECLADO', 'Teclado', '30.00', true);
