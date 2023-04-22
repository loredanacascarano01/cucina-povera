create database tavola;
use tavola;

create table MENU(
                     id_menu int auto_increment,
                     titolo nvarchar(255),
                     descrizione nvarchar(255),
                     PRIMARY KEY (id_menu)
);

create table PASTI(
                      id_pasto int auto_increment,
                      id_menu int,
                      nome_pasto nvarchar(255),
                      giorno TIMESTAMP,
                      veg BIT,
                      vegan BIT,
                      glufree BIT,
                      nomilk BIT,
                      halal BIT,
                      kosher BIT,
                      PRIMARY KEY (id_pasto),
                      FOREIGN KEY (id_menu) references MENU (id_menu)
);

create table RICETTE(
                        id_ricetta int auto_increment,
                        nome_ricetta nvarchar(255),
                        veg BIT,
                        vegan BIT,
                        glufree BIT,
                        nomilk BIT,
                        halal BIT,
                        kosher BIT,
                        PRIMARY KEY (id_ricetta)
);

create TABLE INGREDIENTI(
                            id_ingrediente int auto_increment,
                            nome_ingrediente nvarchar(255),
                            udm nvarchar(255),
                            veg BIT,
                            vegan BIT,
                            glufree BIT,
                            nomilk BIT,
                            halal BIT,
                            kosher BIT,
                            PRIMARY KEY (id_ingrediente)
);

create TABLE PORTATE (
                         id_pasto int,
                         id_ricetta int,
                         num_persone int,
                         FOREIGN KEY (id_pasto) references PASTI(id_pasto),
                         FOREIGN KEY (id_ricetta) references RICETTE(id_ricetta)
);

create TABLE DOSI(
                     id_ricetta int,
                     id_ingrediente int,
                     dosi double,
                     FOREIGN KEY (id_ricetta) references RICETTE(id_ricetta),
                     FOREIGN KEY (id_ingrediente) references INGREDIENTI(id_ingrediente)
);

commit;