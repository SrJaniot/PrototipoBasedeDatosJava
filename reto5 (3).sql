-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 31, 2023 at 04:37 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `reto5`
--

-- --------------------------------------------------------

--
-- Table structure for table `cuentadante`
--

CREATE TABLE `cuentadante` (
  `CuentadanteID` int(11) NOT NULL,
  `Documento` varchar(30) NOT NULL,
  `NombreCuentadante` varchar(30) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Celular` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cuentadante`
--

INSERT INTO `cuentadante` (`CuentadanteID`, `Documento`, `NombreCuentadante`, `Apellido`, `Correo`, `Celular`) VALUES
(3, '1', 'pepito', 'marinez', 'pepitopereZ@hotmail.com', '123456789'),
(5, '1001', 'PRUEVA', 'PRUEVA', 'PRUEVA@PRUEVA', '00000'),
(6, '1002', 'PRUEVA', 'PRUEVA', 'PRUEVA@PRUEVA', '00000'),
(8, '1003', 'PRUEVA', 'PRUEVA', 'PRUEVA@PRUEVA', '00000'),
(21, '1', '1212', '1212', '1212', '1212'),
(22, '1212', '1212', '12121', '21212', '121212');

-- --------------------------------------------------------

--
-- Table structure for table `equipo`
--

CREATE TABLE `equipo` (
  `EquipoID` int(11) NOT NULL,
  `Serial` varchar(30) NOT NULL,
  `Marca` varchar(30) NOT NULL,
  `Modelo` varchar(30) NOT NULL,
  `Tipo` varchar(30) NOT NULL,
  `fecha` date NOT NULL,
  `Garantia` int(11) NOT NULL,
  `Clasificacion` varchar(30) NOT NULL,
  `CuentadanteID` int(11) NOT NULL,
  `UbicacionID` int(11) NOT NULL,
  `ProveedorID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `equipo`
--

INSERT INTO `equipo` (`EquipoID`, `Serial`, `Marca`, `Modelo`, `Tipo`, `fecha`, `Garantia`, `Clasificacion`, `CuentadanteID`, `UbicacionID`, `ProveedorID`) VALUES
(3, '1', '1', '1', '1', '2010-01-01', 1, '1', 3, 11, 1),
(4, '2', '2', '2', '2', '2015-04-12', 2, '2', 3, 12, 2),
(5, '5', '5', '5', '5', '2015-05-05', 5, '5', 3, 14, 2),
(7, '25', 'Asus', '201xd', 'Portatil', '2022-07-25', 25, '+18', 3, 12, 2),
(8, '100', 'HP', '201', 'Escritorio', '2016-07-06', 1, 'nose', 3, 11, 2);

-- --------------------------------------------------------

--
-- Table structure for table `parte`
--

CREATE TABLE `parte` (
  `ParteID` int(11) NOT NULL,
  `Serialparte` varchar(30) NOT NULL,
  `Nombreparte` varchar(30) NOT NULL,
  `Marcaparte` varchar(30) NOT NULL,
  `Modeloparte` varchar(30) NOT NULL,
  `Descripcionparte` varchar(30) NOT NULL,
  `FechaCompraparte` date NOT NULL,
  `Garantiaparte` int(11) NOT NULL,
  `EquipoID` int(11) NOT NULL,
  `ProveedorID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parte`
--

INSERT INTO `parte` (`ParteID`, `Serialparte`, `Nombreparte`, `Marcaparte`, `Modeloparte`, `Descripcionparte`, `FechaCompraparte`, `Garantiaparte`, `EquipoID`, `ProveedorID`) VALUES
(3, '1', 'Vanessa', 'Sanabria', 'Alvarez', 'LA mas HERMOSA', '2010-02-10', 1000, 8, 6);

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `ProveedorID` int(11) NOT NULL,
  `Nit` varchar(30) NOT NULL,
  `RazonSocial` varchar(30) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `Telefono` varchar(30) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`ProveedorID`, `Nit`, `RazonSocial`, `Direccion`, `Telefono`, `Email`) VALUES
(1, '1', 'aaaaaaa', 'call59#25-35', '3136156654', 'a@gmail.com'),
(2, '2', 'bbbbbb', 'bbbbb', 'bbbb', 'bbbbb'),
(6, '100', 'Chopper', 'carrera21#59-6', '614646954', 'chopper@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `software`
--

CREATE TABLE `software` (
  `SoftwareID` int(11) NOT NULL,
  `NombreSoftware` varchar(30) NOT NULL,
  `VersioSoftware` varchar(30) NOT NULL,
  `InstalationKEYSoftware` varchar(30) NOT NULL,
  `CantLicencias` int(11) NOT NULL,
  `VigenciaSoftware` date NOT NULL,
  `EquipoID` int(11) NOT NULL,
  `ProveedorID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `software`
--

INSERT INTO `software` (`SoftwareID`, `NombreSoftware`, `VersioSoftware`, `InstalationKEYSoftware`, `CantLicencias`, `VigenciaSoftware`, `EquipoID`, `ProveedorID`) VALUES
(1, 'Leagueoflegends', '2010', 'jajajaj', 2, '2016-05-05', 5, 6);

-- --------------------------------------------------------

--
-- Table structure for table `ubicacion`
--

CREATE TABLE `ubicacion` (
  `UbicacionID` int(11) NOT NULL,
  `NombreUbicacion` varchar(30) NOT NULL,
  `Descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ubicacion`
--

INSERT INTO `ubicacion` (`UbicacionID`, `NombreUbicacion`, `Descripcion`) VALUES
(11, 'Esteban', 'elmenor'),
(12, 'Alejandro', 'jajajajjaja'),
(14, '1', '1'),
(15, 'Esteban ', 'la verga '),
(19, 'PUREVA', 'PRUEVA'),
(26, '1001', 'PRUEVB'),
(27, '1001', 'PRUEVB'),
(31, 'PEPITO', 'PEPE');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cuentadante`
--
ALTER TABLE `cuentadante`
  ADD PRIMARY KEY (`CuentadanteID`);

--
-- Indexes for table `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`EquipoID`),
  ADD KEY `CuentadanteID` (`CuentadanteID`),
  ADD KEY `UbicacionID` (`UbicacionID`),
  ADD KEY `ProveedorID` (`ProveedorID`);

--
-- Indexes for table `parte`
--
ALTER TABLE `parte`
  ADD PRIMARY KEY (`ParteID`),
  ADD KEY `EquipoID` (`EquipoID`),
  ADD KEY `ProveedorID` (`ProveedorID`);

--
-- Indexes for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`ProveedorID`);

--
-- Indexes for table `software`
--
ALTER TABLE `software`
  ADD PRIMARY KEY (`SoftwareID`),
  ADD KEY `EquipoID` (`EquipoID`),
  ADD KEY `ProveedorID` (`ProveedorID`);

--
-- Indexes for table `ubicacion`
--
ALTER TABLE `ubicacion`
  ADD PRIMARY KEY (`UbicacionID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cuentadante`
--
ALTER TABLE `cuentadante`
  MODIFY `CuentadanteID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `equipo`
--
ALTER TABLE `equipo`
  MODIFY `EquipoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `parte`
--
ALTER TABLE `parte`
  MODIFY `ParteID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `ProveedorID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `software`
--
ALTER TABLE `software`
  MODIFY `SoftwareID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `ubicacion`
--
ALTER TABLE `ubicacion`
  MODIFY `UbicacionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `equipo_ibfk_1` FOREIGN KEY (`CuentadanteID`) REFERENCES `cuentadante` (`CuentadanteID`),
  ADD CONSTRAINT `equipo_ibfk_2` FOREIGN KEY (`UbicacionID`) REFERENCES `ubicacion` (`UbicacionID`),
  ADD CONSTRAINT `equipo_ibfk_3` FOREIGN KEY (`ProveedorID`) REFERENCES `proveedor` (`ProveedorID`);

--
-- Constraints for table `parte`
--
ALTER TABLE `parte`
  ADD CONSTRAINT `parte_ibfk_1` FOREIGN KEY (`EquipoID`) REFERENCES `equipo` (`EquipoID`),
  ADD CONSTRAINT `parte_ibfk_2` FOREIGN KEY (`ProveedorID`) REFERENCES `proveedor` (`ProveedorID`);

--
-- Constraints for table `software`
--
ALTER TABLE `software`
  ADD CONSTRAINT `software_ibfk_1` FOREIGN KEY (`EquipoID`) REFERENCES `equipo` (`EquipoID`),
  ADD CONSTRAINT `software_ibfk_2` FOREIGN KEY (`ProveedorID`) REFERENCES `proveedor` (`ProveedorID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
