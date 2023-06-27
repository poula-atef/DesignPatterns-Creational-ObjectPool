package com.mycode.designpatternscreationalobjectpool;

import com.mycode.designpatternscreationalobjectpool.entities.Student;
import com.mycode.designpatternscreationalobjectpool.pools.StudentPool;

public class ObjectPoolDesignPattern {

    public static void main(String[] args) {

        Student student1 =  StudentPool.acquireStudent(); // one student is added to student pool
        Student student2 =  StudentPool.acquireStudent(); // one student is added to student pool

        StudentPool.releaseStudent(student1); // first student is released

        Student student3 =  StudentPool.acquireStudent(); // pool already has one empty student (student1)
        Student student4 =  StudentPool.acquireStudent(); // one student is added to student pool

        StudentPool.releaseStudent(student3); // first student is released

        Student student5 =  StudentPool.acquireStudent(); // pool already has one empty student (student3)

    }
}
