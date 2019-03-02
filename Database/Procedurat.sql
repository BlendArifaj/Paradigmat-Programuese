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
IN departamenti varchar(100),
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
    (select d.id from Departamenti d where d.DEPARTAMENTI=departamenti),
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
(Select u.id from Universiteti u where u.universiteti = universiteti),
adresa);
END //
DELIMITER //;

#Krijimi i procedures qe e bene insertimin e nje fakulteti ne sistem
DELIMITER //
CREATE PROCEDURE insertUniversiteti(
IN emri varchar(50))
BEGIN
INSERT INTO Universiteti values(
null,
emri);
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
DROP PROCEDURE getAdministrata;
DELIMITER //
CREATE PROCEDURE getAdministrata(
IN _ID varchar(20))
BEGIN
SELECT A.ID AS ID,A.EMRI AS EMRI, A.MBIEMRI AS MBIEMRI, A.EMAIL AS EMAIL,
	A.PASSHASH AS PASSHASH,A.TEL AS TEL,A.access AS access,F.EMRI AS FAKULTETI
FROM ADMINISTRATA A, FAKULTETI F
WHERE A.ID = _ID AND A.fakultetiId = F.ID;
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
IN DEPT VARCHAR(100))
BEGIN
SELECT * 
FROM DEPARTAMENTI D
WHERE D.departamenti = DEPT;
END //
DELIMITER //;

#PROCEDURA E CILA E MERR UNIVERSITETIN
drop procedure getUniversiteti;
DELIMITER //
CREATE PROCEDURE getUniversiteti(
IN UNINAME VARCHAR(50))
BEGIN
SELECT * 
FROM UNIVERSITETI U
WHERE U.UNIVERSITETI = UNINAME;
END //
DELIMITER //;

#PROCEDURA E CILA E MERR UNIVERSITETIN
DELIMITER //
CREATE PROCEDURE getUniversitetiFromID(
IN ID int)
BEGIN
SELECT * 
FROM UNIVERSITETI U
WHERE U.ID = ID;
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

#Procedura e cila i merr te gjitha njoftimet
DELIMITER //
CREATE PROCEDURE getNjoftimetFromDB(
IN PERSONID VARCHAR(20))
BEGIN
SELECT S.idNjoftimi AS id,
	S.idStudenti as personId,
	S.idPunimi as punimId,
    S.njoftimi as njoftim,
    S.statusiNjoftimit as statusi
FROM NjoftimetStudenti S
WHERE S.idStudenti = PERSONID
UNION
SELECT P.idNjoftimi AS id,
	P.idProfesori as personId,
	P.idPunimi as punimId,
    P.njoftimi as njoftim,
    P.statusiNjoftimit as statusi
FROM NjoftimetProfesori P
WHERE P.idProfesori = PERSONID
UNION
SELECT A.idNjoftimi AS id,
	A.idAdministrata as personId,
	A.idPunimi as punimId,
    A.njoftimi as njoftim,
    A.statusiNjoftimit as statusi
FROM NjoftimetAdministrata A
WHERE A.idAdministrata = PERSONID;
END //
DELIMITER ;

#PROCEDURA E CILA E BENE UPDATE PERSONIN
CREATE PROCEDURE updatePerson(
IN IDPERSON VARCHAR(20),
IN _EMRI VARCHAR(30),
IN _MBIEMRI VARCHAR(30),
IN _EMAIL VARCHAR(40),
IN _PASSHASH VARCHAR(260),
IN _TEL VARCHAR(15))
BEGIN
IF (SELECT COUNT(*) FROM Student S WHERE S.ID = IDPERSON) = 1 THEN
	UPDATE STUDENT S
    SET S.EMRI = _EMRI, S.MBIEMRI = _MBIEMRI, S.EMAIL = _EMAIL, S.PASSHASH = _PASSHASH, S.TEL = _TEL
    WHERE S.ID = _IDPERSON
ELSEIF (SELECT COUNT(*) FROM Profesori P WHERE P.ID = IDPERSON) =1 THEN
	UPDATE PROFESORI P
    SET P.EMRI = _EMRI, P.MBIEMRI = _MBIEMRI, P.EMAIL = _EMAIL, P.PASSHASH = _PASSHASH, P.TEL = _TEL
    WHERE P.ID = _IDPERSON
ELSE (SELECT COUNT(*) FROM Administrata A WHERE A.ID = IDPERSON) =1 THEN
	UPDATE Administrata A
    SET A.EMRI = _EMRI, A.MBIEMRI = _MBIEMRI, A.EMAIL = _EMAIL, A.PASSHASH = _PASSHASH, A.TEL = _TEL
    WHERE A.ID = _IDPERSON
END //
DELIMITER //;

#PROCEDURA E CILA E SHTON NJE UNIVERSITET TE RI
DELIMITER //
CREATE PROCEDURE addNewUniversity(
IN UNINAME VARCHAR(50))
BEGIN
INSERT INTO UNIVERSITETI VALUES(NULL,UNINAME);
END //
DELIMITER //;

