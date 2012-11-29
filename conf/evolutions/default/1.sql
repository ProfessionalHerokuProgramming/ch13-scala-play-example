# --- First database schema

# --- !Ups

create sequence s_employee_id;

create table employee (
    id    bigint,
    name  varchar(100),
    email varchar(255)
);

INSERT INTO employee (id, name, email) VALUES
    ('9664', 'Janice Wong', 'jwong@vandelayenterprises.com'),
    ('5634', 'Justin Sit', 'jsit@vandelayenterprises.com'),
    ('0580', 'Kyle Shantz', 'southern@vandelayenterprises.com');

# --- !Downs

drop table employee;
drop sequence s_employee_id;