create table IF NOT EXISTS notification(
    id serial primary key not null,
    description varchar(2000)
);

comment on table notification is '������� �����������';
comment on column notification.id is '������������� �����������';
comment on column notification.description is '���������� �����������';