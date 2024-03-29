# Configurazione del Progetto in Locale

Questo documento fornisce istruzioni per configurare e avviare il progetto in locale. Assicurati di seguire attentamente i passaggi descritti di seguito.

## Passi per il Setup del Progetto

1. Scaricare il repository in locale digitando nella cartella dove si vuole salvare il progetto:

   ```bash
   git clone https://github.com/loredanacascarano01/cucina-povera.git
   ```

2. Il backend si trova nella cartella `tutti-a-tavola`.

3. Il frontend si trova nella cartella `fe/tutti-a-tavola`.

## Prerequisiti

Prima di procedere, assicurati di soddisfare i seguenti prerequisiti:

- Aver eseguito gli script `tutti-a-tavola/src/main/resources/db/inizializzazione.sql` oppure `tutti-a-tavola/src/main/resources/db/cucina-povera-schema.sql`.

- Aver inserito in `application.properties` (`tutti-a-tavola/src/main/resources/application.properties`) i parametri della propria connessione.

- Assicurarsi che MySql Server sia in esecuzione.

- Avere Java 17 installato e avere le relative variabili d'ambiente (del path) aggiornate alla versione 17.

- Avere installato Node.js, almeno la versione 18.14.1. Puoi verificarne l'installazione con il comando:

   ```bash
   node -v
   ```

- Avere Angular installato. Puoi farlo globalmente o nella cartella del progetto `fe/tutti-a-tavola`:

   Installazione globale:

   ```bash
   npm install -g @angular/cli@16.2.3
   ```

   Installazione nel progetto:

   ```bash
   npm install @angular/cli@16.2.3
   ```

   Per installare tutte le dipendenze, esegui il seguente comando nella directory `fe/tutti-a-tavola`:

   ```bash
   npm install
   ```

## Compilazione e Deploy del Backend

Per compilare e avviare il backend, segui questi passaggi:

1. Posizionarsi nella cartella `tutti-a-tavola` e digitare:

   ```bash
   mvn clean install -U
   mvn spring-boot:run
   ```

## Compilazione e Deploy del Frontend

Per compilare e avviare il frontend, esegui i seguenti comandi:

1. Posizionarsi nella cartella `fe/tutti-a-tavola` e digitare:

   ```bash
   ng build
   ng serve
   ```

## Visualizzare il Progetto

Dopo aver seguito tutti i passaggi, apri un browser e visita `http://localhost:4200`.
```

