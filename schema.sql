CREATE DATABASE gestion_banque;



CREATE TABLE IF NOT EXISTS compte (
                                      id SERIAL PRIMARY KEY,
                                      titulaire VARCHAR(100) NOT NULL,
                                      solde DECIMAL(10,2) NOT NULL
);


CREATE TABLE compte_epargne (
                                id SERIAL PRIMARY KEY,
                                compte_id INT REFERENCES compte(id) ON DELETE CASCADE,
                                benifice DECIMAL(10,2) NOT NULL
);

CREATE TABLE banque (
                        id SERIAL PRIMARY KEY,
                        nom VARCHAR(100) NOT NULL,
                        adresse VARCHAR(255) NOT NULL
);

