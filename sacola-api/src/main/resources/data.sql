INSERT INTO tb_restaurante (id, cep, complemento, nome) VALUES
(1L, '0000001', 'Complemento endereço restaurante 1', 'Restaurante 1'),
(2L, '0000002', 'Complemento endereço restaurante 2', 'Restaurante 2');

INSERT INTO tb_cliente (id, cep, complemento, nome) VALUES
(1L, '0000001', 'Complemento endereço cliente 1', 'Cliente 1');

INSERT INTO tb_produto (id, disponivel, nome, valor_unitario, restaurante_id) VALUES
(1L, true, 'Produto 1', 5.0, 1L),
(2L, true, 'Produto 2', 3.0, 1L),
(3L, true, 'Produto 3', 8.0, 2L);

INSERT INTO tb_sacola (id, forma_pagamento, fechada, valor_total, cliente_id) VALUES
(1L, 0, false, 0.0, 1L); 