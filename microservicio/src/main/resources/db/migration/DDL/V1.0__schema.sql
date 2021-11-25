create table usuario (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 clave varchar(45) not null,
 fecha_creacion datetime null,
 primary key (id)
);


create table tipo(
    id int(11) not null auto_increment,
    definicion varchar(100) not null,
    cantPersonasMax int(11) not null,
    primary  key (id)

);

create table glamping(
     id int(11) not null auto_increment,
     idTipoGlamping int(11) not null,
     descripcion varchar(300) NOT NULL,
     precio double NOT NULL,
     estado int NOT NULL,
     PRIMARY KEY(id),
     FOREIGN KEY(idTipoGlamping)
         REFERENCES tipo(id)
         ON DELETE CASCADE
         ON UPDATE CASCADE

);

CREATE TABLE reserva (
     id int(11) not null auto_increment,
     idGlamping int(11) not null,
     cedula varchar(11) not null,
     nombre varchar(100) not null,
     fechaEntrada date not null,
     fechaSalida date not null,
     cantPersonas int not null,
     telefono varchar(20) not null,
     costoTotal double not null,
     fechaRegistro datetime not null,
     PRIMARY KEY(id),
     FOREIGN KEY(idGlamping)
         REFERENCES glamping(id)
         ON DELETE CASCADE
         ON UPDATE CASCADE
);

insert into usuario(id,nombre,clave,fecha_creacion) values(1,'test','1234',now());
insert into tipo(id,definicion,cantPersonasMax) values(1,'familiar',6);
insert into glamping(id,idTipoGlamping,descripcion,precio,estado) values(1,1,'Cabaña amoblada para una familia, wifi, recreacion y una tina grande con agua caliente',500000,0);
insert into reserva(id,idGlamping,cedula,nombre,fechaEntrada,fechaSalida,cantPersonas,telefono,costoTotal,fechaRegistro) values(1,1,'1116275325','Sebastian Giron', '2021-10-25','2021-10-30',5,'3053198749',358678,now());

insert into tipo(id,definicion,cantPersonasMax) values(2,'pareja',2);
insert into glamping(id,idTipoGlamping,descripcion,precio,estado) values(2,2,'Cabaña amoblada para una pareja, wifi, recreacion y una tina pequeña con agua caliente',100000,0);
insert into reserva(id,idGlamping,cedula,nombre,fechaEntrada,fechaSalida,cantPersonas,telefono,costoTotal,fechaRegistro) values(2,2,'1116895378','Dahiana reyes', '2021-11-02','2021-11-04',5,'3104528812',150000,now());

