package com.company;

import java.util.Objects;

public class Student {
    int id;
    String name;
    int gradesBySubject;

    public Student(int id, String name, int gradesBySubject) {
        this.id = id;
        this.name = name;
        this.gradesBySubject = gradesBySubject;
    }

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

    public int getGradesBySubject() {
        return gradesBySubject;
    }

    public void setGradesBySubject(int gradesBySubject) {
        this.gradesBySubject = gradesBySubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && gradesBySubject == student.gradesBySubject && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gradesBySubject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gradesBySubject=" + gradesBySubject +
                '}';
    }
}
