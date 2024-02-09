INSERT INTO marque (libelle) VALUES ('Toyota');
INSERT INTO marque (libelle) VALUES ('Honda');

INSERT INTO categorie (libelle) VALUES ('SUV');
INSERT INTO categorie (libelle) VALUES ('Berline');

INSERT INTO energie (libelle) VALUES ('Essence');
INSERT INTO energie (libelle) VALUES ('Diesel');

INSERT INTO boite_vitesse (libelle) VALUES ('Man');
INSERT INTO boite_vitesse (libelle) VALUES ('Auto');

INSERT INTO voiture (modele, id_marque, id_categorie, moteur, id_energie, id_boite_vitesse, puissance, consommation, description, numero_matricule) 
VALUES ('Corolla', 1, 1, '2.0L', 1, 1, 150, 7.5, 'Description de la Toyota Corolla', '123ABC');
INSERT INTO voiture (modele, id_marque, id_categorie, moteur, id_energie, id_boite_vitesse, puissance, consommation, description, numero_matricule) 
VALUES ('Accord', 2, 2, '1.8L', 1, 2, 140, 8.0, 'Description de la Honda Accord', '456XYZ');
