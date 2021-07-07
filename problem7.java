//CREATE TABLE students (
//        student_id varchar2(20) NOT NULL,
//        first_name varchar2(20) NOT NULL,
//        last_name varchar2(20) NOT NULL,
//        grade number NOT NULL,
//        gender varchar2(2) NOT NULL
//        );
//        CREATE TABLE teachers (
//        teacher_id varchar2(20) NOT NULL,
//        first_name varchar2(20) NOT NULL,
//        last_name varchar2(20) NOT NULL,
//        subject varchar2(20) NOT NULL,
//        gender varchar2(2) NOT NULL
//        );
//
//        insert into students values ('1','Giorgi', 'a', 12, 'M');
//        insert into students values ('2','Giorgi', 'b', 11, 'M');
//        insert into students values ('3','Nika', 'c', 10, 'F');
//        insert into students values ('4','Nini', 'a', 9, 'F');
//        insert into students values ('5','Luka', 'a', 7, 'F');
//
//        insert into teachers values ('1','AA', 'B', 'Mathematics', 'F');
//        insert into teachers values ('2','BB', 'L', 'Physics', 'M');
//        insert into teachers values ('3','CC', 'B', 'Literature', 'M');
//        insert into teachers values ('4','DD', 'K', 'History', 'F');
//        insert into teachers values ('5','EE', 'B', 'Biology', 'F');
//
//        CREATE Sequence s
//        START WITH 1
//        INCREMENT BY 1
//        MINVALUE 1
//        MAXVALUE 1000
//        NOCYCLE ;
//
//        CREATE TABLE join_table (
//        student_teacher_id varchar2(20) NOT NULL,
//        student_id varchar2(20) NOT NULL,
//        teacher_id varchar2(20) NOT NULL,
//        constraints stud_teach_id_pk primary key (student_teacher_id),
//        constraints teachch_id_fk foreign key (teacher_id)  REFERENCES teachers (teacher_id),
//        constraints sstud_id_fk foreign key (student_id)  REFERENCES students (student_id)
//        );
//
//        select * from teacher_ids;
//        select * from student_ids;
//        insert into student_teacher_table values (s.nextval, '2', '5');
//        insert into student_teacher_table values (s.nextval, '2', '4');
//        insert into student_teacher_table values (s.nextval, '1', '5');
//        insert into student_teacher_table values (s.nextval, '5', '5');
//
//        Select t.first_name,
//        t.last_name,
//        t.gender,
//        t.subject
//        from teacher_ids t
//        join join_table j on j.teacher_id = t.teacher_id
//        join student_ids s on j.student_id = s.student_id
//        where s.first_name = 'Giorgi';