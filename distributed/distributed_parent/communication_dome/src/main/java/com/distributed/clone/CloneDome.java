package com.distributed.clone;

import java.io.IOException;

public class CloneDome {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Teacher teacher = new Teacher();
        teacher.setName("孙老师");

        Student student1 = new Student();
        student1.setName("陈国库");
        student1.setAge(24);
        student1.setTeacher(teacher);
        System.out.println(student1);

        Student student2 = (Student) student1.deepClone();
        student2.getTeacher().setName("郭老师");
        System.out.println(student2);

    }

}
