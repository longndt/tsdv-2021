create database web_db;

use web_db;

create table categories (
	category_id int auto_increment,
    category_name varchar(50) not null,
    constraint categories_pk primary key (category_id)
);
create table category_detail (
	category_detail_id int auto_increment,
    category_code varchar(10) unique not null,
    category_description varchar(100) not null,
    category_id int,
    constraint category_detail_pk primary key (category_detail_id, category_code),
    constraint category_detail_fk foreign key (category_id)
		references categories (category_id)
		on delete cascade
        on update cascade
);
create table products (
	product_id int auto_increment,
    product_name varchar(50) not null,
    category_id int,
    constraint product_pk primary key (product_id),
    constraint product_fk foreign key (category_id)
		references categories (category_id)
        on delete cascade
        on update cascade
);
create table product_detail (
	product_detail_id int auto_increment,
    product_code varchar(10) unique not null,
    product_quantity int not null,
    product_price decimal(6,2) not null,
    product_date date not null,
    product_description text,
    product_id int,
    constraint product_detail_pk primary key (product_detail_id, product_code),
    constraint product_detail_fk foreign key (product_id)
		references products (product_id)
        on delete cascade
        on update cascade
);
create table customers (
	customer_id int auto_increment,
    customer_username varchar(20) unique not null,
    customer_password varchar(100) not null,
    constraint customers_pk primary key (customer_id)
);
create table customer_detail (
	customer_detail_id int auto_increment,
    customer_fullname varchar(50) not null,
    customer_mobile varchar(10) unique not null,
    customer_email varchar(20) unique not null,
    customer_address varchar(50),
    customer_id int,
    constraint customer_detail_pk primary key (customer_detail_id),
    constraint customer_detail_fk foreign key (customer_id)
		references customers (customer_id)
        on delete cascade
        on update cascade
);
create table orders (
	order_id int auto_increment,
    customer_id int,
    product_id int,
    constraint orders_pk primary key (order_id),
    constraint orders_fk1 foreign key (customer_id)
		references customers (customer_id)
        on delete cascade
        on update cascade,
    constraint orders_fk2 foreign key (product_id)
		references products (product_id)
        on delete cascade
        on update cascade
);
create table order_detail (
	order_detail_id int auto_increment,
    order_datetime datetime not null,
	order_quantity int not null,
    order_totalprice decimal (6,2),
    order_address varchar (50),
    order_note varchar (50),
    order_id int,
    constraint order_detail_pk primary key (order_detail_id),
    constraint order_detail_fk foreign key (order_id)
		references orders (order_id)
        on delete cascade
        on update cascade
);
