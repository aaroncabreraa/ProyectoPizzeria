-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 23-05-2021 a las 21:39:37
-- Versión del servidor: 10.3.27-MariaDB-0+deb10u1
-- Versión de PHP: 7.3.27-1~deb10u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `RM64`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`Admin`@`localhost` PROCEDURE `buscarAdm` (IN `buscar` CHAR(20)) SELECT 
  * 
FROM 
  Administrador 
WHERE 
  nombre LIKE buscar$$

CREATE DEFINER=`Admin`@`localhost` PROCEDURE `buscarBoleta` (IN `buscar` CHAR(20)) SELECT
  *
FROM
  Boleta
WHERE
  nombre LIKE buscar$$

CREATE DEFINER=`Admin`@`localhost` PROCEDURE `buscarCliente` (`buscar` CHAR(20))  SELECT
  *
FROM
  clientes
WHERE
  nombre LIKE buscar$$

CREATE DEFINER=`Admin`@`localhost` PROCEDURE `buscarFactura` (IN `buscar` CHAR(20))  SELECT
  *
FROM
  Factura
WHERE
  nombre LIKE buscar$$

CREATE DEFINER=`Admin`@`localhost` PROCEDURE `buscarMesero` (`buscar` CHAR(20))  SELECT
  *
FROM
  mesero
WHERE
  nombre LIKE buscar$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Administrador`
--

CREATE TABLE `Administrador` (
  `idadministrador` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `contraseña` longblob NOT NULL,
  `username` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Administrador`
--

INSERT INTO `Administrador` (`idadministrador`, `nombre`, `telefono`, `mail`, `contraseña`, `username`) VALUES
(1, 'Cristopher Colunga', '81818181', 'criscol@gmail.com', 0x61646d696e, 'cristocolung'),
(2, 'Aaron Cabrera', '98562358', 'aaronc@gmail.com', 0x61646d696e, 'eiruonc'),
(3, 'Ramon Zapata', '982365895', 'ramzap@gmail.com', 0x61646d696e, 'ramonzap'),
(4, 'Manuel Rey', '62356', 'manuel@gmail.com', 0x61646d696e, 'manueladm'),
(5, 'Alejandro Martinez', '4523453', 'alejandro@gmail.com', 0x61646d696e, 'alexadm');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bebidas`
--

CREATE TABLE `bebidas` (
  `idbebidas` int(11) NOT NULL,
  `nombreBebida` varchar(45) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bebidas`
--

