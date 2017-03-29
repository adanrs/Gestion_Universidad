-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.19-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for bookstore
CREATE DATABASE IF NOT EXISTS `bookstore` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bookstore`;

-- Dumping structure for table bookstore.book
CREATE TABLE IF NOT EXISTS `book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `author` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`book_id`),
  UNIQUE KEY `book_id_UNIQUE` (`book_id`),
  UNIQUE KEY `title_UNIQUE` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

-- Dumping data for table bookstore.book: ~2 rows (approximately)
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` (`book_id`, `title`, `author`, `price`) VALUES
	(18, '5', '5', 5),
	(19, '6', '6', 6),
	(20, '44', '44', 2);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;

-- Dumping structure for table bookstore.br
CREATE TABLE IF NOT EXISTS `br` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `author` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`book_id`),
  UNIQUE KEY `book_id` (`book_id`),
  UNIQUE KEY `title` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=322 DEFAULT CHARSET=latin1;

-- Dumping data for table bookstore.br: ~2 rows (approximately)
/*!40000 ALTER TABLE `br` DISABLE KEYS */;
INSERT INTO `br` (`book_id`, `title`, `author`, `price`) VALUES
	(123, '321', '', 0),
	(321, '123', '', 0);
/*!40000 ALTER TABLE `br` ENABLE KEYS */;

-- Dumping structure for table bookstore.carrera
CREATE TABLE IF NOT EXISTS `carrera` (
  `CODIGO` varchar(12) NOT NULL,
  `NOMBRE` varchar(255) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bookstore.carrera: ~1 rows (approximately)
/*!40000 ALTER TABLE `carrera` DISABLE KEYS */;
INSERT INTO `carrera` (`CODIGO`, `NOMBRE`) VALUES
	('Astronomia', '2'),
	('Geologia', '403');
/*!40000 ALTER TABLE `carrera` ENABLE KEYS */;

-- Dumping structure for table bookstore.ciclo
CREATE TABLE IF NOT EXISTS `ciclo` (
  `ID` varchar(6) NOT NULL,
  `ANNO` int(11) NOT NULL,
  `NUM_CICLO` int(11) NOT NULL,
  `FECHA_INICIO` varchar(10) DEFAULT NULL,
  `FECHA_FINAL` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bookstore.ciclo: ~1 rows (approximately)
/*!40000 ALTER TABLE `ciclo` DISABLE KEYS */;
INSERT INTO `ciclo` (`ID`, `ANNO`, `NUM_CICLO`, `FECHA_INICIO`, `FECHA_FINAL`) VALUES
	('12222', 1, 2, '2017-03-23', '2017-03-23');
/*!40000 ALTER TABLE `ciclo` ENABLE KEYS */;

-- Dumping structure for table bookstore.curso
CREATE TABLE IF NOT EXISTS `curso` (
  `CODIGO` varchar(12) NOT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `CREDITOS` int(11) DEFAULT NULL,
  `H_SEMANALES` int(11) DEFAULT NULL,
  `COD_CARRERA` varchar(12) DEFAULT NULL,
  `NUM_CICLO` int(11) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bookstore.curso: ~0 rows (approximately)
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;

-- Dumping structure for table bookstore.grupo
CREATE TABLE IF NOT EXISTS `grupo` (
  `ID_GRUPO` varchar(10) NOT NULL,
  `NUMERO` int(11) NOT NULL,
  `ID_PROF` varchar(12) NOT NULL,
  `COD_CURSO` varchar(12) NOT NULL,
  PRIMARY KEY (`ID_GRUPO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bookstore.grupo: ~0 rows (approximately)
/*!40000 ALTER TABLE `grupo` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupo` ENABLE KEYS */;

-- Dumping structure for table bookstore.nota
CREATE TABLE IF NOT EXISTS `nota` (
  `NOTA` int(11) DEFAULT '0',
  `CURSO` varchar(12) NOT NULL,
  `ESTUDIANTE` varchar(12) NOT NULL,
  `GRUPO` int(11) NOT NULL,
  `CONDICION` varchar(12) DEFAULT NULL,
  KEY `FK_ESTUDIANTE` (`ESTUDIANTE`),
  CONSTRAINT `FK_ESTUDIANTE` FOREIGN KEY (`ESTUDIANTE`) REFERENCES `persona` (`CEDULA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bookstore.nota: ~0 rows (approximately)
/*!40000 ALTER TABLE `nota` DISABLE KEYS */;
/*!40000 ALTER TABLE `nota` ENABLE KEYS */;

-- Dumping structure for table bookstore.persona
CREATE TABLE IF NOT EXISTS `persona` (
  `CEDULA` varchar(12) NOT NULL,
  `PASS` varchar(255) DEFAULT NULL,
  `TIPO` int(11) DEFAULT '1',
  `NOMBRE` varchar(255) DEFAULT NULL,
  `F_NACIMIENTO` varchar(255) DEFAULT NULL,
  `CORREO` varchar(255) DEFAULT NULL,
  `TELEFONO` int(11) DEFAULT NULL,
  `CARRERA` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`CEDULA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table bookstore.persona: ~9 rows (approximately)
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` (`CEDULA`, `PASS`, `TIPO`, `NOMBRE`, `F_NACIMIENTO`, `CORREO`, `TELEFONO`, `CARRERA`) VALUES
	('1', '1', 1, 'ROOT', NULL, '@ ', 855, ''),
	('114540821', 'rivera', 1, 'adam', NULL, 'rivedansanchez19@gmail.com', 22624281, 'Inform'),
	('115340566', '8956', 2, 'Cesar Cornejo', NULL, 'cesar.cornejo@gmail.com', 9875412, 'Inge'),
	('116440018', '199102', 2, 'Marco Murillo Sanchez', NULL, 'marco.murillo@gmail.com', 89401632, 'Ingenieria'),
	('123456789', '111', 1, 'Juan de Dios', NULL, 'jd@hotmail.com', 22626262, NULL),
	('402180202', '91919', 1, 'Sergio Arguedas', NULL, 'sergio.arguedas@hotmail.com', 89562312, 'Ingenieria'),
	('444444444', '444', 2, 'Floribeth', NULL, 'fl@hotmail.com', 444444444, 'PSICOLOGIA'),
	('90880115', 'smr', 1, 'Sandra', NULL, 'sandramsr@hotmail.com', 22624281, 'Sociales');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
