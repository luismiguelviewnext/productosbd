CREATE SCHEMA `bd_productospedidos` ;

CREATE TABLE `bd_productospedidos`.`productos` (
  `codigoProducto` INT NOT NULL,
  `producto` VARCHAR(45) NOT NULL,
  `precioUnitario` DOUBLE NOT NULL,
  `stock` INT NOT NULL,
  PRIMARY KEY (`codigoProducto`),
  UNIQUE INDEX `codigoProducto_UNIQUE` (`codigoProducto` ASC) VISIBLE);


  CREATE TABLE `bd_productospedidos`.`pedidos` (
  `idPedido` INT NOT NULL,
  `codigoProducto` INT NOT NULL,
  `unidades` INT NOT NULL,
  `total` DOUBLE NOT NULL,
  `fecha` DATETIME NULL,
  PRIMARY KEY (`idPedido`),
  UNIQUE INDEX `idPedido_UNIQUE` (`idPedido` ASC) VISIBLE);


ALTER TABLE `bd_productospedidos`.`pedidos` 
ADD CONSTRAINT `codigoProducto`
  FOREIGN KEY (`idPedido`)
  REFERENCES `bd_productospedidos`.`productos` (`codigoProducto`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