INSERT INTO `bebidas` (`idbebidas`, `nombreBebida`, `precio`) VALUES
(1, 'JUGO NARANJA', 20),
(2, 'JUGO MANZANA', 15),
(3, 'JUGO UVA', 15),
(4, 'REFRESCO INDIVIDUAL', 3),
(5, 'REFRESCO 2LTS', 8),
(6, 'AGUA SABOR', 25),
(7, 'AGUA NATURAL', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bebida_pedido`
--

CREATE TABLE `bebida_pedido` (
  `idbebida_pedido` int(11) NOT NULL,
  `nombreBebida` varchar(45) NOT NULL,
  `cantidadBebida` int(11) NOT NULL,
  `precioBebida` double NOT NULL,
  `montoBebida` double NOT NULL,
  `idbebidas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bebida_pedido`
--

INSERT INTO `bebida_pedido` (`idbebida_pedido`, `nombreBebida`, `cantidadBebida`, `precioBebida`, `montoBebida`, `idbebidas`) VALUES
(1, 'JUGO DE MANZANA', 6, 15, 90, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Boleta`
--

CREATE TABLE `Boleta` (
  `idboleta` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `telefono` varchar(10) NOT NULL,
  `atendidoPor` varchar(50) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `subTotal` double NOT NULL,
  `igv` double NOT NULL,
  `montoTotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Boleta`
--

INSERT INTO `Boleta` (`idboleta`, `nombre`, `dni`, `telefono`, `atendidoPor`, `fecha`, `subTotal`, `igv`, `montoTotal`) VALUES
(27, 'nsdnsd', '452435', '5346526', 'Prueba', '22-05-2021', 90, 16.2, 106.2),
(29, 'Manuel Rey', '3241', '8811881', 'Aaron Cabrera', '22-05-2021', 300, 54, 354);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idclientes` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `dni` varchar(8) DEFAULT NULL,
  `ruc` varchar(11) DEFAULT NULL,
  `telefono` varchar(11) NOT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `ciudad` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idclientes`, `nombre`, `dni`, `ruc`, `telefono`, `correo`, `ciudad`) VALUES
(1, 'Maria Benites', '00000000', '10754578975', '976749582', 'Maria@gmail.com', 'Sullana'),
(3, 'Andre Risco', '72458598', '00000000000', '975862358', 'Sin especificar', 'Sin especificar'),
(4, 'Gustavo Canova', '72457239', '00000000000', '989856685', 'Sin especificar', 'Sin especificar'),
(5, 'Sebastian Alvarado', '03658956', '00000000000', '978523654', 'Sin especificar', 'Sin especificar'),
(6, 'Carlos Benites', '75896325', '00000000000', '985624156', 'Sin especificar', 'Sin especificar'),
(7, 'Juana Avila', '00000000', '10256585425', '975865235', 'juana@gmail.com', 'Sullana'),
(8, 'Pepe Ojeda', '00000000', '13216546545', '976568652', 'pepe@gmail.com', 'Piura'),
(32, 'dfsdf', '00000000', '2342', '54352', 'grrarg', 'mty');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Factura`
--

CREATE TABLE `Factura` (
  `idfactura` int(11) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `montoTotal` double NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `ruc` varchar(11) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `subTotal` double NOT NULL,
  `atendidoPor` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Factura`
--

INSERT INTO `Factura` (`idfactura`, `fecha`, `montoTotal`, `ciudad`, `ruc`, `correo`, `nombre`, `telefono`, `subTotal`, `atendidoPor`) VALUES
(1, '17-07-2019', 120.36, 'Monterrey', '10256585425', 'juana@gmail.com', 'Juana Avila', '975865235', 102, 'Aaron Cabrera'),
(26, '25-05-2021', 283.2, 'mty', '2342', 'grrarg', 'dfsdf', '54352', 240, 'Aaron Cabrera');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `idmesero` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `contraseña` longblob NOT NULL,
  `userName` varchar(45) NOT NULL,
  `numeroMesero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`idmesero`, `nombre`, `telefono`, `mail`, `contraseña`, `userName`, `numeroMesero`) VALUES
(1, 'Aaron Cabrera', '985623658', 'aaron@gmail.com', 0x6d657365726f, 'aaronmsr', 1),
(2, 'Manuel Rey', '978568953', 'manuel@gmail.com', 0x6d657365726f, 'manuelmsr', 2),
(3, 'Texto Ejemplo', '975856325', 'ejemplo@gmail.com', 0x6e657365726f, 'ejemplomsr', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idpedido` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double NOT NULL,
  `Monto` double NOT NULL,
  `numeropedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `platos`
--

CREATE TABLE `platos` (
  `idplatos` int(11) NOT NULL,
  `nombrePlato` varchar(45) NOT NULL,
  `precio` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `platos`
--

INSERT INTO `platos` (`idplatos`, `nombrePlato`, `precio`) VALUES
(1, 'PIZZA HAWAIANA', '100'),
(2, 'PIZZA PEPERONI', '70'),
(3, 'PIZZA CHAMPIÑONES', '120'),
(4, 'PIZZA SUPREMA', '150'),
(5, 'PIZZA DE QUESO', '90'),
(6, 'PIZZA CARNES FRIAS', '150'),
(7, 'PIZZA ORILLA RELLENA DE QUESO', '130'),
(8, 'PIZZA PEPERONI CON CHAMPIÑONES', '120');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plato_pedido`
--

CREATE TABLE `plato_pedido` (
  `idplato_pedido` int(11) NOT NULL,
  `nombrePlato` varchar(45) NOT NULL,
  `idplatos` int(11) DEFAULT NULL,
  `cantidadPlato` int(11) NOT NULL,
  `precioPlato` double NOT NULL,
  `montoPlato` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `plato_pedido`
--

INSERT INTO `plato_pedido` (`idplato_pedido`, `nombrePlato`, `idplatos`, `cantidadPlato`, `precioPlato`, `montoPlato`) VALUES
(1, 'PIZZA DE PEPERONI', NULL, 3, 70, 210);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `contraseña` longblob NOT NULL,
  `tipoNivel` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `userName`, `contraseña`, `tipoNivel`, `mail`, `telefono`, `nombre`) VALUES
(1, 'cristoadm', 0x61646d696e, 'Administrador', 'cristopher@gmail.com', '976747953', 'Cristopher Colunga'),
(2, 'aaronadm', 0x61646d696e, 'Administrador', 'aaron@gmail.com', '976747953', 'Aaron Cabrera'),
(3, 'ramonadm', 0x61646d696e, 'Administrador', 'ramon@gmail.com', '98562358', 'Ramon Zapata'),
(4, 'alexadm', 0x61646d696e, 'Administrador', 'alejandro@gmail.com', '982365895', 'Alejandro Martinez'),
(5, 'aaronmsr', 0x6d657365726f, 'Mesero', 'aaron@gmail.com', '985623658', 'Aaron Cabrera'),
(6, 'manuelmsr', 0x6d657365726f, 'Mesero', 'manuel@gmail.com', '978568953', 'Manuel Rey'),
(7, 'ejemplomsr', 0x6e657365726f, 'Mesero', 'ejemplo@gmail.com', '975856325', 'Texto Ejemplo'),
(8, 'manueladm', 0x61646d696e, 'Administrador', 'manuel@gmail.com', '62356', 'Manuel Rey'),
(9, 'alexadm', 0x61646d696e, 'Administrador', 'alejandro@gmail.com', '4523453', 'Alejandro Martinez');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Administrador`
--
ALTER TABLE `Administrador`
  ADD PRIMARY KEY (`idadministrador`);

--
-- Indices de la tabla `bebidas`
--
ALTER TABLE `bebidas`
  ADD PRIMARY KEY (`idbebidas`);

--
-- Indices de la tabla `bebida_pedido`
--
ALTER TABLE `bebida_pedido`
  ADD PRIMARY KEY (`idbebida_pedido`),
  ADD KEY `idbebidas` (`idbebidas`);

--
-- Indices de la tabla `Boleta`
--
ALTER TABLE `Boleta`
  ADD PRIMARY KEY (`idboleta`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idclientes`);

