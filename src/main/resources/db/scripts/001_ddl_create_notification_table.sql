create table IF NOT EXISTS notification(
    id serial primary key not null,
    description varchar(2000)
);

comment on table notification is 'Таблица уведомлений';
comment on column notification.id is 'Идентификатор уведомления';
comment on column notification.description is 'Содержание уведомления';