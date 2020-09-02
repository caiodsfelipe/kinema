CREATE TABLE IF NOT EXISTS `distribuidora` (
    `idDistribuidora` INT AUTO_INCREMENT,
    `nome` VARCHAR(45),
    `endereco` VARCHAR (60),
    `telefone` VARCHAR(10),
    `cnpj` VARCHAR(18),
    PRIMARY KEY (`idDistribuidora`)
);

CREATE TABLE IF NOT EXISTS `filme` (
    `idFilme` INT AUTO_INCREMENT,
    `idDistribuidora` INT,
    `nome` VARCHAR(45),
    `lancamento` DATETIME,
    `dias_em_cartaz` INT,
    PRIMARY KEY (`idFilme`),
    FOREIGN KEY (`idDistribuidora`) REFERENCES `distribuidora`(`idDistribuidora`)
);

CREATE TABLE IF NOT EXISTS `sala` (
    `idSala` INT AUTO_INCREMENT,
    `capacidade` INT(3),
    `qtd_func` INT,
    PRIMARY KEY (`idSala`)
);

CREATE TABLE IF NOT EXISTS `funcionario` (
    `idFuncionario` INT AUTO_INCREMENT,
    `idSala` INT,
    `nome` VARCHAR(45),
    `cpf` VARCHAR(14),
    `endereco` VARCHAR(60),
    `telefone` VARCHAR(10),
    PRIMARY KEY (`idFuncionario`),
    FOREIGN KEY (`idSala`) REFERENCES `sala` (`idSala`)
);

CREATE TABLE IF NOT EXISTS `sessao` (
    `idSessao` INT AUTO_INCREMENT,
    `idSala` INT,
    `idFilme` INT,
    `inicio` DATETIME,
    `termino` DATETIME,
    PRIMARY KEY (`idSessao`),
    FOREIGN KEY (`idSala`) REFERENCES `sala` (`idSala`),
    FOREIGN KEY (`idFilme`) REFERENCES `filme` (`idFilme`)
);

CREATE TABLE IF NOT EXISTS `ingresso` (
    `idIngresso` INT AUTO_INCREMENT,
    `idSessao` INT,
    `idSala` INT,
    `idFilme` INT,
    `expedicao` DATETIME,
    `tipo` INT(1),
    PRIMARY KEY (`idIngresso`),
    FOREIGN KEY (`idSessao`) REFERENCES `sessao` (`idSessao`),
    FOREIGN KEY (`idSala`) REFERENCES `sala` (`idSala`),
    FOREIGN KEY (`idFilme`) REFERENCES `filme` (`idFilme`)
);