--
-- Indices de la tabla `Factura`
--
ALTER TABLE `Factura`
  ADD PRIMARY KEY (`idfactura`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`idmesero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idpedido`);

--
-- Indices de la tabla `platos`
--
ALTER TABLE `platos`
  ADD PRIMARY KEY (`idplatos`);

--
-- Indices de la tabla `plato_pedido`
--
ALTER TABLE `plato_pedido`
  ADD PRIMARY KEY (`idplato_pedido`),
  ADD KEY `idPlatos` (`idplatos`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Administrador`
--
ALTER TABLE `Administrador`
  MODIFY `idadministrador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `bebidas`
--
ALTER TABLE `bebidas`
  MODIFY `idbebidas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `bebida_pedido`
--
ALTER TABLE `bebida_pedido`
  MODIFY `idbebida_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `Boleta`
--
ALTER TABLE `Boleta`
  MODIFY `idboleta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idclientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `Factura`
--
ALTER TABLE `Factura`
  MODIFY `idfactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `idmesero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idpedido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `platos`
--
ALTER TABLE `platos`
  MODIFY `idplatos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `plato_pedido`
--
ALTER TABLE `plato_pedido`
  MODIFY `idplato_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bebida_pedido`
--
ALTER TABLE `bebida_pedido`
  ADD CONSTRAINT `idbebidas` FOREIGN KEY (`idbebidas`) REFERENCES `bebidas` (`idbebidas`);

--
-- Filtros para la tabla `plato_pedido`
--
ALTER TABLE `plato_pedido`
  ADD CONSTRAINT `idPlatos` FOREIGN KEY (`idplatos`) REFERENCES `platos` (`idplatos`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
