Configurazione test progetto in locale
Scaricare il repository in locale digitando nella cartella dove si vuole salvare il progetto
git clone https://github.com/loredanacascarano01/cucina-povera.git

il backend si trova in tutti-a-tavola
il frontend si trova in fe/tutti-a-tavola

Prerequisiti:
    Aver eseguito gli script
    Aver inserito in application.properties i parametri della propria connessione
    Assicurarsi che MySql Server sia in running
    Avere Java 17 installato e avere le relative variabili d'ambiente (del path) aggiornate alla versione 17

Per compilare e deployare il backend posizionarsi in tutti-a-tavola e digitare
    mvn clean install -U
    mvn spring-boot:run

Per compilare e deployare il frontend posizionarsi in fe/tutti-a-tavola e digitare
    ng build
    ng serve
