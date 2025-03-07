-- liquibase formatted sql

--changeset Luiz:20250106-02-01
INSERT INTO users (name, user_name, email, password, phone_number, cpf, active, version, created_at)
VALUES ('ADMIN', 'admin', 'admin@exemplo.com',
        '$2a$10$lSrI2h./WOgFdyM7vkO9..gq50bfPluo0HyAHA7ySVldjaYCERMpu', '00000000000', '00000000000',true, 0, now());

-- changeset Luiz:20250106-02-02
INSERT INTO items (name, description, price, quantity, active, version, created_at)
VALUES
    ('BANANA', 'Banana', '3.00',  20 ,true,  0,now()),
    ('BOLACHA', 'Bolacha', '5.50', 20 , true, 0,now()),
    ('MACA', 'Maçã', '4.00', 20 , true, 0,now()),
    ('ARROZ', 'Arroz', '20.00', 20 , true, 0,now()),
    ('FEIJAO', 'Feijão', '15.00', 20 , true, 0,now()),
    ('LEITE', 'Leite', '4.50', 20 , true, 0,now()),
    ('PAO', 'Pão', '2.00', 20 , true, 0,now()),
    ('AZEITE', 'Azeite', '12.00', 20 , true, 0,now()),
    ('QUEIJO', 'Queijo', '25.00', 20 , true, 0,now()),
    ('MANTEIGA', 'Manteiga', '8.00',  20 ,false, 0,now()),
    ('CERVEJA', 'Cerveja', '3.00', 20 , true, 0,now()),
    ('SABONETE', 'Sabonete', '1.50', 20 , true, 0,now()),
    ('DESINFETANTE', 'Desinfetante', '5.00', 20 , true, 0,now()),
    ('LIMAO', 'Limão', '2.00', 20 , true, 0,now()),
    ('CENOURA', 'Cenoura', '3.00', 20 , true, 0,now()),
    ('BATATA', 'Batata', '4.00',  20 ,false, 0,now()),
    ('ALFACE', 'Alface', '3.50', 20 , true, 0,now()),
    ('TOMATE', 'Tomate', '6.00', 20 , true, 0,now()),
    ('PEITO DE FRANGO', 'Peito de Frango', '20.00',  20 ,false, 0,now()),
    ('CARNE MOIDA', 'Carne Moída', '25.00', 20 , true, 0,now()),
    ('LINGUIÇA', 'Linguiça', '15.00', 20 , true, 0,now()),
    ('OVO', 'Ovo', '8.00', 20 , true, 0,now()),
    ('AÇUCAR', 'Açúcar', '5.00', 20 , true, 0,now()),
    ('CACHORRO QUENTE', 'Cachorro Quente', '10.00', 20 , true, 0,now()),
    ('PIZZA', 'Pizza', '30.00', 20 , true, 0,now()),
    ('HAMBURGUER', 'Hamburguer', '12.00', 20 , true, 0,now()),
    ('BATATA FRITA', 'Batata Frita', '8.00', 20 , true, 0,now()),
    ('MAIONESE', 'Maionese', '4.50', 20 , true, 0,now()),
    ('KETCHUP', 'Ketchup', '3.00', 20 , true, 0,now()),
    ('MUSTARDA', 'Mostarda', '3.00', 20 , true, 0,now()),
    ('ALHO', 'Alho', '5.00', 20 , true, 0,now()),
    ('CEBOLA', 'Cebola', '4.00', 20 , true, 0,now()),
    ('REQUEIJÃO', 'Requeijão', '8.00', 20 , true, 0,now()),
    ('CREME DE LEITE', 'Creme de leite', '6.00', 20 , true, 0,now()),
    ('YOGURTE', 'Iogurte', '5.00',  20 ,false, 0,now()),
    ('BEBIDA ENERGÉTICA', 'Bebida Energética', '7.00', 20 , true, 0,now()),
    ('AGUA', 'Água', '1.00', 20 , true, 0,now()),
    ('JUIZA', 'Suco', '4.00', 20 , true, 0,now()),
    ('PRESUNTO', 'Presunto', '12.00', 20 , true, 0,now()),
    ('TUBO DE CREME', 'Creme Dental', '3.00', 20 , true, 0,now()),
    ('DESODORANTE', 'Desodorante', '8.00', 20 , true, 0,now()),
    ('XAMPU', 'Shampoo', '10.00', 20 , true, 0,now()),
    ('CONDICIONADOR', 'Condicionador', '9.00', 20 , true, 0,now()),
    ('BALDE', 'Balde', '15.00', 20 , true, 0,now()),
    ('ESFREGÃO', 'Esfregão', '7.00', 20 , true, 0,now()),
    ('VASSOURA', 'Vassoura', '10.00', 20 , true, 0,now()),
    ('RODO', 'Rodo', '6.00', 20 , true, 0,now()),
    ('PANO DE CHÃO', 'Pano de Chão', '5.00', 20 , true, 0,now()),
    ('LIMPADOR', 'Limpador', '4.00', 20 , true, 0,now()),
    ('MOPA', 'Mopa', '18.00',  20 ,false, 0,now()),
    ('LIXO', 'Lixeira', '12.00', 20 , true, 0,now()),
    ('PASTA DE DENTES', 'Pasta de Dentes', '4.00', 20 , true, 0,now()),
    ('LIMPEZA', 'Produtos de Limpeza', '20.00', 20 , true, 0,now()),
    ('CALCIO', 'Suplemento de Cálcio', '25.00', 20 , true, 0,now()),
    ('VITAMINA C', 'Vitamina C', '18.00', 20 , true, 0,now()),
    ('GASES', 'Gás', '60.00',  20 ,false, 0,now()),
    ('PAPEL HIGIENICO', 'Papel Higiênico', '15.00', 20 , true, 0,now()),
    ('TOALHA DE PAPEL', 'Toalha de Papel', '10.00', 20 , true, 0,now()),
    ('GUARDANAPO', 'Guardanapo', '3.00', 20 , true, 0,now()),
    ('LIMPADOR DE VIDRO', 'Limpador de Vidro', '6.00', 20 , true, 0,now()),
    ('PIROGA', 'Pizza Piroga', '28.00', 20 , true, 0,now()),
    ('BATATA DOCE', 'Batata Doce', '6.00', 20 , true, 0,now()),
    ('FEIJAO PRETO', 'Feijão Preto', '18.00', 20 , true, 0,now()),
    ('FEIJAO BRANCO', 'Feijão Branco', '17.00', 20 , true, 0,now()),
    ('CENTEIO', 'Centeio', '20.00', 20 , true, 0,now()),
    ('ALMEIRIM', 'Almeirim', '12.00', 20 , true, 0,now()),
    ('MOLHO', 'Molho', '4.50', 20 , true, 0,now()),
    ('PIPOCAS', 'Pipocas', '5.50', 20 , true, 0,now()),
    ('CHOCOLATE', 'Chocolate', '9.00', 20 , true, 0,now()),
    ('DOCE', 'Doce', '6.50', 20 , true, 0,now()),
    ('BISCOITO', 'Biscoito', '4.00', 20 , true, 0,now()),
    ('PRATO', 'Prato', '2.00', 20 , true, 0,now()),
    ('GARRAFA', 'Garrafa', '3.00', 20 , true, 0,now()),
    ('MESA', 'Mesa', '50.00', 20 , true, 0,now()),
    ('CADEIRA', 'Cadeira', '40.00', 20 , true, 0,now()),
    ('SOFA', 'Sofá', '250.00', 20 , true, 0,now()),
    ('GUARDARROPA', 'Guarda-roupa', '350.00', 20 , true, 0,now()),
    ('CAMA', 'Cama', '300.00', 20 , true, 0,now()),
    ('PISO', 'Piso', '70.00',  20 ,false, 0,now()),
    ('LAMPADEIRO', 'Lâmpada', '5.00', 20 , true, 0,now()),
    ('TAPETE', 'Tapete', '30.00', 20 , true, 0,now()),
    ('JOGO DE CAMA', 'Jogo de Cama', '80.00', 20 , true, 0,now()),
    ('TACO', 'Taco', '6.00', 20 , true, 0,now()),
    ('JOGO DE TALHERES', 'Jogo de Talheres', '15.00', 20 , true, 0,now()),
    ('TAÇA', 'Taça', '10.00', 20 , true, 0,now()),
    ('VITRINE', 'Vitrine', '100.00', 20 , true, 0,now()),
    ('BRINQUEDO', 'Brinquedo', '20.00', 20 , true, 0,now()),
    ('LIVRO', 'Livro', '30.00', 20 , true, 0,now()),
    ('REVISTA', 'Revista', '7.00', 20 , true, 0,now()),
    ('CADERNO', 'Caderno', '10.00', 20 , true, 0,now()),
    ('CANETA', 'Caneta', '2.00', 20 , true, 0,now()),
    ('LAPIS', 'Lápis', '1.50', 20 , true, 0,now()),
    ('BORRACHA', 'Borracha', '1.00', 20 , true, 0,now()),
    ('FITA', 'Fita', '4.00', 20 , true, 0,now()),
    ('ESTOJO', 'Estojo', '8.00', 20 , true, 0,now()),
    ('MOCHILA', 'Mochila', '40.00', 20 , true, 0,now()),
    ('CELULAR', 'Celular', '1200.00', 20 , true, 0,now()),
    ('TELEVISÃO', 'Televisão', '1500.00', 20 , true, 0,now()),
    ('NOTEBOOK', 'Notebook', '2500.00', 20 , true, 0,now()),
    ('CARREGADOR', 'Carregador', '50.00', 20 , true, 0,now()),
    ('FONE DE OUVIDO', 'Fone de Ouvido', '80.00', 20 , true, 0,now()),
    ('MOUSE', 'Mouse', '20.00', 20 , true, 0,now()),
    ('TECLADO', 'Teclado', '30.00', 20 , true, 0,now());

