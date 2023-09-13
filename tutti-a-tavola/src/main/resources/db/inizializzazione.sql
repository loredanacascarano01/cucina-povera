-- Crea il database
CREATE DATABASE tuttiatavola;
commit;
use tuttiatavola;
-- Creazione della tabella MENU
CREATE TABLE MENU (
                      id_menu INT AUTO_INCREMENT PRIMARY KEY,
                      titolo VARCHAR(255),
                      descrizione VARCHAR(255)
);

-- Creazione della tabella PASTI
CREATE TABLE PASTI (
                       id_pasto INT AUTO_INCREMENT PRIMARY KEY,
                       id_menu INT,
                       nome VARCHAR(255),
                       giorno DATE,
                       note VARCHAR(255),
                       FOREIGN KEY (id_menu) REFERENCES MENU(id_menu)
);

-- Creazione della tabella RICETTE
CREATE TABLE RICETTE (
                         id_ricetta INT AUTO_INCREMENT PRIMARY KEY,
                         nome_ricetta VARCHAR(255),
                         note VARCHAR(255)
);

-- Creazione della tabella INGREDIENTI
CREATE TABLE INGREDIENTI (
                             id_ingrediente INT AUTO_INCREMENT PRIMARY KEY,
                             nome_ingrediente VARCHAR(255),
                             unita VARCHAR(255),
                             veg BOOLEAN,
                             glutefree BOOLEAN,
                             lattosiofree BOOLEAN,
                             note VARCHAR(255)
);
-- Creazione della tabella PORTATE
CREATE TABLE portate (
                         id_pasto INT NOT NULL AUTO_INCREMENT,
                         id_ricetta INT NOT NULL,
                         num_persone INT NOT NULL,
                         PRIMARY KEY (id_pasto)
);

-- Creazione della tabella CONTIENE
CREATE TABLE contiene (
                          id_ricetta INT NOT NULL,
                          id_ingrediente INT NOT NULL,
                          quantita DECIMAL(10,2) NOT NULL,
                          PRIMARY KEY (id_ricetta, id_ingrediente)
);
commit;