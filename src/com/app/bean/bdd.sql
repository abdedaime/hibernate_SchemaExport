
    alter table employe 
        drop 
        foreign key FK_9fdvxlggqd68wj39acllgoe5m

    drop table if exists departement

    drop table if exists employe

    create table departement (
        id_depart varchar(255) not null,
        primary key (id_depart)
    )

    create table employe (
        id integer not null auto_increment,
        nom varchar(255),
        prenom varchar(255),
        departement varchar(255),
        primary key (id)
    )

    alter table employe 
        add constraint FK_9fdvxlggqd68wj39acllgoe5m 
        foreign key (departement) 
        references departement (id_depart)
