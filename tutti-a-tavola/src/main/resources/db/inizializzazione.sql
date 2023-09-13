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
CREATE TABLE PORTATE (
                         id_pasto INT NOT NULL ,
                         id_ricetta INT NOT NULL,
                         num_persone INT NOT NULL
);

-- Creazione della tabella CONTIENE
CREATE TABLE CONTIENE (
                          id_ricetta INT NOT NULL,
                          id_ingrediente INT NOT NULL,
                          quantita DECIMAL(10,2) NOT NULL
);



-- Inserimento di dati nelle tabelle
INSERT INTO MENU (titolo, descrizione) VALUES
    ('Vacanza a Santorini', 'Una vacanza in riva al mare a Santorini');

INSERT INTO PASTI (id_menu, nome, giorno, note) VALUES
                                                    (1, 'Cena primo giorno', '2023-08-26', ''),
                                                    (1, 'Colazione secondo giorno', '2023-08-27', '');

INSERT INTO RICETTE (nome_ricetta, note) VALUES
                                             ('Pizza', 'Serve il forno'),
                                             ('Pasta al pomodoro', '');

INSERT INTO INGREDIENTI (nome_ingrediente, unita, veg, glutefree, lattosiofree, note) VALUES
                                                                                          ('Farina', 'g', false, false, false, ''),
                                                                                          ('Mozzarella', 'g', false, false, true, ''),
                                                                                          ('Passata di pomodoro', 'ml', true, true, true, ''),
                                                                                          ('Penne', 'g', true, false, true, '');

INSERT INTO PORTATE (id_pasto, id_ricetta, num_persone) VALUES
                                                            (1, 1, 20),
                                                            (2, 2, 4);

INSERT INTO CONTIENE (id_ricetta, id_ingrediente, quantita) VALUES
                                                                (1, 1, 300),
                                                                (1, 2, 100),
                                                                (1, 3, 150),
                                                                (2, 4, 80),
                                                                (2, 3, 50);

commit;