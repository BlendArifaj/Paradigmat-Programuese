ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
#Inserto Universitetet
insert into Universiteti values(null,'Universiteti i Prishtines');
insert into Universiteti values(null,'Universiteti i Prizrenit');
insert into Universiteti values(null,'Universiteti i Pejes');
insert into Universiteti values(null,'Universiteti i Gjakoves');

insert into Fakulteti values('07011','Fakulteti i Inxhinieris Elektrike dhe Kompjuterike',1,'Prishtine');
insert into Fakulteti values('07012','Fakulteti i Inxhinieris Mekanike',1,'Prishtine');

SELECT * FROM DEPARTAMENTI;

insert into Departamenti values('07011','Inxhinieri Kompjuterike','07011');
insert into Departamenti values('07012','Telekomunikacion','07011');

insert into Student values('150714110030','Blend','Arifaj','blend.arifaj@uni-pr.edu',
'8d9d4a07cea1ee15873b306c654f3fa8c5637b6791f2656351325516fae53ce2',
'049130642','07011','Prishtine','Master');
select * from Student;

select * from administrata;
insert into Administrata values('ADMIN001','Blend','Arifaj','blendarifaj@hotmail.com','9fa1a77341addbe23893326cd4d5c6642ae223a8b42938def3417e67b2165a4d','044444555','07011',1);
insert into Administrata values('ADMIN002','Blend','Arifaj','blendarifaj@hotmail.com','e62f46c0ba38ea3225556142cad88539b691546a7abe9fbdbf1318afddaf7bf0','044444555','07011',1);

insert into Lenda values(null,'Database');
insert into Lenda values(null,'Paradigmat Programuese');
insert into Lenda values(null,'Modeli i te dhenave');

select * from Lenda;
SELECT * FROM PROFESORI P WHERE P.ID = profesorID;
select * from ProfesorLenda;

select * from Punimi;

SELECT S.id,S.emri,S.mbiemri,S.email,S.passhash,S.tel,S.niveliStudimeve,S.Qyteti,D.departamenti,F.emri as Fakulteti,U.universiteti 
FROM STUDENT S , Departamenti D, Fakulteti F, Universiteti U
WHERE /*S.ID = stdID and*/
S.departamentId = D.id and
D.fakultetiId = F.id and 
F.universitetiId = u.id;

select * from Student;

select * from Fakulteti;
select * from Departamenti;
delete from departamenti where id=1;


CREATE USER 'root'@'localhost' IDENTIFIED BY 'root';

GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' WITH GRANT OPTION;

CREATE USER 'root'@'%' IDENTIFIED BY 'root';

GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;

FLUSH PRIVILEGES;


show databases;
use fiedb;
UPDATE mysql.user 
    SET authentication_string = PASSWORD('root'), password_expired = 'N'
    WHERE User = '' AND Host = 'localhost';
