-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13/12/2023 às 00:17
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projeto_final`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

CREATE TABLE `clientes` (
  `codCliente` int(11) NOT NULL,
  `fk_Cpf` bigint(11) NOT NULL,
  `qntPedidos` int(11) DEFAULT NULL,
  `divida` float DEFAULT NULL,
  `credito` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `clientes`
--

INSERT INTO `clientes` (`codCliente`, `fk_Cpf`, `qntPedidos`, `divida`, `credito`) VALUES
(1, 99988888, 0, 0, 0),
(2, 220034010, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedidos`
--

CREATE TABLE `pedidos` (
  `codPedido` int(11) NOT NULL,
  `qtd_produto` float NOT NULL,
  `valor_produtos` float NOT NULL,
  `entrega` date DEFAULT NULL,
  `pagamento` tinyint(1) DEFAULT NULL,
  `data_pagamento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pedidos`
--

INSERT INTO `pedidos` (`codPedido`, `qtd_produto`, `valor_produtos`, `entrega`, `pagamento`, `data_pagamento`) VALUES
(1, 3, 30, NULL, NULL, NULL),
(2, 2, 20, NULL, NULL, NULL),
(3, 2, 20, NULL, NULL, NULL),
(4, 7, 70, NULL, NULL, NULL),
(5, 0, 0, NULL, NULL, NULL),
(6, 2, 20, NULL, NULL, NULL),
(7, 3, 30, NULL, NULL, NULL),
(8, 3, 30, NULL, NULL, NULL),
(9, 4, 40, NULL, NULL, NULL),
(10, 4, 40, NULL, NULL, NULL),
(11, 9, 90, NULL, NULL, NULL),
(12, 4, 40, NULL, NULL, NULL),
(13, 3, 30, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedido_cliente`
--

CREATE TABLE `pedido_cliente` (
  `fk_codPedido` int(11) NOT NULL,
  `fk_codCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `pessoas`
--

CREATE TABLE `pessoas` (
  `cpf` bigint(20) NOT NULL,
  `rg` bigint(20) NOT NULL,
  `nome` text DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `numero` int(6) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL,
  `telefone` bigint(20) DEFAULT NULL,
  `ativo` char(1) DEFAULT NULL,
  `obs` text DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `apto` int(4) DEFAULT NULL,
  `cep` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pessoas`
--

INSERT INTO `pessoas` (`cpf`, `rg`, `nome`, `endereco`, `numero`, `estado`, `telefone`, `ativo`, `obs`, `bairro`, `cidade`, `apto`, `cep`) VALUES
(99988888, 99900088, 'Marcio', 'Travessa rio branco', 32, 'RS', 9999999, '0', 'TESTE', 'sulbrasileiro', NULL, 0, 95520000),
(220034010, 3083867535, 'Marcio Almeida', 'Travesso Rio Branco', 32, 'RS', 51998705308, '1', 'Teste', 'Sulbrasileiro', NULL, 1, 95520000);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`codCliente`),
  ADD KEY `fk_Cpf` (`fk_Cpf`);

--
-- Índices de tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`codPedido`);

--
-- Índices de tabela `pedido_cliente`
--
ALTER TABLE `pedido_cliente`
  ADD KEY `fk_codPedido` (`fk_codPedido`),
  ADD KEY `fk_codCliente` (`fk_codCliente`);

--
-- Índices de tabela `pessoas`
--
ALTER TABLE `pessoas`
  ADD PRIMARY KEY (`cpf`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `codCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `codPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`fk_Cpf`) REFERENCES `pessoas` (`cpf`);

--
-- Restrições para tabelas `pedido_cliente`
--
ALTER TABLE `pedido_cliente`
  ADD CONSTRAINT `pedido_cliente_ibfk_1` FOREIGN KEY (`fk_codPedido`) REFERENCES `pedidos` (`codPedido`),
  ADD CONSTRAINT `pedido_cliente_ibfk_2` FOREIGN KEY (`fk_codCliente`) REFERENCES `clientes` (`codCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
