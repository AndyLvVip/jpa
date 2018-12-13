create table user( id bigint not null auto_increment, first_name varchar(50) not null, last_name varchar(50) not null, address_id bigint, primary key(id) ) engine = InnoDB, charset = utf8;

create table address( id bigint not null auto_increment, province varchar(20) not null, city varchar(20) not null, area varchar(20) not null, primary key(id) ) engine = InnoDB, charset = utf8;