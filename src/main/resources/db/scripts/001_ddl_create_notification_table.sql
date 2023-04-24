create table IF NOT EXISTS notification(
    id serial primary key not null,
    description varchar(2000)
);