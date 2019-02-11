DROP DATABASE IF EXISTS RabbitClient;

create database RabbitClient;

use RabbitClient;
create table Clients(clientUser varchar(60) primary key,passhash varchar(260));
//Create procedures to use for app