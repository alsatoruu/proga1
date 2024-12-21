create database shop;
use shop;
create table Продукты (
id int auto_increment primary key,
Название varchar(30)not null,
Цена decimal(10, 2) not null,
Наличие int not null
);
insert into Продукты (Название, Цена, Наличие)
value
('Мандарин', 150.00, 60),
('Апельсин', 250.00, 15),
('Грейпфрут', 230.00, 25);
select * from Продукты where Цена < 50;

create table Заказы (
id int auto_increment primary key,
id_продукта int,
Количество int not null,
Дата_заказа date not null,
foreign key (id_продукта) references Продукты(id)
);
insert into Заказы (id_продукта, Количество, Дата_заказа)
value
(1, 9, '2024-01-07'),
(2, 7, '2024-01-11'),
(3, 4, '2024-01-08');
select * from Заказы where Дата_заказа < '2024-01-01';
update Заказы set Количество = 3 where id = 1;
drop database shop;
