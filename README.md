API implementate

GET /menu**: Restituisce l'elenco di tutti i menu disponibili.
GET /menu/{id}**: Restituisce i dettagli di un menu specifico.
POST /menu**: Crea un nuovo menu.
GET /ricette**: Restituisce l'elenco di tutte le ricette disponibili.
GET /ingredienti/listamenu/?idMenu={id}** Restituisce la lista della spesa di un menu


1. **API per Menu e Pasti**:
    - **GET /menu**: Restituisce l'elenco di tutti i menu disponibili.
    - **GET /menu/{id}**: Restituisce i dettagli di un menu specifico.
    - **POST /menu**: Crea un nuovo menu.
    - **PUT /menu/{id}**: Aggiorna le informazioni di un menu esistente.
    - **DELETE /menu/{id}**: Cancella un menu.
    - **GET /pasti**: Restituisce l'elenco di tutti i pasti.
    - **GET /pasti/{id}**: Restituisce i dettagli di un pasto specifico.
    - **POST /pasti**: Crea un nuovo pasto all'interno di un menu.
    - **PUT /pasti/{id}**: Aggiorna le informazioni di un pasto.
    - **DELETE /pasti/{id}**: Cancella un pasto.

2. **API per Ricette e Ingredienti**:
    - **GET /ricette**: Restituisce l'elenco di tutte le ricette disponibili.
    - **GET /ricette/{id}**: Restituisce i dettagli di una ricetta specifica.
    - **POST /ricette**: Crea una nuova ricetta.
    - **PUT /ricette/{id}**: Aggiorna le informazioni di una ricetta.
    - **DELETE /ricette/{id}**: Cancella una ricetta.
    - **GET /ingredienti**: Restituisce l'elenco di tutti gli ingredienti disponibili.
    - **GET /ingredienti/{id}**: Restituisce i dettagli di un ingrediente specifico.
    - **POST /ingredienti**: Crea un nuovo ingrediente.
    - **PUT /ingredienti/{id}**: Aggiorna le informazioni di un ingrediente.
    - **DELETE /ingredienti/{id}**: Cancella un ingrediente.

3. **API per Portate**:
    - **GET /portate**: Restituisce l'elenco di tutte le portate disponibili.
    - **GET /portate/{id}**: Restituisce i dettagli di una portata specifica.
    - **POST /portate**: Crea una nuova portata all'interno di un pasto.
    - **PUT /portate/{id}**: Aggiorna le informazioni di una portata.
    - **DELETE /portate/{id}**: Cancella una portata.

4. **API per Contenuto delle Ricette**:
    - **GET /ricette/{id}/ingredienti**: Restituisce l'elenco degli ingredienti contenuti in una ricetta specifica.
    - **POST /ricette/{id}/ingredienti**: Aggiunge un ingrediente a una ricetta.
    - **PUT /ricette/{idRicetta}/ingredienti/{idIngrediente}**: Aggiorna le informazioni su un ingrediente in una ricetta.
    - **DELETE /ricette/{idRicetta}/ingredienti/{idIngrediente}**: Rimuove un ingrediente da una ricetta.

