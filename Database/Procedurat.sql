USE FIEKDB;
#Krijimi i procedurave

#Krijimi i procedures per te bere insertimin e nje studenti
DELIMITER //
CREATE PROCEDURE insertStudent (IN id varchar(20),
IN emri varchar(30),
IN mbiemri varchar(30),
IN email varchar(40),
IN passhash varchar(260),
IN tel varchar(15),
IN departamenti varchar(50),
IN qyteti varchar(40),
IN niveliStudimeve varchar(20))
BEGIN
	insert into Student values(
    id,
    emri,
    mbiemri,
    email,
    passhash,
    tel,
    (select d.id from Departamenti d where d.emri=departamenti),
    qyteti,
    niveliStudimeve);
END //
DELIMITER ;

#Krijimi i procedures per te bere insertimin e nje profesori
DELIMITER //
CREATE PROCEDURE insertProfesor(
IN id varchar(20),
IN emri varchar(30),
IN mbiemri varchar(30),
IN email varchar(40),
IN passhash varchar(260),
IN tel varchar(15))
BEGIN
	insert into Profesori values(
    id,
    emri,
    mbiemri,
    email,
    passhash,
    tel,false);
END //
DELIMITER ;

#Krijimi i procedures qe e bene insertimin e lendeve te profesorit
DELIMITER //
CREATE PROCEDURE insertProfesorLenda(
IN profesorId varchar(20),
IN _lenda varchar(30))
	BEGIN
	INSERT INTO profesorLenda values(
		profesorId,
		(select l.id from lenda l where l.lenda=_lenda));
	END //
	DELIMITER //;

#Krijimi i procedures qe e bene insertimin e nje fakulteti ne sistem
DELIMITER //
CREATE PROCEDURE insertFakulteti(
IN id varchar(10),
IN emri varchar(50),
IN universiteti varchar(50),
IN adresa varchar(100))
BEGIN
INSERT INTO Fakulteti values(
id,
emri,
(Select u.id from Universiteti u where u.emri = universiteti),
adresa);
END //
DELIMITER //;

#Krijimi i procedures qe e bene insertimin e fakulteteve qe ligjeron profesori
DELIMITER //
CREATE PROCEDURE insertProfesorFakulteti(
IN profesorId varchar(20),
IN fakulteti varchar(50))
BEGIN
INSERT INTO profesorFakultet values(
profesorId,
(Select F.ID from Fakulteti f where f.emri=fakulteti));
END //
DELIMITER //;

#Procedura qe e bene insertimin e nje lende
DELIMITER //
CREATE PROCEDURE insertLenda (
IN _lenda VARCHAR(30))
BEGIN
INSERT INTO lenda VALUES (null,_lenda);
END //
DELIMITER //;

#Procedura qe e bene insertimin e nje anetari ne administrate
DELIMITER //
CREATE PROCEDURE insertAdministrata(
IN id varchar(20),
IN emri varchar(30),
IN mbiemri varchar(30),
IN email varchar(40),
IN passhash varchar(260),
IN tel varchar(15),
IN fakulteti varchar(20),
IN access varchar(20))
BEGIN
	INSERT INTO administrata VALUES(
    id,
    emri,
    mbiemri,
    email,
    passhash,
    tel,
    (SELECT F.ID FROM FAKULTETI F WHERE F.EMRI = FAKULTETI),
    (SELECT A.ID FROM ACCESS A WHERE A.ACCESS = ACCESS));
END//
DELIMITER //;

#Procedura e cila e bene insertimin e nje punimi te nje studenti
DELIMITER //
CREATE PROCEDURE insertPunim(
IN tema varchar(60),
IN permbajtja blob,
IN profesorId varchar(20),
IN studentId varchar(20),
IN departamenti varchar(50),
IN lenda varchar(30)
)
BEGIN
	INSERT INTO punimi values(null,
    tema,
    permbajtja,
	profesorId,
	studentId,
	(select d.id from Departamenti d where d.emri=departamenti),
	(select l.id from lenda l where l.lenda = lenda),
	(select CURDATE()),
	FALSE,
	FALSE);
END //
DELIMITER //;

#Procedura e cila e merr vleren hash ne baze te IDS
DELIMITER //
CREATE PROCEDURE getStoredHash(
IN userID varchar(20))
BEGIN
SELECT S.passhash as Hash,'Student' as Lloji, -1 as Access FROM STUDENT S WHERE S.ID=userID
UNION
SELECT P.PASSHASH AS HASH,'Profesor' as Lloji, 0 as Access FROM PROFESORI P WHERE P.ID=userID
UNION
SELECT A.PASSHASH AS HASH,'Administrata' as Lloji,A.Access as Access FROM ADMINISTRATA A WHERE A.ID=userID;
END //
DELIMITER //

#procedura e cila i merr fakultetet
DELIMITER //
CREATE PROCEDURE getFakultetet()
BEGIN
SELECT * FROM FAKULTETI;
END //
DELIMITER //;

