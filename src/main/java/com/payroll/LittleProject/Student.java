package com.payroll.LittleProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    public String id;

    public String name;

    public String surName;

    public int age;

    public String email;

    public Student(String id, String name, String surName, int age, String email) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
