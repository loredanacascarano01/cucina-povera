<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Configurazione del Progetto in Locale</title>
</head>
<body>
    <h1>Configurazione del Progetto in Locale</h1>
    
    <h2>Passi per il Setup del Progetto</h2>
    
    <ol>
        <li>Scaricare il repository in locale digitando nella cartella dove si vuole salvare il progetto:</li>
        <code>git clone https://github.com/loredanacascarano01/cucina-povera.git</code>
        <li>Il backend si trova nella cartella <code>tutti-a-tavola</code>.</li>
        <li>Il frontend si trova nella cartella <code>fe/tutti-a-tavola</code>.</li>
    </ol>

    <h2>Prerequisiti</h2>
    
    <ul>
        <li>Aver eseguito gli script <code>tutti-a-tavola/src/main/resources/db/inizializzazione.sql</code></li>
        <li>Aver inserito in <code>application.properties</code> (<code>tutti-a-tavola/src/main/resources/application.properties</code>) i parametri della propria connessione.</li>
        <li>Assicurarsi che MySql Server sia in running.</li>
        <li>Avere Java 17 installato e avere le relative variabili d'ambiente (del path) aggiornate alla versione 17.</li>
    </ul>

    <h2>Compilazione e Deploy del Backend</h2>
    
    <ol>
        <li>Posizionarsi nella cartella <code>tutti-a-tavola</code> e digitare:</li>
        <code>mvn clean install -U</code>
        <code>mvn spring-boot:run</code>
    </ol>

    <h2>Compilazione e Deploy del Frontend</h2>
    
    <ol>
        <li>Posizionarsi nella cartella <code>fe/tutti-a-tavola</code> e digitare:</li>
        <code>ng build</code>
        <code>ng serve</code>
    </ol>

    <h2>Visualizzare il Progetto</h2>
    
    <p>Andare da un browser su <code>localhost:4200</code></p>
</body>
</html>
