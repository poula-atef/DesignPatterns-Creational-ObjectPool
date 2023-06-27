package com.mycode.designpatternscreationalobjectpool.pools;

import com.mycode.designpatternscreationalobjectpool.entities.Student;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentPool {

    private static final List<Student> studentsPool = new ArrayList<>();


    public static Student acquireStudent() {
        // loop over all of our existing objects to find first nonUsed object
        for (Student student : studentsPool) {
            if (!student.isInUse()) {
                student.clear();
                student.setInUse(true);
                System.out.println("StudentPool: Reuse Student With Reference " + getObjectReference(student));
                return student;
            }
        }
        // if all object we have are in use wo we create another one
        // and add it to our pool
        Student newStudent = new Student(true);
        studentsPool.add(newStudent);
        System.out.println("StudentPool: Create New Student With Reference " + getObjectReference(newStudent));
        return newStudent;
    }

    public static void releaseStudent(Student st) {
        for (Student student : studentsPool) {
            // same reference (they are the same object)
            if (student == st) {
                student.setInUse(false);
                System.out.println("StudentPool: Release Student With Reference " + getObjectReference(student));
                return;
            }
        }
    }

    private static String getObjectReference(Student student) {
        String[] arr = ObjectUtils.identityToString(student).split("\\.");
        return arr[arr.length - 1];
    }

}
