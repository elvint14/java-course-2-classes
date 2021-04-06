create DATABASE jdbc_project;

create schema jdbc_project;

create table jdbc_project.users
(
    id       serial  not null
        constraint table_name_pk
            primary key,
    username integer not null,
    password integer not null
);

create unique index table_name_username_uindex
    on jdbc_project.users (username);