create table usuario (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 clave varchar(45) not null,
 fecha_creacion datetime null,
 primary key (id)
);


create table tipo_glamping(
    id int(11) not null auto_increment,
    tipo varchar(100) not null,
    cant_personas_max int(11) not null,
    primary  key (id)

);

create table glamping(
     id int(11) not null auto_increment,
     idtipo_glamping int(11) not null,
     descripcion varchar(300) NOT NULL,
     precio double NOT NULL,
     estado int NOT NULL,
     PRIMARY KEY(id),
     FOREIGN KEY(idtipo_glamping)
         REFERENCES tipo_glamping(id)
         ON DELETE CASCADE
         ON UPDATE CASCADE

);

CREATE TABLE reserva (
     id int(11) not null auto_increment,
     id_glamping int(11) not null,
     cedula varchar(11) not null,
     nombre varchar(100) not null,
     fecha_entrada date not null,
     fecha_salida date not null,
     cant_personas int not null,
     telefono varchar(20) not null,
     costoTotal double not null,
     fecha_registro datetime not null,
     PRIMARY KEY(id),
     FOREIGN KEY(id_glamping)
         REFERENCES glamping(id)
         ON DELETE CASCADE
         ON UPDATE CASCADE
);

