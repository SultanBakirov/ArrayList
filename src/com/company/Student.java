package com.company;

public class Student {
    private String name;
    private int age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (age <= 0) {
                throw new Exception();
            }
                this.age = age;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
