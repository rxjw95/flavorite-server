drop table if exists users;

create table users
(
    id        varchar(255) not null,
    email     varchar(255),
    join_date datetime(6),
    password  varchar(255),
    user_id   varchar(255),
    primary key (id),
    unique key id_unique (user_id)
);