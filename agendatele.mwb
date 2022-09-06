CREATE TABLE IF NOT EXISTS `agendatele`.`contato` (
  `idcontato` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(11) NOT NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`idcontato`),
  UNIQUE INDEX `idcontato_UNIQUE` (`idcontato` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `agendatele`.`evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agendatele`.`evento` (
  `idevento` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NULL,
  `horario` INT NULL,
  `data_evento` DATE NOT NULL,
  PRIMARY KEY (`idevento`),
  UNIQUE INDEX `idevento_UNIQUE` (`idevento` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `agendatele`.`contato_has_evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agendatele`.`contato_has_evento` (
  `contato_idcontato` INT NOT NULL,
  `evento_idevento` INT NOT NULL,
  PRIMARY KEY (`contato_idcontato`, `evento_idevento`),
  INDEX `fk_contato_has_evento_evento1_idx` (`evento_idevento` ASC) VISIBLE,
  INDEX `fk_contato_has_evento_contato_idx` (`contato_idcontato` ASC) VISIBLE,
  CONSTRAINT `fk_contato_has_evento_contato`
    FOREIGN KEY (`contato_idcontato`)
    REFERENCES `agendatele`.`contato` (`idcontato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_contato_has_evento_evento1`
    FOREIGN KEY (`evento_idevento`)
    REFERENCES `agendatele`.`evento` (`idevento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
