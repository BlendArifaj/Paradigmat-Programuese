ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
insert into Fakulteti values('07011','Fakulteti i Inxhinieris Elektrike dhe Kompjuterike','Prishtine');
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