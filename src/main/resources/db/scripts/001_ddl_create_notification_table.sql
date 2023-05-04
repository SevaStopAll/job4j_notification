create table IF NOT EXISTS notification(
    id serial primary key not null,
    description varchar(2000)
);

comment on table notification is 'Таблица блюд';
comment on column notification.id is 'Идентификатор блюда';
comment on column notification.description is 'Описание блюда';