#ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
#insert into Universiteti values(null,'Universiteti i Prishtines');
#insert into Fakulteti values('07011','Fakulteti i Inxhinieris Elektrike dhe Kompjuterike',1,'Prishtine');
#insert into Departamenti values('07011','Inxhinieri Kompjuterike','07011');
insert into Student values('150714110030','Blend','Arifaj','blend.arifaj@uni-pr.edu',
'8d9d4a07cea1ee15873b306c654f3fa8c5637b6791f2656351325516fae53ce2',
'049130642','07011','Prishtine','Master');

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