#PROCEDURA E CILA E SHTON NJE LENDE TE RE
DELIMITER //
CREATE PROCEDURE addNewLenda(
IN EMRILENDA VARCHAR(50))
BEGIN
INSERT INTO LENDA VALUES(NULL,EMRILENDA);
END //
DELIMITER //;

#PROCEDURA E CILA E SHTON NJE FAKULTET TE RI NE NJE UNIVERSITET
DELIMITER //
CREATE PROCEDURE addNewFakultetUniversiteti(
IN FKid varchar(10),
IN FKemri varchar(50),
IN FKuni int,
IN FKadresa varchar(100))
BEGIN
INSERT INTO FAKULTETI VALUES(FKid,FKemri,FKuni,FKadresa);
END //
DELIMITER //;

#PROCEDURA E CILA E SHTON NJE DEPARTAMENT NE NJE FAKULTET TE CAKTUAR
DELIMITER //
CREATE PROCEDURE addNewDepartamentFakulteti(
IN newDeptID varchar(10),
IN newDepartament varchar(100),
IN idFK VARCHAR(10)
)
BEGIN
INSERT INTO DEPARTAMENTI VALUES(newDeptID,newDepartament,idFK);
END //
DELIMITER //;

#PROCEDURA E CILA E MERR NJE NJOFTIM TE CAKTUAR
DROP procedure IF EXISTS `getNjoftimi`;
DELIMITER $$
USE `fiekdb`$$
CREATE PROCEDURE getNjoftimi(
IN PERSONID VARCHAR(20))
BEGIN
	SELECT NA.IDNJOFTIMI AS id, NA.IDADMINISTRATA AS personId, NA.IDPUNIMI AS punimId, NA.NJOFTIMI as njoftimi, NA.STATUSINJOFTIMIT AS statusi
	FROM NJOFTIMETADMINISTRATA NA WHERE NA.IDADMINISTRATA = PERSONID
UNION
	SELECT NP.IDNJOFTIMI AS id, NP.IDPROFESORI AS personId, NP.IDPUNIMI AS punimId, NP.NJOFTIMI as njoftimi, NP.STATUSINJOFTIMIT AS statusi
	 FROM NJOFTIMETPROFESORI NP WHERE NP.IDPROFESORI = PERSONID
UNION
	SELECT NS.IDNJOFTIMI AS id, NS.IDSTUDENTI AS personId, NS.IDPUNIMI AS punimId, NS.NJOFTIMI as njoftimi, NS.STATUSINJOFTIMIT AS statusi
	 FROM NJOFTIMETSTUDENTI NS WHERE NS.IDSTUDENTI = PERSONID;
END$$
DELIMITER ;
USE FIEKDB;
#Procedura e cila i merr te gjitha universitetet
DROP procedure IF EXISTS `getAllUniversitetet`;
DELIMITER $$
USE `fiekdb`$$
CREATE PROCEDURE getAllUniversitetet()
BEGIN
SELECT distinct * 
FROM UNIVERSITETI;
END$$
DELIMITER ;

#PROCEDURA E CILA I MERR TE GJITHA FAKULTETET
DROP procedure IF EXISTS `getAllFakultetet`;
DELIMITER $$
USE `fiekdb`$$
CREATE PROCEDURE `getAllFakultetet`()
BEGIN
SELECT F.ID AS id, F.EMRI AS fakulteti
FROM FAKULTETI F;
END$$
DELIMITER ;

#Procedura e cila i merr te gjitha departamentet
DROP procedure IF EXISTS `getAllDepartamentet`;
DELIMITER $$
USE `fiekdb`$$
CREATE PROCEDURE `getAllDepartamentet`()
BEGIN
SELECT D.ID AS id, D.Departamenti AS Departamenti
FROM Departamenti D;
END$$
DELIMITER ;


#PROCEDURA E CILA I MERR TE GJITHA Lendet
DROP procedure IF EXISTS `getAllLendet`;
DELIMITER $$
USE `fiekdb`$$
CREATE PROCEDURE `getAllLendet`()
BEGIN
SELECT *
FROM lenda;
END$$
DELIMITER ;

#PROCEDURA E CILA I MERR TE GJITHA FAKULTETET
DROP procedure IF EXISTS `getFakultetetUniversiteti`;
DELIMITER $$
USE `fiekdb`$$
CREATE PROCEDURE `getFakultetetUniversiteti`(IN uniID INT) 
BEGIN
SELECT F.ID as 'id', F.EMRI AS 'emri', F.ADRESA as 'adresa'
FROM FAKULTETI F 
WHERE F.universitetiId = uniID;
END$$
DELIMITER ;
USE `fiekdb`;
DROP procedure IF EXISTS `getStudenti`;

DELIMITER $$
USE `fiekdb`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getStudenti`(
IN stdID varchar(20))
BEGIN
SELECT S.id,S.emri,S.mbiemri,S.email,S.passhash,S.tel,S.niveliStudimeve,D.departamenti,F.emri as Fakulteti,U.universiteti,S.qyteti as qyteti
FROM STUDENT S , Departamenti D, Fakulteti F,  Universiteti U
WHERE S.ID = stdID and
S.departamentId = D.id and
D.fakultetiId = F.id and 
F.universitetiId = u.id;
END$$

DELIMITER ;
