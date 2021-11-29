create database student_db;
use student_db;
create table class (
	class_id int auto_increment,
    class_name varchar(50) unique not null
               check (length(class_name >=5) and length(class_name <=50)),
	constraint class_pk primary key (class_id)
);
create table student (
	student_id int auto_increment,
    student_code int unique,
    student_name varchar(30) not null 
                 check (length(student_name >=5) and length(student_name <=50)),
	class_id int,
    constraint student_pk primary key (student_id),
    constraint student_fk foreign key (class_id) references class (class_id)
			   on delete cascade
               on update set null
);
create table student_detail (
	student_detail_id int auto_increment,
    student_dob date not null
                check (student_dob >= '2003-01-01' and student_dob <= '1998-12-31'),
	student_mobile varchar(10) not null
                check (length(student_mobile) = 10),
	student_age int not null
                default 18
				check (student_age >= 18 and student_age <= 23),
    student_gender varchar(6) not null
                check (student_gender = 'male' or student_gender = 'female'),
	student_grade decimal(2,1) not null
				check (student_grade >= 0 and student_grade <= 10),
    student_nationality varchar(10) not null
                default 'Vietnam',
	student_id int unique,
    constraint student_detail_pk primary key (student_detail_id),
    constraint student_detail_fk foreign key (student_id) references student (student_id)
			    on delete restrict
                on update no action
);
create table course (
	course_id int auto_increment,
    course_code varchar(10) unique not null,
	constraint course_pk primary key (course_id)
);
create table course_detail (
	course_detail_id int auto_increment,
    course_description varchar(50) not null
                       check (length(course_description) >= 10 and length(course_description) <= 50), 
	course_startdate date not null,
    course_enddate date not null,
    course_teacher varchar(10) not null
				   check (length(course_teacher) >= 3 and length(course_teacher) <= 10),
	course_id int unique,
    constraint course_detail_pk primary key (course_detail_id),
    constraint course_detail_fk foreign key (course_id) references course (course_id)
               on delete set null
               on update cascade,
	constraint course_detail_check check (
			   course_startdate < course_enddate
    )
);
create table student_course (
	student_course_id int auto_increment,
    student_id int,
    course_id int,
	constraint student_course_pk primary key (student_course_id),
    constraint student_course_fk1 foreign key (student_id) references student (student_id)
              on delete restrict
              on update no action,
   constraint student_course_fk2 foreign key (course_id) references course (course_id)
              on delete cascade
              on update set null
);