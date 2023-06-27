package com.mycode.designpatternscreationalobjectpool.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
    private boolean inUse = false;
    private String firstName;
    private String lastName;

    public Student(boolean inUse) {
        this.inUse = inUse;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void clear() {
        this.firstName = null;
        this.lastName = null;
    }
}
