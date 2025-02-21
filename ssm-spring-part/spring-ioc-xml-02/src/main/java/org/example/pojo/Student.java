package org.example.pojo;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String classes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    @Override
    public String toString() {
        return "Student [id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", class=" + classes +
                "]";
    }
}
