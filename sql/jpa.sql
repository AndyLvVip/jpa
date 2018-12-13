create table user( id bigint not null auto_increment, first_name varchar(50) not null, last_name varchar(50) not null, address_id bigint, primary key(id) ) engine = InnoDB, charset = utf8;

create table address( id bigint not null auto_increment, province vchar(20) not null, city vchar(20) not null, area vchar(20) not null, primary key(id) ) engine = InnoDB, charset = utf8;