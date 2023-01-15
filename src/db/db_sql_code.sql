/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  StarBoy
 * Created: 21 nov. 2022
 */
create database ult_Inscription;

use ult_Inscription;

create table Faculte(
	faculId int(4) auto_increment primary key,
	nom varchar(50) NOT NULL,
	code varchar(15)
)Engine="Innodb";


create table Departement(
	departId int(4) auto_increment primary key,
	faculID int(4) NOT NULL,
	nom varchar(50) NOT NULL
)Engine="Innodb";



Alter table Departement add constraint fk_dep foreign key(faculID) references Faculte(faculID);

create table classes(
	classeId int(4) auto_increment primary key,	
	nom varchar(50) NOT NULL
)Engine="Innodb";

create table Departement_Classes(
	departClID int(4) auto_increment primary key,
	departID int(4) NOT NULL,
	classeID int(4) NOT NULL	
)Engine="Innodb";


create table Etudiant(

	  etudID int(11) auto_increment primary key,
 	 nom varchar(50) not null,
	prenom varchar(50) not null,
	tel varchar(25) ,
	matricule varchar(10) not null,	 
	mail varchar(50)

) Engine="Innodb";

/*
create table EtudiantInsc(
	etud_InscrID int(11) auto_increment primary key,
 	etudiant varchar(60) not null,
	faculte varchar(50) not null,
	departement varchar(50) ,
	classe varchar(50) not null,	 
	anneeAc varchar(50)

) Engine="Innodb";
*/

create table Inscription(
	inscrID int(11) auto_increment primary key,
	etudID int(4),
	departClID int(50) not null,
 	annee_acad varchar(10) not null
) Engine="Innodb";



/*update inscription
    set etudID=1
    where inscrID=1;*/