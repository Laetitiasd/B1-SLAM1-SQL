drop database if exists univTulle ;
create database univTulle ;

use univTulle;

create table if not exists Etudiant(
	ine varchar(500) PRIMARY KEY,
	nom varchar(500) NOT NULL,
	prenom varchar(500) NOT NULL
);

CREATE TABLE IF NOT EXISTS Modules(
	idModule int PRIMARY KEY,
	libelle varchar(500) NOT NULL
);

CREATE TABLE IF NOT EXISTS Evaluation(
	numEval int PRIMARY KEY,
	dateEval DATE,
	duree int,
	idModule int,
	FOREIGN KEY (idModule) REFERENCES Modules(idModule)
);

CREATE TABLE IF NOT EXISTS Suivre(
	ine varchar(500),
	idModule int,
	FOREIGN KEY (ine) REFERENCES Etudiant(ine),
	FOREIGN KEY (idModule) REFERENCES Modules(idModule)
);

CREATE TABLE IF NOT EXISTS Passer(
	ine varchar(500),
	numEval int,
	note int,
	FOREIGN KEY (ine) REFERENCES Etudiant(ine),
	FOREIGN KEY (numEval) REFERENCES Evaluation(numEval)
);

use univTulle ;
