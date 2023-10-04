CREATE SCHEMA `bd_productospedidos` ;

CREATE TABLE `bd_productospedidos`.`productos` (
  `codigo_producto` INT NOT NULL,
  `producto` VARCHAR(45) NOT NULL,
  `precio_unitario` DOUBLE NOT NULL,
  `stock` INT NOT NULL,
  PRIMARY KEY (`codigo_producto`),
  UNIQUE INDEX `codigo_producto_UNIQUE` (`codigo_producto` ASC) VISIBLE);


  CREATE TABLE `bd_productospedidos`.`pedidos` (
  `id_pedido` INT NOT NULL,
  `codigo_producto` INT NOT NULL,
  `unidades` INT NOT NULL,
  `total` DOUBLE NOT NULL,
  `fecha` DATETIME NULL,
  PRIMARY KEY (`id_pedido`),
  UNIQUE INDEX `id_pedido_UNIQUE` (`idPedido` ASC) VISIBLE);


ALTER TABLE `bd_productospedidos`.`pedidos` 
ADD CONSTRAINT `codigo_producto`
  FOREIGN KEY (`idPedido`)
  REFERENCES `bd_productospedidos`.`productos` (`codigo_producto`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
