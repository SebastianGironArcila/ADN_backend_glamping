insert into usuario(id,nombre,clave,fecha_creacion) values(1,'test','1234',now());
insert into tipo_glamping(id,tipo,cant_personas_max) values(1,'familiar',6);
insert into glamping(id,idtipo_glamping,descripcion,precio,estado) values(1,1,'Cabaña amoblada para una familia, wifi, recreacion y una tina con agua caliente',100000,0);
insert into reserva(id,id_glamping,cedula,nombre,fecha_entrada,fecha_salida,cant_personas,telefono,costoTotal,fecha_registro) values(1,1,'1116275325','Sebastian Giron', '2021-10-25','2021-11-25',5,'3053198749',358678,now())
