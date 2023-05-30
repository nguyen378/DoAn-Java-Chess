CREATE DATABASE Doan_Java_Chess
GO 
USE Doan_Java_Chess
GO

CREATE TABLE PLAYER (
  ID INT PRIMARY KEY,
  NAME VARCHAR(50),
  EMAIL VARCHAR(50),
  MATKHAU VARCHAR(50),
  SOTRANCHOI INT,
  SOTRANTHANG INT
);

CREATE TABLE MATCH (
  ID INT PRIMARY KEY,
  PLAYERLIGHT INT,
  PLAYERDARK INT,
  RESULT VARCHAR(50),
  FOREIGN KEY (PLAYERLIGHT) REFERENCES PLAYER(ID),
  FOREIGN KEY (PLAYERDARK) REFERENCES PLAYER(ID)
);

CREATE TABLE DICHUYEN (
  ID INT PRIMARY KEY,
  MATCH_NUMBER INT,
  PLAYER INT,
  NUOCDI VARCHAR(255),
  FOREIGN KEY (MATCH_NUMBER) REFERENCES DICHUYEN(ID),
  FOREIGN KEY (PLAYER) REFERENCES DICHUYEN(ID)
);

-------------------INSERT DATA-----------------------------------

INSERT INTO PLAYER (ID, NAME, EMAIL, MATKHAU, SOTRANCHOI, SOTRANTHANG) VALUES
(1, 'Người chơi 1', 'nguoichoi1@gmail.com', 'matkhau1', 10, 7),
(2, 'Người chơi 2', 'nguoichoi2@gmail.com', 'matkhau2', 12, 8),
(3, 'Người chơi 3', 'nguoichoi3@gmail.com', 'matkhau3', 15, 11),
(4, 'Người chơi 4', 'nguoichoi4@gmail.com', 'matkhau4', 9, 5),
(5, 'Người chơi 5', 'nguoichoi5@gmail.com', 'matkhau5', 6, 3),
(6, 'Người chơi 6', 'nguoichoi6@gmail.com', 'matkhau6', 20, 18),
(7, 'Người chơi 7', 'nguoichoi7@gmail.com', 'matkhau7', 14, 9),
(8, 'Người chơi 8', 'nguoichoi8@gmail.com', 'matkhau8', 11, 7),
(9, 'Người chơi 9', 'nguoichoi9@gmail.com', 'matkhau9', 8, 4),
(10, 'Người chơi 10', 'nguoichoi10@gmail.com', 'matkhau10', 16, 12);

INSERT INTO MATCH (ID, PLAYERLIGHT, PLAYERDARK, RESULT) VALUES
(1, 1, 2, 'Thắng'),
(2, 3, 4, 'Thua'),
(3, 5, 6, 'Hòa'),
(4, 7, 8, 'Thắng'),
(5, 9, 10, 'Thua'),
(6, 1, 3, 'Hòa'),
(7, 2, 4, 'Thắng'),
(8, 6, 8, 'Thắng'),
(9, 5, 7, 'Thua'),
(10, 9, 10, 'Thắng');

INSERT INTO DICHUYEN (ID, MATCH_NUMBER, PLAYER, NUOCDI) VALUES
(1, 1, 1, 'e2e4'),
(2, 1, 2, 'e7e5'),
(3, 1, 1, 'g1f3'),
(4, 2, 3, 'e2e4'),
(5, 2, 4, 'e7e5'),
(6, 2, 3, 'g1f3'),
(7, 3, 5, 'e2e4'),
(8, 3, 6, 'e7e5'),
(9, 3, 5, 'g1f3'),
(10, 4, 7, 'e2e4');