#Procedura e cila e merr nje profesor te caktuar
DELIMITER //
CREATE PROCEDURE getProfesori(
IN profesorID varchar(20))
BEGIN
SELECT * FROM PROFESORI P WHERE P.ID = profesorID;
END //
DELIMITER //;

#PROCEDURA E CILA I MERR FAKULTETET NE TE CILAT JEP MESIM PROFESORI
DELIMITER //
CREATE PROCEDURE getProfesoriFakultetet(
IN profesorID varchar(20))
BEGIN
SELECT F.EMRI AS FAKULTETI
FROM PROFESOR P, FAKULTETI F,
	PROFESORFAKULTET PF
WHERE P.ID = PF.PROFESORID
	AND F.ID = PF.FAKULTETID
	AND P.ID = PROFESORID;
END //
DELIMITER //;
#PROCEDURA E CILA I MERR LENDET TE CILAT I JEP PROFESORI
DELIMITER //
CREATE PROCEDURE getProfesoriLendet(
IN profesorID varchar(20))
BEGIN
SELECT L.LENDA AS LENDA
FROM PROFESOR P, LENDA L,
	PROFESORLENDA PL
WHERE P.ID = PF.PROFESORID
	AND L.ID = PL.LENDAID
	AND P.ID = PROFESORID;
END //
DELIMITER //;

#Procedura e cila i merr te gjitha punimet per nje student te caktuar
DELIMITER //
CREATE PROCEDURE getPunimet(
IN stdID varchar(20))
BEGIN 
SELECT * FROM PUNIMI P WHERE P.studentId = stdID;
END //
DELIMITER //;

#Procedura e cila e merr nje student te caktuar
DELIMITER //
CREATE PROCEDURE getStudenti(
IN stdID varchar(20))
BEGIN
SELECT S.id,S.emri,S.mbiemri,S.email,S.passhash,S.tel,S.niveliStudimeve,D.departamenti,F.emri as Fakulteti,U.universiteti 
FROM STUDENT S , Departamenti D, Fakulteti F, Universiteti U
WHERE S.ID = stdID and
S.departamentId = D.id and
D.fakultetiId = F.id and 
F.universitetiId = u.id;
END //
DELIMITER //;

#Procedura e cila e merr fakulteti ne baze te emrit 
DELIMITER //
CREATE PROCEDURE getFakulteti(
IN FAKULTETI VARCHAR(50))
BEGIN
SELECT F.ID AS ID, F.EMRI AS FAKULTETI, U.UNIVERSITETI AS UNIVERSITETI,F.ADRESA AS ADRESA
FROM FAKULTETI F,UNIVERSITETI U
WHERE F.EMRI = FAKULTETI AND 
F.UNIVERSITETIID = U.ID;
END //
DELIMITER //

#Procedura e cila i merr departamentet e fakultetit
DELIMITER //
CREATE PROCEDURE getDepartamentetFakultetit(
IN FID VARCHAR(10))
BEGIN
SELECT D.ID AS ID,D.DEPARTAMENTI AS DEPARTAMENTI, F.EMRI AS FAKULTETI
FROM DEPARTAMENTI D, FAKULTETI F
WHERE D.ID = FID AND F.ID = FID;
END //
DELIMITER //;

#PROCEDURA E CILA I MERR TE DHENAT E ADMINISRATES
DELIMITER //
CREATE PROCEDURE getAdministrata(
IN _ID varchar(20))
BEGIN
SELECT *
FROM ADMINISTRATA A 
WHERE A.ID = _ID;
END //
DELIMITER //;

#PROCEDURA E CILA E APROVON NJE PROFESOR
DELIMITER //
CREATE PROCEDURE aprovoProfesorin(
IN PROFID VARCHAR(20))
BEGIN
UPDATE PROFESORI P
SET P.aprovuar = true 
where p.id = profid;
end //
DELIMITER //;

#PROCEDURA E CILA E MERR DEPARTAMENTIN
DELIMITER //
CREATE PROCEDURE getDepartamenti(
IN DEPTID VARCHAR(10))
BEGIN
SELECT * 
FROM DEPARTAMENTI D
WHERE D.ID = DEPTID;
END //
DELIMITER //;

#PROCEDURA E CILA E MERR UNIVERSITETIN
DELIMITER //
CREATE PROCEDURE getUniversiteti(
IN UNINAME VARCHAR(50))
BEGIN
SELECT * 
FROM UNIVERSITETI
WHERE U.UNIVERSITETI = UNINAME;
END //
DELIMITER //;

#PROCEDURA E CILA E MERR LENDEN
DELIMITER //
CREATE PROCEDURE getLendaEmri(
IN LENDAEMRI VARCHAR(30))
BEGIN 
SELECT *
FROM LENDA L
WHERE L.LENDA = LENDAEMRI;
END //
DELIMITER //;