-- changeset Luiz:20250106-02-03
INSERT INTO suppliers (name, cnpj, address, phone, email, active, version, created_at)
VALUES
    ('SUPERMERCADO OLIVEIRA', '01234567000189', 'Rua das Flores, 123, Sao Paulo - SP', '11987654321', 'contato@oliveira.com.br', true, 1, now()),
    ('DISTRIBUIDORA MARTINS', '11234567000145', 'Av. Central, 987, Rio de Janeiro - RJ', '21985473210', 'vendas@martinsdistribuidora.com', true, 1, now()),
    ('FARMACIA SAUDE', '21234567000178', 'Rua da Saude, 345, Salvador - BA', '71912345678', 'farmacia@saude.com.br', true, 1, now()),
    ('CONSTRUTORA ROCHA', '31234567000156', 'Av. dos Trabalhadores, 120, Belo Horizonte - MG', '31923456789', 'contato@rocha.com.br', true, 1, now()),
    ('MERCADO PONTO CERTO', '41234567000167', 'Rua das Palmeiras, 450, Recife - PE', '81987654321', 'contato@pontocerto.com', false, 1, now()),
    ('PANIFICADORA UNIAO', '51234567000123', 'Av. Brasil, 987, Fortaleza - CE', '85912345678', 'vendas@uniaopanificadora.com', true, 1, now()),
    ('ATACADAO DO NORTE', '61234567000154', 'Rua Amazonas, 200, Manaus - AM', '92998765432', 'contato@atacadaodonorte.com', true, 1, now()),
    ('LIVRARIA CENTRAL', '71234567000189', 'Rua do Comercio, 300, Curitiba - PR', '41987654321', 'vendas@livrariacentral.com', false, 1, now()),
    ('PAPELARIA ESTRELA', '81234567000145', 'Av. dos Estudantes, 234, Porto Alegre - RS', '51912345678', 'contato@estrela.com', true, 1, now()),
    ('ELETRONICOS SILVA', '91234567000178', 'Rua das Industrias, 456, Florianopolis - SC', '48987654321', 'suporte@eletronicossilva.com', true, 1, now()),
    ('SUPERMERCADO LUZ', '11234567000112', 'Av. Principal, 789, Natal - RN', '84912345678', 'contato@supermercadoluz.com', false, 1, now()),
    ('DISTRIBUIDORA ABC', '21234567000134', 'Rua do Progresso, 123, Teresina - PI', '86987654321', 'vendas@abcdistribuidora.com', true, 1, now()),
    ('FARMACIA POPULAR', '31234567000167', 'Av. Joao Pessoa, 567, Belem - PA', '91912345678', 'farmacia@popular.com.br', true, 1, now()),
    ('CONSTRUTORA ALMEIDA', '41234567000189', 'Rua das Acacias, 789, Goiania - GO', '62987654321', 'contato@almeidaconstrutora.com', false, 1, now()),
    ('PANIFICADORA DOCE SABOR', '51234567000145', 'Av. Santa Luzia, 345, Campo Grande - MS', '67912345678', 'vendas@docesabor.com', true, 1, now()),
    ('ATACADISTA SUL', '61234567000178', 'Rua das Hortensias, 890, Blumenau - SC', '47987654321', 'contato@sulatacadista.com', true, 1, now()),
    ('LIVRARIA DO ESTUDANTE', '71234567000156', 'Av. Independencia, 1234, Vitoria - ES', '27912345678', 'vendas@livrariadoestudante.com', true, 1, now()),
    ('PAPELARIA ESCOLAR', '81234567000123', 'Rua do Aprendizado, 567, Aracaju - SE', '79987654321', 'contato@escolar.com', true, 1, now()),
    ('ELETRONICOS RIBEIRO', '91234567000134', 'Av. Rio Branco, 890, Joao Pessoa - PB', '83912345678', 'suporte@ribeiroeletronicos.com', true, 1, now()),
    ('SUPERMERCADO ESPERANCA', '01234567000178', 'Rua da Paz, 456, Maceio - AL', '82987654321', 'contato@superesperanca.com', false, 1, now()),
    ('DISTRIBUIDORA VITORIA', '11234567000156', 'Av. das Nacoes, 345, Sao Luis - MA', '98912345678', 'vendas@distribuidoravitoria.com', true, 1, now()),
    ('FARMACIA BEM ESTAR', '21234567000123', 'Rua do Sossego, 123, Boa Vista - RR', '95987654321', 'farmacia@bemestar.com', true, 1, now()),
    ('CONSTRUTORA BETA', '31234567000145', 'Av. das Construcoes, 567, Palmas - TO', '63912345678', 'contato@betaconstrutora.com', true, 1, now()),
    ('PANIFICADORA DO NORTE', '41234567000178', 'Rua do Trigo, 890, Macapa - AP', '96987654321', 'vendas@panificadora.com', false, 1, now()),
    ('ATACADISTA ALPHA', '51234567000156', 'Av. Brasil, 234, Rio Branco - AC', '68912345678', 'contato@alphaatacadista.com', true, 1, now());


