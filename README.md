# Spring Boot REST API - Product Management 
Un semplice progetto Spring Boot che espone API REST per la gestione di prodotti.
I dati vengono salvati in un database **H2 in-memory** per test e sviluppo. 

# Funzionalità 
- Visualizzare tutti i prodotti ("GET /api/product)
- Aggiungere uno o più prodotti ("POST /api/product)
- Prevenire l'inserimento di prodotti duplicati (verifica per "name")
- Database H2 integrato per test
- Struttura pulita con Controller, Service, Repository e DTO

# Architettura del progetto
├── controllers
│ └── ProductController.java
├── dto
│ └── ProductInsertResult.java
├── models
│ └── Product.java
├── repositories
│ └── ProductRepository.java
├── services
│ └── ProductService.java
└── ApiRestApplication.java

# Tecnologie usate 
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Postman** (per test delle API)

# Configurazione Database (H2)
Il database h2 è in-memory e viene creato ad ogni avvio dell'app. 
Puoi accedere alla console H2 su: 
http://localhost:8080/h2-console
**Credenziali di default: **
- JDBC URL: "jdbc:h2:mem:testdb"
- Username: "sa"
- Password: *(vuoto)*

#GET /api/product
Restituisce la lista di tutti i prodotti.
Esempio:
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "High-end laptop",
    "price": 1200.0
  }

]

#POST /api/product 
Permette di aggiungere uno o più prodotti contemporaneamente. 
Esempio:
[
  {
    "name": "Keyboard",
    "description": "Mechanical keyboard",
    "price": 80.0
  },
  {
    "name": "Mouse",
    "description": "Wireless mouse",
    "price": 40.0
  }
] 
Esempio di risposta: 
[
  { "productName": "Keyboard", "inserted": true, "message": "Inserted" },
  { "productName": "Mouse", "inserted": false, "message": "Already exists" }
]

#Test con Postman 
- Invia una richiesta POST a http://localhost:8080/api/product con body JSON.
- Verifica i dati in GET /api/product

Autore 
Ricardo Dev
email: lucycalderon477@gmail.com
Progetto di test - 2025
