create table user(
	email_id varchar(50),
	password varchar(50),
	primary key(email_id)
	);

create table basic_profile(
	First_name varchar(15),
	last_name varchar(15),
	phone varchar(10),
	email_id varchar(25),
	dob date;
	age Integer,
	visible boolean,
	link varchar(20),
	ID bigint AUTO_INCREMENT,
	primary key(ID)
	);

create table address(
	a_id bigint AUTO_INCREMENT,
	type varchar(20),
	street varchar(10),
	zipcode varchar(6),
	state varchar(10),
	country varchar(20)
	);
create table academic(
	courses varchar(20),
	startofyear varchar(25),
	endofyear varchar(25),
	percentage double,
	)
create table computer_proficiency(
	skills varchar(20),
	tag_id Integer,
	)
create table tag(
	tag_id Integer,
	value varchar(20)
	);
create table project(
 	status varchar(10),
 	title varchar(10),
 	descrpition varchar(50),
 	);
 create table experince(
 	company_name varchar(10),
 	job varchar(10),
 	year_of_experince varchar(15)
 	);
 	
