DROP DATABASE Kinema;

CREATE DATABASE Kinema;

USE Kinema;

-- -----------------------------------------------------
-- Table `Distribuidora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Distribuidora` (
  `idDistribuidora` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `nome_contato` VARCHAR(45) NULL,
  `email` VARCHAR(80) NULL,
  `endereco` VARCHAR(60) NULL,
  `telefone` VARCHAR(15) NULL,
  `cnpj` VARCHAR(18) NULL,
  PRIMARY KEY (`idDistribuidora`));

INSERT INTO Distribuidora VALUES (null, "Disney", "John Titor", "johntitor@hotmail.com", "Futuro, 00-00", "(11) 11111-1111", "11.111.111/1111-11");

-- -----------------------------------------------------
-- Table `Filme`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme` (
  `idFilme` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `genero` VARCHAR(15) NULL,
  `lancamento` DATETIME NULL,
  `dias_em_cartaz` INT NULL,
  `idDistribuidora` INT NOT NULL,
  PRIMARY KEY (`idFilme`),
  FOREIGN KEY (`idDistribuidora`) REFERENCES `Distribuidora` (`idDistribuidora`));

INSERT INTO Filme VALUES (null, "Avengers: End Game", "Herói", "2019-08-06 16:28:00", 10, 1);

-- -----------------------------------------------------
-- Table `Sala`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Sala` (
  `idSala` INT NOT NULL AUTO_INCREMENT,
  `capacidade` INT(3) NULL,
  PRIMARY KEY (`idSala`));

INSERT INTO Sala VALUES (null, 50);

-- -----------------------------------------------------
-- Table `Sessão`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Sessao` (
  `idSessao` INT NOT NULL AUTO_INCREMENT,
  `idFilme` INT NOT NULL,
  `idSala` INT NOT NULL,
  `dataSessao` DATE NULL,
  `inicio` INT NULL,
  `termino` INT NULL,
  `valorIngresso` FLOAT,
  `lotacao` INT,
  PRIMARY KEY (`idSessao`),
  FOREIGN KEY (`idFilme`) REFERENCES `Filme` (`idFilme`),
  FOREIGN KEY (`idSala`) REFERENCES `Sala` (`idSala`));

INSERT INTO Sessao VALUES (null, 1, 1, "2019-08-06", 19, 23, 20, 0);

-- -----------------------------------------------------
-- Table `Funcionário`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Funcionario` (
  `idFuncionario` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `email` VARCHAR(80) NULL,
  `cpf` VARCHAR(14) NULL,
  `endereco` VARCHAR(60) NULL,
  `telefone` VARCHAR(15) NULL,
  `senha` VARCHAR(40) NULL,
  PRIMARY KEY (`idFuncionario`));

INSERT INTO Funcionario VALUES (null, "Caio Felipe", "caiodossantosfelipe@hotmail.com", "475.557.068-90", "Boiadeira Norte, 4-21", "(11) 11111-1111", "123");

-- -----------------------------------------------------
-- Table `Venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Venda` (
  `idVenda` INT NOT NULL AUTO_INCREMENT,
  `idFuncionario` INT NOT NULL,
  `data` DATETIME NULL,
  `total` FLOAT NULL,
  PRIMARY KEY (`idVenda`),
  FOREIGN KEY (`idFuncionario`) REFERENCES `Funcionario` (`idFuncionario`));

-- -----------------------------------------------------
-- Table `Ingresso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Ingresso` (
  `idIngresso` INT NOT NULL AUTO_INCREMENT,
  `idSessao` INT NOT NULL,
  `idVenda` INT NOT NULL,
  `expedicao` DATETIME NULL,
  `tipo` INT(1) NULL,
  `valor` FLOAT NULL,
  `qtd` INT,
  PRIMARY KEY (`idIngresso`),
  FOREIGN KEY (`idSessao`)
  REFERENCES `Sessao` (`idSessao`),
  FOREIGN KEY (`idVenda`) REFERENCES `Venda` (`idVenda`));

-- -----------------------------------------------------
-- Table `Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NULL,
  `valor` VARCHAR(45) NULL,
  PRIMARY KEY (`idProduto`));

INSERT INTO Produto VALUES (null, "Pepsi", 7);
INSERT INTO Produto VALUES (null, "Coca-Cola", 8);

-- -----------------------------------------------------
-- Table `item_venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Item_venda` (
  `idVenda` INT NOT NULL,
  `idProduto` INT NOT NULL,
  `qtd` INT NULL,
  `valor_unit` FLOAT NULL,
  PRIMARY KEY (`idVenda`, `idProduto`),
  FOREIGN KEY (`idVenda`) REFERENCES `Venda` (`idVenda`),
  FOREIGN KEY (`idProduto`) REFERENCES `Produto` (`idProduto`));

-- SELECT * FROM Venda;
-- SELECT * FROM Item_venda;
-- SELECT * FROM Ingresso;