create table usuario(

                        id bigint not null auto_increment,
                        usuario varchar(100) not null,
                        senha varchar(100) not null unique,

                        primary key(id)

);