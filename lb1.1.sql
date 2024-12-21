create database contact;
use contact;
create table people (
id integer primary key,
name varchar(30) not null,
surname varchar(30) not null,
mail varchar(30)
);
insert into people (id, name, surname, mail)
value
(1, 'Алиса', 'Артемовна', 'alice@gmail.com'),
(2, 'Милена', 'Александровна', 'bitch@gmail.com'),
(3, 'Артем', 'Алексеевич', 'alex@gamil.com');
select *from people;
select name, surname from people;
update people set mail = 'alice@gmail.com' where id = 1;
delete from people where name = 'Алиса';
drop database contact;
