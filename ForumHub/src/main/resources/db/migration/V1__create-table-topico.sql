create table topico(

                        id bigint not null auto_increment,
                        titulo varchar(100) not null,
                        mensagem varchar(100) not null unique,
                        dt_criacao varchar(100) not null,
                        estado_topico varchar(100) not null,
                        autor varchar(100) not null,
                        curso varchar(100),

                        primary key(id)

);