-- Creazione della tabella "categorie"
CREATE TABLE `cucina-povera`.`categorie` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB;

-- Inserimento delle categorie di esempio
INSERT INTO `cucina-povera`.`categorie` (`nome`) VALUES
  ('primo'),
  ('secondo'),
  ('contorno'),
  ('dolce'),
  ('antipasto'),
  ('piatto unico');

-- Aggiunta della colonna "categoria" alla tabella "ricette"
ALTER TABLE `cucina-povera`.`ricette` ADD COLUMN `categoria` INT NOT NULL;

-- Aggiornamento della colonna "categoria" con l'ID della categoria corrispondente
UPDATE `cucina-povera`.`ricette` SET `categoria` = 1 WHERE `id` = 1;
UPDATE `cucina-povera`.`ricette` SET `categoria` = 2 WHERE `id` = 2;
-- e così via, per associare ogni ricetta alla categoria corrispondente
