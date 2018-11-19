DROP DATABASE IF EXISTS FIEKDB;
create database FIEKDB;
use FIEKDB;

create table Universiteti(
id int auto_increment primary key,
universiteti varchar(50));

create table Fakulteti(
id varchar(10) primary key,
emri varchar(50) not null,
universitetiId int,
adresa varchar(100) not null,
foreign key(universitetiId) references Universiteti(id));

create table Departamenti(
id varchar(10) primary key,
departamenti varchar(100) not null,
fakultetiId varchar(10) not null,
foreign key(fakultetiId) references Fakulteti(id));

create table Student(
id varchar(20) not null primary key,
emri varchar(30) not null,
mbiemri varchar(30) not null,
email varchar(40) not null,
passhash varchar(260) not null,
tel varchar(15),
departamentId varchar(10) not null,
qyteti varchar(40),
niveliStudimeve varchar(20) not null,
foreign key(departamentId) references Departamenti(id));

create table Profesori(
id varchar(20) not null primary key,
emri varchar(30) not null,
mbiemri varchar(30) not null,
email varchar(40) not null,
passhash varchar(260) not null,
tel varchar(15));

create table Lenda(
id int NOT NULL AUTO_INCREMENT,
lenda varchar(30) not null,
primary key(id));

create table ProfesorFakultet(
profesorId varchar(20) not null,
fakultetId varchar(10) not null,
primary key(profesorId,fakultetId),
foreign key(profesorId) references Profesori(id),
foreign key(fakultetId) references Fakulteti(id));
 
create table ProfesorLenda(
profesorId varchar(20) not null,
lendaId int not null,
primary key(profesorId,lendaId),
foreign key(profesorId) references Profesori(id),
foreign key(lendaId) references Lenda(id));

create table PunimProcesi(
id int auto_increment primary key,
procesi varchar(50));

create table Punimi(
id int auto_increment primary key,
tema varchar(60) not null,
permbajtja blob not null ,#65535 bytes
profesorId varchar(20) not null,
studentId varchar(20) not null,
departamentId varchar(10) not null,
lendaId int not null,
dataDorezimit date not null,
profesoriPergjigje bool,
administrataPergjigje bool,
foreign key(profesorId) references Profesori(id),
foreign key(studentId) references Student(id),
foreign key(departamentId) references Departamenti(id),
foreign key(lendaId) references Lenda(id));

create table Access(
id int auto_increment primary key,
access varchar(20) not null);

create table Administrata(
id varchar(20) primary key,
emri varchar(30) not null,
mbiemri varchar(30) not null,
email varchar(40) not null,
passhash varchar(260) not null,
tel varchar(15),
fakultetiId varchar(10) not null,
access int not null,
foreign key(fakultetiId) references Fakulteti(id),
foreign key(access) references Access(Id));