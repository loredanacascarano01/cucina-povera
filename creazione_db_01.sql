-- Crea lo schema del database "cucina-povera"
CREATE SCHEMA `cucina-povera` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Crea la tabella "ricette"
CREATE TABLE `cucina-povera`.`ricette` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titolo` VARCHAR(255) NOT NULL,
  `descrizione` TEXT NOT NULL,
  `procedimento` TEXT NOT NULL,
  `difficolta` TINYINT(1) NOT NULL,
  `tempo_preparazione` INT NOT NULL,
  `tempo_cottura` INT NOT NULL,
  `celiaci` TINYINT(1) NOT NULL DEFAULT 0,
  `vegetariani` TINYINT(1) NOT NULL DEFAULT 0,
  `vegani` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Crea la tabella "ingredienti"
CREATE TABLE `cucina-povera`.`ingredienti` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Crea la tabella "utensili"
CREATE TABLE `cucina-povera`.`utensili` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Crea la tabella di relazione "ricetta_ingrediente"
CREATE TABLE `cucina-povera`.`ricetta_ingrediente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_ricetta` INT NOT NULL,
  `id_ingrediente` INT NOT NULL,
  `quantita` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_ricetta_ingrediente_ricette`
    FOREIGN KEY (`id_ricetta`)
    REFERENCES `cucina-povera`.`ricette` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_ricetta_ingrediente_ingredienti`
    FOREIGN KEY (`id_ingrediente`)
    REFERENCES `cucina-povera`.`ingredienti` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
