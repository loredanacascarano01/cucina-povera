CREATE TABLE MENU (
                      id_menu SERIAL PRIMARY KEY,
                      titolo VARCHAR(255),
                      descrizione VARCHAR(255)
);

CREATE TABLE PASTI (
                       id_pasto SERIAL PRIMARY KEY,
                       id_menu INT,
                       nome_pasto VARCHAR(255),
                       giorno TIMESTAMP,
                       veg BIT,
                       vegan BIT,
                       glufree BIT,
                       nomilk BIT,
                       halal BIT,
                       kosher BIT,
                       FOREIGN KEY (id_menu) REFERENCES MENU (id_menu)
);

CREATE TABLE RICETTE (
                         id_ricetta SERIAL PRIMARY KEY,
                         nome_ricetta VARCHAR(255),
                         veg BIT,
                         vegan BIT,
                         glufree BIT,
                         nomilk BIT,
                         halal BIT,
                         kosher BIT
);

CREATE TABLE INGREDIENTI (
                             id_ingrediente SERIAL PRIMARY KEY,
                             nome_ingrediente VARCHAR(255),
                             udm VARCHAR(255),
                             veg BIT,
                             vegan BIT,
                             glufree BIT,
                             nomilk BIT,
                             halal BIT,
                             kosher BIT
);

CREATE TABLE PORTATE (
                         id_pasto INT,
                         id_ricetta INT,
                         num_persone INT,
                         FOREIGN KEY (id_pasto) REFERENCES PASTI (id_pasto),
                         FOREIGN KEY (id_ricetta) REFERENCES RICETTE (id_ricetta)
);


CREATE TABLE DOSI (
                      id_ricetta INT,
                      id_ingrediente INT,
                      dosi NUMERIC, -- o DOUBLE PRECISION
                      FOREIGN KEY (id_ricetta) REFERENCES RICETTE (id_ricetta),
                      FOREIGN KEY (id_ingrediente) REFERENCES INGREDIENTI (id_ingrediente)
);
